package handball_exam.entities.gameplay;

public class Indoor extends BaseGameplay {

    public static final int CAPACITY = 250;

    public Indoor(String name) {
        super(name, CAPACITY);
    }
}