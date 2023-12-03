package glacialExpedition_exam.models.mission;

import glacialExpedition_exam.models.explorers.Explorer;
import glacialExpedition_exam.models.states.State;


import java.util.Collection;

public interface Mission {
    void explore(State state, Collection<Explorer> explorers);
}
