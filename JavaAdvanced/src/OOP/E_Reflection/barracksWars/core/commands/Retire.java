package OOP.E_Reflection.barracksWars.core.commands;

import OOP.E_Reflection.barracksWars.interfaces.Repository;
import OOP.E_Reflection.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class Retire extends Command {

    public Retire(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        try {
            String unitType = this.getData()[1];
            this.getRepository().removeUnit(unitType);
            return String.format("%s retired!", unitType);

        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
