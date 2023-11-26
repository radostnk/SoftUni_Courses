package bank_exam.entities.client;

public class Adult extends BaseClient {

    private static final int INITIAL_INTEREST = 4;

    public Adult(String name, String id, double income) {
        super(name, id, INITIAL_INTEREST, income);
    }

    @Override
    public void increase() {
        this.interest = INITIAL_INTEREST + 2;
    }
}