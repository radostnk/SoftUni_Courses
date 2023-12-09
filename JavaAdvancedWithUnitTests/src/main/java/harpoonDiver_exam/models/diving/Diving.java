package harpoonDiver_exam.models.diving;

import harpoonDiver_exam.models.diver.Diver;
import harpoonDiver_exam.models.divingSite.DivingSite;

import java.util.Collection;

public interface Diving {

    void searching(DivingSite divingSite, Collection<Diver> divers);
}
