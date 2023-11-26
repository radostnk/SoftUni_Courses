package bank_exam.entities.client;

public abstract class BaseClient implements Client {

    protected String name;
    protected String id;
    protected int interest;
    protected double income;

    public BaseClient(String name, String id, int interest, double income) {
        this.name = name;
        this.id = id;
        this.interest = interest;
        this.income = income;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isBlank()) {
            throw new IllegalArgumentException("Client name cannot be null or empty.");
        }

        this.name = name;
    }

    public void setId(String id) {
        if (id == null || id.trim().isBlank()) {
            throw new IllegalArgumentException("Client’s ID cannot be null or empty.");
        }

        this.id = id;
    }

    public void setIncome(double income) {
        if (income <= 0 ) {
            throw new IllegalArgumentException("Client income cannot be below or equal to 0.");
        }

        this.income = income;
    }

    @Override
    public int getInterest() {
        return this.interest;
    }

    @Override
    public double getIncome() {
        return this.income;
    }

//    @Override
//    public void increase() {
//        //The increase() method increases the Client’s interest.
//        // Keep in mind that some Client can implement the method differently.
//    }
}

