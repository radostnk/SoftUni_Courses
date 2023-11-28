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

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import static bank_exam.common.ConstantMessages.*;
import static bank_exam.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {

    private LoanRepository loanRepository;
    private Map<String, Bank> banks;

    public ControllerImpl() {
        this.loanRepository = new LoanRepository();
        this.banks = new LinkedHashMap<>();
    }

    @Override
    public String addBank(String type, String name) {

        Bank bank;

        switch (type) {
            case "CentralBank":
                bank = new CentralBank(name);
                break;

            case "BranchBank":
                bank = new BranchBank(name);
                break;

            default:
                throw new IllegalArgumentException(INVALID_BANK_TYPE);
        }

        banks.put(name, bank);
        return String.format(SUCCESSFULLY_ADDED_BANK_OR_LOAN_TYPE, type);
    }

    @Override
    public String addLoan(String type) {

        Loan loan;

        switch (type) {
            case "StudentLoan":
                loan = new StudentLoan();
                break;

            case "MortgageLoan":
                loan = new MortgageLoan();
                break;

            default:
                throw new IllegalArgumentException(INVALID_LOAN_TYPE);
        }

        loanRepository.addLoan(loan);
        return String.format(SUCCESSFULLY_ADDED_BANK_OR_LOAN_TYPE, type);
    }

    @Override
    public String returnedLoan(String bankName, String loanType) {

       Bank bank = banks.get(bankName);
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
            throw new IllegalArgumentException(String.format(NO_LOAN_FOUND, loanType));
        }

        bank.addLoan(loan);
        return String.format(SUCCESSFULLY_ADDED_CLIENT_OR_LOAN_TO_BANK, loanType, bankName);
    }

    @Override
    public String addClient(String bankName, String clientType, String clientName, String clientID, double income) {
        Client client;
        Bank bank = banks.get(bankName);

        switch (clientType) {
            case "Student":
                client = new Student(clientName, clientID, income);
                break;

            case "Adult":
                client = new Adult(clientName, clientID, income);
                break;

            default:
                throw new IllegalArgumentException(INVALID_CLIENT_TYPE);
        }

        if (bank.getClass().getSimpleName().equals("CentralBank")
                && client.getClass().getSimpleName().equals("Adult")) {
            bank.addClient(client);

        } else if (bank.getClass().getSimpleName().equals("BranchBank")
                && client.getClass().getSimpleName().equals("Student")) {
            bank.addClient(client);

        } else {
            return UNSUITABLE_BANK;
        }

        return String.format(SUCCESSFULLY_ADDED_CLIENT_OR_LOAN_TO_BANK, clientType, bankName);
    }

    @Override
    public String finalCalculation(String bankName) {
        double sum = 0;

        Bank bank = banks.get(bankName);
        Collection<Client> clients = bank.getClients();
        Collection<Loan> loans = bank.getLoans();

        for (Client client : clients) {
            sum += client.getIncome();
        }

        for (Loan loan : loans) {
            sum += loan.getAmount();
        }

        return String.format(FUNDS_BANK, bankName, sum);
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        banks.values().forEach(b -> sb.append(b.getStatistics()));
        return sb.toString();
    }
}
