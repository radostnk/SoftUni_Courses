package glacialExpedition_exam;

import glacialExpedition_exam.core.Controller;
import glacialExpedition_exam.core.ControllerImpl;
import glacialExpedition_exam.core.Engine;
import glacialExpedition_exam.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
