package OOP.E_Reflection.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		Class<RichSoilLand> richSoilLandClass = RichSoilLand.class;
		Field[] allFields = richSoilLandClass.getDeclaredFields();

		Scanner scan = new Scanner(System.in);
		String command = scan.nextLine();

		Predicate<Field> filterPrivate = f -> Modifier.isPrivate(f.getModifiers());
		Predicate<Field> filterProtected = f -> Modifier.isProtected(f.getModifiers());
		Predicate<Field> filterPublic = f -> Modifier.isPublic(f.getModifiers());

		while (!command.equals("HARVEST")) {

			switch (command) {

				case "public":
					Arrays.stream(allFields).filter(filterPublic)
							.forEach(Main::printFields);
					break;

				case "protected":
					Arrays.stream(allFields).filter(filterProtected)
							.forEach(Main::printFields);
					break;

				case "private":
					Arrays.stream(allFields).filter(filterPrivate)
							.forEach(Main::printFields);
					break;

				case "all":
					Arrays.stream(allFields).forEach(Main::printFields);
					break;
			}

			command = scan.nextLine();
		}
	}

	public static void printFields(Field field) {

		String fieldModifier = Modifier.toString(field.getModifiers());
		String fieldType = field.getType().getSimpleName();
		String fieldName = field.getName();

		System.out.printf("%s %s %s\n", fieldModifier, fieldType, fieldName);
	}
}
