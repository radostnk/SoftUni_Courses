package bank_exam.repositories;

import bank_exam.entities.loan.Loan;

public interface Repository {

    void addLoan(Loan loan);

    boolean removeLoan(Loan loan);

    Loan findFirst(String type);
}
