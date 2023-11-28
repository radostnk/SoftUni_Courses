package bank_exam.entities.client;

public class Student extends BaseClient {

    private static final int INITIAL_INTEREST = 2;

    public Student(String name, String id, double income) {
        super(name, id, INITIAL_INTEREST, income);
    }

    @Override
    public void increase() {
        setInterest(getInterest() + 1);
    }
}