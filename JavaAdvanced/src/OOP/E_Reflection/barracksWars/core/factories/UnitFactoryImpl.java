package OOP.E_Reflection.barracksWars.core.factories;

import OOP.E_Reflection.barracksWars.interfaces.Unit;
import OOP.E_Reflection.barracksWars.interfaces.UnitFactory;
import OOP.E_Reflection.barracksWars.models.units.AbstractUnit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"OOP.E_Reflection.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) {

		try {
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> constructor = unitClass.getDeclaredConstructor();
			return constructor.newInstance();

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());

		} catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
			System.out.println(e.getMessage());
		}

		return null;
	}
}
