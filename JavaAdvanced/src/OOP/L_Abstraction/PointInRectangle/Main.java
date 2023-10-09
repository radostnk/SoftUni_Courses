package L_Abstraction.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] coordinates = getInts(scan);

        Point A = new Point(coordinates[0], coordinates[1]);
        Point C = new Point(coordinates[2], coordinates[3]);
        Rectangle rectangle = new Rectangle(A, C);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int[] pointCoordinates = getInts(scan);
            Point x = new Point(pointCoordinates[0], pointCoordinates[1]);

            boolean isInRectangle = rectangle.contains(x);
            System.out.println(isInRectangle);
        }
    }

    private static int[] getInts(Scanner scan) {
        int[] coordinates = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return coordinates;
    }
}
