package handball.core;

import handball.entities.equipment.ElbowPad;
import handball.entities.equipment.Equipment;
import handball.entities.equipment.Kneepad;
import handball.entities.gameplay.Gameplay;
import handball.entities.gameplay.Indoor;
import handball.entities.gameplay.Outdoor;
import handball.entities.team.BaseTeam;
import handball.entities.team.Bulgaria;
import handball.entities.team.Germany;
import handball.entities.team.Team;
import handball.repositories.EquipmentRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import static handball.common.ConstantMessages.*;
import static handball.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {

    private EquipmentRepository equipmentRepo;
    private Map<String, Gameplay> gameplays;

    public ControllerImpl() {
        this.equipmentRepo = new EquipmentRepository();
        this.gameplays = new LinkedHashMap<>();
    }

    @Override
    public String addGameplay(String gameplayType, String gameplayName) {

        Gameplay gameplay;

        switch (gameplayType) {
            case "Outdoor":
                gameplay = new Outdoor(gameplayName);
                break;

            case "Indoor":
                gameplay = new Indoor(gameplayName);
                break;

            default:
                throw new NullPointerException(INVALID_GAMEPLAY_TYPE);
        }

        gameplays.put(gameplayName, gameplay);
        return String.format(SUCCESSFULLY_ADDED_GAMEPLAY_TYPE, gameplayType);
    }

    @Override
    public String addEquipment(String equipmentType) {

        Equipment equipment;

        switch (equipmentType) {
            case "Kneepad":
                equipment = new Kneepad();
                break;

            case "ElbowPad":
                equipment = new ElbowPad();
                break;

            default:
                throw new IllegalArgumentException(INVALID_EQUIPMENT_TYPE);
        }

        equipmentRepo.add(equipment);
        return String.format(SUCCESSFULLY_ADDED_EQUIPMENT_TYPE, equipmentType);
    }

    @Override
    public String equipmentRequirement(String gameplayName, String equipmentType) {

        Equipment equipment = equipmentRepo.findByType(equipmentType);

        if (equipment == null) {
            throw new IllegalArgumentException(String.format(NO_EQUIPMENT_FOUND, equipmentType));
        }

        gameplays.get(gameplayName).addEquipment(equipment);
        equipmentRepo.remove(equipment);
        return String.format(SUCCESSFULLY_ADDED_EQUIPMENT_IN_GAMEPLAY, equipmentType, gameplayName);
    }

    @Override
    public String addTeam(String gameplayName, String teamType, String teamName, String country, int advantage) {

        BaseTeam team;
        String gameplayType = gameplays.get(gameplayName).getClass().getSimpleName();

        switch (teamType) {
            case "Bulgaria":
                team = new Bulgaria(teamName, country, advantage);
                break;

            case "Germany":
                team = new Germany(teamName, country, advantage);
                break;

            default: throw new IllegalArgumentException(INVALID_TEAM_TYPE);
        }

        if ((teamType.equals("Bulgaria") && gameplayType.equals("Indoor")) ||
                (teamType.equals("Germany") && gameplayType.equals("Outdoor"))) {

            return GAMEPLAY_NOT_SUITABLE;
        }

        gameplays.get(gameplayName).addTeam(team);
        return String.format(SUCCESSFULLY_ADDED_TEAM_IN_GAMEPLAY, teamType, gameplayName);
    }

    @Override
    public String playInGameplay(String gameplayName) {

        gameplays.get(gameplayName).teamsInGameplay();
        long count = gameplays.get(gameplayName).getTeam().size();

        return String.format(TEAMS_PLAYED, count);
    }

    @Override
    public String percentAdvantage(String gameplayName) {

        int sum = gameplays.get(gameplayName).getTeam().stream().mapToInt(Team::getAdvantage).sum();
        return String.format(ADVANTAGE_GAMEPLAY, gameplayName, sum);
    }

    @Override
    public String getStatistics() {

        StringBuilder sb = new StringBuilder();

        gameplays.values().forEach(g -> {
            sb.append(g.toString());
            sb.append(System.lineSeparator());
        });

        return sb.toString();
    }
}

//Returns information about each gameplay. You can use the overridden .toString() Gameplay method.
//"{gameplayName} {gameplayType}
//Team: {teamName1} {teamName2} (…) / Team: none
//Equipment: {equipmentsCount}, Protection: {allProtection}
//{gameplayName} {gameplayType}
//Team: {teamName1} {teamName2} (…) / Team: none
//Equipment: {equipmentsCount}, Protection: {allProtection}
//(…)"
//Note: Use \n or System.lineSeparator() for a new line.