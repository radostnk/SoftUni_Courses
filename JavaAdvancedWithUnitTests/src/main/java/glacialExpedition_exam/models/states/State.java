package glacialExpedition_exam.models.states;

import java.util.Collection;

public interface State {
    Collection<String> getExhibits();

    String getName();
}
