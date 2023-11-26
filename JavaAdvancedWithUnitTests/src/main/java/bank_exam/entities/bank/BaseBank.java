package bank_exam.entities.bank;

import bank_exam.entities.client.Client;
import bank_exam.entities.loan.Loan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseBank implements Bank {

    protected String name;
    protected int capacity;
    protected Collection<Loan> loans;
    protected Collection<Client> clients;

    public BaseBank(String name, int capacity) {
        this.name = name;
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
        if (name == null || name.trim().isBlank()) {
            throw new IllegalArgumentException("Bank name cannot be null or empty.");
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
            throw new IllegalArgumentException("Not enough capacity for this client.");
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

        sb.append(String.format("Loans: %d, Sum of interest rates: %d\n",
                loans.size(), this.sumOfInterestRates()));

        return sb.toString();
    }
}