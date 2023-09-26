package E_DefiningClasses.CarSalesman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] engineData = scan.nextLine().split("\\s+");
            //Engine "{Model} int {Power} {Displacement} {Efficiency}"

        }

        int m = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < m; i++) {
            String[] carData = scan.nextLine().split("\\s+");
            //Car "{Model} {Engine} {Weight} {Color}"

        }

        //Your task is to print each car (in the order you received them)
    }
}

//"{CarModel}:
// {EngineModel}:
// Power: {EnginePower}
// Displacement: {EngineDisplacement}
//Efficiency: {EngineEfficiency}
// Weight: {CarWeight}
// Color: {CarColor}"