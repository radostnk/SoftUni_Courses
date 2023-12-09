package handball_exam;

import handball_exam.core.Engine;
import handball_exam.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
