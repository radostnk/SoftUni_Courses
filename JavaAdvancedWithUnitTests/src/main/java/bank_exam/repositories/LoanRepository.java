package bank_exam.repositories;

import bank_exam.entities.loan.Loan;

import java.util.ArrayList;
import java.util.Collection;

public class LoanRepository implements Repository {

    private Collection<Loan> loans;

    public LoanRepository() {
        this.loans = new ArrayList<>();
    }

    @Override
    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    @Override
    public boolean removeLoan(Loan loan) {
        return loans.remove(loan);
    }

    @Override
    public Loan findFirst(String type) {
        return loans.stream().filter(l -> l.getClass().getSimpleName().contains(type))
                .findFirst().orElse(null);
    }
}
