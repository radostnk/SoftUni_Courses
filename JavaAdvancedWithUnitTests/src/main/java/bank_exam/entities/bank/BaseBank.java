package bank_exam.entities.bank;

import bank_exam.entities.client.Client;
import bank_exam.entities.loan.Loan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static bank_exam.common.ExceptionMessages.BANK_NAME_CANNOT_BE_NULL_OR_EMPTY;
import static bank_exam.common.ExceptionMessages.NOT_ENOUGH_CAPACITY_FOR_CLIENT;

public abstract class BaseBank implements Bank {

    private String name;
    private int capacity;
    private Collection<Loan> loans;
    private Collection<Client> clients;

    public BaseBank(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        this.loans = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(BANK_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    @Override
    public Collection<Client> getClients() {
        return clients;
    }

    @Override
    public Collection<Loan> getLoans() {
        return loans;
    }

    @Override
    public void addClient(Client client) {
        if (this.capacity <= clients.size()) {
            throw new IllegalArgumentException(NOT_ENOUGH_CAPACITY_FOR_CLIENT);
        }

        clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        for (Client cl : clients) {
            if (cl.getName().equals(client.getName())) {
                clients.remove(client);
            }
        }
    }

    @Override
    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    @Override
    public int sumOfInterestRates() {
        int sum = 0;

        for (Loan l : loans) {
            sum += l.getInterestRate();
        }

        return sum;
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s, Type: %s\n",
                this.getName(),
                this.getClass().getSimpleName()));

        if (clients.isEmpty()) {
            sb.append("Clients: none\n");
        } else {
            sb.append("Clients: ");
            sb.append(String.join(", ", clients.stream().map(Client::getName).collect(Collectors.toList())));
            sb.append("\n");
        }

        sb.append(String.format("Loans: %d, Sum of interest rates: %d",
                loans.size(), this.sumOfInterestRates()));

        return sb.toString();
    }
}