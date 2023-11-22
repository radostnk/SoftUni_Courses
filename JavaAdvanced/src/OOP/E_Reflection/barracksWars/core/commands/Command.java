package OOP.E_Reflection.barracksWars.core.commands;

import OOP.E_Reflection.barracksWars.interfaces.Executable;
import OOP.E_Reflection.barracksWars.interfaces.Repository;
import OOP.E_Reflection.barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {

    private Repository repository;
    private UnitFactory unitFactory;
    private String[] data;

    public Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
        this.data = data;
    }

    public Repository getRepository() {
        return repository;
    }

    public UnitFactory getUnitFactory() {
        return unitFactory;
    }

    public String[] getData() {
        return data;
    }

    @Override
    public abstract String execute();
}
