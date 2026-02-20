import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarWash {
    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input count of cars: ");
        int carCount = Integer.parseInt(READER.readLine());
        CarWash(carCount);
    }

    public static void CarWash(int carCount) {
        for (int i = 1; i <= carCount; i++) {
            CarSoup(carCount);
            CarWashing(carCount);
            CarDry(carCount);
            System.out.println("Car № " + i + " is completely washed.\n");
        }
    }

    public static int CarSoup(int carCount) {
        System.out.println("This car has been souped...");
        return 0;
    }

    public static int CarWashing(int carCount) {
        System.out.println("This car has been washed...");
        return 0;
    }

    public static int CarDry(int carCount) {
        System.out.println("This car has been dried...");
        return 0;
    }
}
