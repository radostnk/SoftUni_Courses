package OOP.E_Reflection.barracksWars;

import OOP.E_Reflection.barracksWars.core.commands.CommandInterpreterImpl;
import OOP.E_Reflection.barracksWars.interfaces.CommandInterpreter;
import OOP.E_Reflection.barracksWars.interfaces.Repository;
import OOP.E_Reflection.barracksWars.interfaces.Runnable;
import OOP.E_Reflection.barracksWars.interfaces.UnitFactory;
import OOP.E_Reflection.barracksWars.core.Engine;
import OOP.E_Reflection.barracksWars.core.factories.UnitFactoryImpl;
import OOP.E_Reflection.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);
        Runnable engine = new Engine(commandInterpreter);
        engine.run();
    }
}
