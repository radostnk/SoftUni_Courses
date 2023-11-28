package bank_exam.entities.client;

import static bank_exam.common.ExceptionMessages.*;

public abstract class BaseClient implements Client {

    private String name;
    private String id;
    private int interest;
    private double income;

    public BaseClient(String name, String id, int interest, double income) {
        this.setName(name);
        this.setId(id);
        this.interest = interest;
        this.setIncome(income);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(CLIENT_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    private void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException(CLIENT_ID_CANNOT_BE_NULL_OR_EMPTY);
        }

        this.id = id;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public void setIncome(double income) {
        if (income <= 0 ) {
            throw new IllegalArgumentException(CLIENT_INCOME_CANNOT_BE_BELOW_OR_EQUAL_TO_ZERO);
        }

        this.income = income;
    }

    @Override
    public int getInterest() {
        return this.interest;
    }

    public String getId() {
        return id;
    }

    @Override
    public double getIncome() {
        return this.income;
    }

}

