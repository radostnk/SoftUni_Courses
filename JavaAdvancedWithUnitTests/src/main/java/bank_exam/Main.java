package bank_exam;

import bank_exam.core.Engine;
import bank_exam.core.EngineImpl;

public class Main {
    public static void main(String[] args) {

        Engine engine = new EngineImpl();
        engine.run();
    }
}
