package OOP.E_Reflection.barracksWars.core.commands;

import OOP.E_Reflection.barracksWars.interfaces.Repository;
import OOP.E_Reflection.barracksWars.interfaces.UnitFactory;

public class Report extends Command {

    public Report(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return this.getRepository().getStatistics();
    }
}
