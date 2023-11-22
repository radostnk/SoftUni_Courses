package OOP.E_Reflection.barracksWars.core.commands;

import OOP.E_Reflection.barracksWars.interfaces.CommandInterpreter;
import OOP.E_Reflection.barracksWars.interfaces.Executable;
import OOP.E_Reflection.barracksWars.interfaces.Repository;
import OOP.E_Reflection.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CommandInterpreterImpl implements CommandInterpreter {

    public static final String COMMAND_PACKAGE = "OOP.E_Reflection.barracksWars.core.commands.";
    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        String className = COMMAND_PACKAGE + parseCommandToClassName(commandName);
        Executable command = null;

        try {
            Class commandClass = Class.forName(className);
            Constructor<Command> constructor = commandClass.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
            command = constructor.newInstance(data, repository, unitFactory);

        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException | InstantiationException e) {
            throw new RuntimeException(e);
        }

        return command;
    }

    private String parseCommandToClassName(String command) {
        String firstLetterUppercase = command.substring(0,1).toUpperCase();
        String restOfTheWord = command.substring(1);
        StringBuilder sb = new StringBuilder();
        sb.append(firstLetterUppercase).append(restOfTheWord);
        return sb.toString();
    }
}
