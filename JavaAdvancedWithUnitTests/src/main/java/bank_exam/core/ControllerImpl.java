package bank_exam.core;

import bank_exam.entities.bank.Bank;
import bank_exam.entities.bank.BranchBank;
import bank_exam.entities.bank.CentralBank;
import bank_exam.entities.client.Adult;
import bank_exam.entities.client.Client;
import bank_exam.entities.client.Student;
import bank_exam.entities.loan.Loan;
import bank_exam.entities.loan.MortgageLoan;
import bank_exam.entities.loan.StudentLoan;
import bank_exam.repositories.LoanRepository;

import java.util.ArrayList;
import java.util.Collection;

public class ControllerImpl implements Controller {

    private LoanRepository loanRepository;
    private Collection<Bank> banks;

    public ControllerImpl() {
        this.loanRepository = new LoanRepository();
        this.banks = new ArrayList<Bank>();
    }

    @Override
    public String addBank(String type, String name) {

        Bank bank = null;

        switch (type) {
            case "CentralBank":
                bank = new CentralBank(name);
                break;

            case "BranchBank":
                bank = new BranchBank(name);
                break;

            default:
                throw new IllegalArgumentException("Invalid bank type.");
        }

        banks.add(bank);
        return String.format("%s is successfully added.", type);
    }

    @Override
    public String addLoan(String type) {

        Loan loan = null;

        switch (type) {
            case "StudentLoan":
                loan = new StudentLoan();
                break;

            case "MortgageLoan":
                loan = new MortgageLoan();
                break;

            default:
                throw new IllegalArgumentException("Invalid loan type.");
        }

        loanRepository.addLoan(loan);
        return String.format("%s is successfully added.", type);
    }

    @Override
    public String returnedLoan(String bankName, String loanType) {

       Bank bank = banks.stream().filter(b -> b.getName().equals(bankName)).findAny().get();
       Loan loan = null;

       if (loanType.equals("MortgageLoan")) {
           loan = new MortgageLoan();

       } else if (loanType.equals("StudentLoan")) {
           loan = new StudentLoan();

       }

       if (loanRepository.findFirst(loanType) == null) {
           throw new IllegalArgumentException(String.format("Loan of type %s is missing.", loanType));

       } else if (bank.getClass().getSimpleName().equals("CentralBank")
                && loan.getClass().getSimpleName().equals("StudentLoan")) {
            throw new IllegalArgumentException(String.format("Loan of type %s is missing.", loanType));
        }

        bank.addLoan(loan);
        return String.format("%s successfully added to %s.", loanType, bankName);
    }

    @Override
    public String addClient(String bankName, String clientType, String clientName, String clientID, double income) {
        Client client = null;
        Bank bank = banks.stream().filter(b -> b.getName().equals(bankName)).findAny().get();

        switch (clientType) {
            case "Student":
                client = new Student(clientName, clientID, income);
                break;

            case "Adult":
                client = new Adult(clientName, clientID, income);
                break;

            default:
                throw new IllegalArgumentException("Invalid client type.");
        }

        if (bank.getClass().getSimpleName().equals("CentralBank")
                && client.getClass().getSimpleName().equals("Adult")) {
            bank.addClient(client);

        } else if (bank.getClass().getSimpleName().equals("BranchBank")
                && client.getClass().getSimpleName().equals("Student")) {
            bank.addClient(client);

        } else {
            return "Unsuitable bank.";
        }

        return String.format("%s successfully added to %s.", clientType, bankName);
    }

    @Override
    public String finalCalculation(String bankName) {
        double sum = 0;

        Bank bank = banks.stream().filter(b -> b.getName().equals(bankName)).findAny().get();
        Collection<Client> clients = bank.getClients();
        Collection<Loan> loans = bank.getLoans();

        for (Client client : clients) {
            sum += client.getIncome();
        }

        for (Loan loan : loans) {
            sum += loan.getAmount();
        }

        return String.format("The funds of bank %s is %.2f.", bankName, sum);
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        banks.forEach(b -> sb.append(b.getStatistics()));
        return sb.toString();
    }
}
