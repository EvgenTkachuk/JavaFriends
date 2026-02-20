import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandLuggage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the dimensions of the luggage in cm: ");
        int length = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());
        int height = Integer.parseInt(reader.readLine());
        Luggage(length, width, height);
    }

    public static void Luggage(int length, int width, int height) {
        System.out.println("Your hand luggage have a length of: " + length + "cm, a width of: " + width + "cm, and a height of: " + height + "cm.");
        if (length <= 40 && width <= 30 && height <= 20) {
            System.out.println("You can carry your hand luggage free of charge.");
        } else {
            if (length > 40) {
                System.out.println("The LENGTH of your luggage exceeds the norm.");
            }
            if (width > 30) {
                System.out.println("The WIDTH of your luggage exceeds the norm.");
            }
            if (height > 20) {
                System.out.println("The HEIGHT of your luggage exceeds the norm.");
            }
        }
    }
}
