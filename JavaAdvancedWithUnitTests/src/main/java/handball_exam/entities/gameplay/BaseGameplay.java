package handball_exam.entities.gameplay;

import handball_exam.entities.equipment.Equipment;
import handball_exam.entities.team.Team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static handball_exam.common.ExceptionMessages.GAMEPLAY_NAME_NULL_OR_EMPTY;

public abstract class BaseGameplay implements Gameplay {

    private String name;
    private int capacity;
    private Collection<Equipment> equipments;
    private Collection<Team> teams;

    public BaseGameplay(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        equipments = new ArrayList<>();
        teams = new ArrayList<>();
    }

    public void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(GAMEPLAY_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    @Override
    public int allProtection() {
        return equipments.stream().mapToInt(Equipment::getProtection).sum();
    }

    @Override
    public void addTeam(Team team) {
        teams.add(team);
    }

    @Override
    public void removeTeam(Team team) {
        teams.remove(team);
    }

    @Override
    public void addEquipment(Equipment equipment) {
        equipments.add(equipment);
    }

    @Override
    public void teamsInGameplay() {
        teams.forEach(Team::play);
    }

    @Override
    public Collection<Team> getTeam() {
        return this.teams;
    }

    @Override
    public Collection<Equipment> getEquipments() {
        return this.equipments;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" ").append(this.getClass().getSimpleName());
        sb.append(System.lineSeparator());
        sb.append("Team: ");

        if (teams.isEmpty()) {
            sb.append("none");
        } else {
            sb.append(String.join(" ", teams.stream().map(Team::getName).collect(Collectors.toList())));
        }

        sb.append(System.lineSeparator());
        sb.append("Equipment: ").append(equipments.size()).append(", ");
        sb.append("Protection: ").append(this.allProtection());

        return sb.toString();
    }
}