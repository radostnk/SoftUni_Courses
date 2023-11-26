package bank_exam.entities.loan;

public abstract class BaseLoan implements Loan {

    protected int interestRate;
    protected double amount;

    public BaseLoan(int interestRate, double amount) {
        this.interestRate = interestRate;
        this.amount = amount;
    }

    @Override
    public int getInterestRate() {
        return this.interestRate;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }
}
