package glacialExpedition_exam.core;

import glacialExpedition_exam.models.explorers.*;
import glacialExpedition_exam.models.mission.MissionImpl;
import glacialExpedition_exam.models.states.State;
import glacialExpedition_exam.models.states.StateImpl;
import glacialExpedition_exam.repositories.ExplorerRepository;
import glacialExpedition_exam.repositories.StateRepository;

import java.util.List;
import java.util.stream.Collectors;

import static glacialExpedition_exam.common.ConstantMessages.*;
import static glacialExpedition_exam.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {

    private ExplorerRepository explorerRepository;
    private StateRepository stateRepository;
    private int exploredStates;

    public ControllerImpl() {
        this.explorerRepository = new ExplorerRepository();
        this.stateRepository = new StateRepository();
        this.exploredStates = 0;
    }

    @Override
    public String addExplorer(String type, String explorerName) {

        Explorer explorer;

        switch (type) {
            case "GlacierExplorer":
                explorer = new GlacierExplorer(explorerName);
                break;

            case "NaturalExplorer":
                explorer = new NaturalExplorer(explorerName);
                break;

            case "AnimalExplorer":
                explorer = new AnimalExplorer(explorerName);
                break;

            default:
                throw new IllegalArgumentException(EXPLORER_INVALID_TYPE);
        }

        explorerRepository.add(explorer);
        return String.format(EXPLORER_ADDED, type, explorerName);
    }

    @Override
    public String addState(String stateName, String... exhibits) {

        StateImpl state = new StateImpl(stateName);

        for (String exhibit : exhibits) {
            state.getExhibits().add(exhibit);
        }

        stateRepository.add(state);
        return String.format(STATE_ADDED, stateName);
    }

    @Override
    public String retireExplorer(String explorerName) {

        Explorer explorerToRetire = explorerRepository.byName(explorerName);

        if (explorerToRetire == null) {
            throw new IllegalArgumentException(String.format(EXPLORER_DOES_NOT_EXIST, explorerName));
        }

        explorerRepository.remove(explorerToRetire);
        return String.format(EXPLORER_RETIRED, explorerName);
    }

    @Override
    public String exploreState(String stateName) {

        List<Explorer> suitableExplorers = explorerRepository.getCollection().stream()
                .filter(e -> e.getEnergy() > 50).collect(Collectors.toList());

        if (suitableExplorers.isEmpty()) {
            throw new IllegalArgumentException(STATE_EXPLORERS_DOES_NOT_EXISTS);
        }

        MissionImpl mission = new MissionImpl();
        State state = stateRepository.byName(stateName);

        mission.explore(state, suitableExplorers);
        long count = suitableExplorers.stream().filter(e -> e.getEnergy() <= 0).count();
        this.exploredStates ++;

        return String.format(STATE_EXPLORER, stateName, count);
    }

    @Override
    public String finalResult() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(FINAL_STATE_EXPLORED, this.exploredStates))
                .append(System.lineSeparator())
                .append(FINAL_EXPLORER_INFO)
                .append(System.lineSeparator());

        for (Explorer exp : explorerRepository.getCollection()) {
            sb.append(String.format(FINAL_EXPLORER_NAME, exp.getName()))
                    .append(System.lineSeparator())
                    .append(String.format(FINAL_EXPLORER_ENERGY, exp.getEnergy()))
                    .append(System.lineSeparator());

            if (exp.getSuitcase().getExhibits().isEmpty()) {
                sb.append(String.format(FINAL_EXPLORER_SUITCASE_EXHIBITS, "None"))
                        .append(System.lineSeparator());

            } else {
                sb.append(String.format(FINAL_EXPLORER_SUITCASE_EXHIBITS,
                                String.join(FINAL_EXPLORER_SUITCASE_EXHIBITS_DELIMITER,
                                        exp.getSuitcase().getExhibits())));
                sb.append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }
}





