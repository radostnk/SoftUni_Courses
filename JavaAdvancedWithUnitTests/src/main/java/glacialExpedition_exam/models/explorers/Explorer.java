package glacialExpedition_exam.models.explorers;

import glacialExpedition_exam.models.suitcases.Suitcase;

public interface Explorer {
    String getName();

    double getEnergy();

    boolean canSearch();

    Suitcase getSuitcase();

    void search();
}
