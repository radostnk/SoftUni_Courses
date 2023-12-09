package harpoonDiver_exam;

import harpoonDiver_exam.core.Controller;
import harpoonDiver_exam.core.ControllerImpl;
import harpoonDiver_exam.core.Engine;
import harpoonDiver_exam.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
