package glacialExpedition_exam.models.mission;

import glacialExpedition_exam.models.explorers.Explorer;
import glacialExpedition_exam.models.states.State;

import java.util.Collection;

public class MissionImpl implements Mission {
    @Override
    public void explore(State state, Collection<Explorer> explorers) {

        Collection<String> exhibits = state.getExhibits();

        for (Explorer expl : explorers) {

            while (expl.canSearch() && exhibits.iterator().hasNext()) {

                expl.search();
                String currentExhibit = exhibits.iterator().next();
                expl.getSuitcase().getExhibits().add(currentExhibit);
                exhibits.remove(currentExhibit);
            }
        }
    }
}