package bank_exam.entities.client;

public interface Client {
    String getName();

    void setName(String name);

    int getInterest();

    double getIncome();

    void increase();
}
