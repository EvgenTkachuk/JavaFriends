import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessTheNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        int randomNum = (int) (Math.random() * 10);
        System.out.println("Input the number: ");
        int number = Integer.parseInt(READER.readLine());
        InputNumber(number, randomNum, READER);
    }

    public static int InputNumber(int number, int randomNum, BufferedReader READER) throws IOException {
        while (randomNum != number) {
            System.out.println("Random number was not " + number + ". Try again.");
            System.out.println("Input the number: ");
            number = Integer.parseInt(READER.readLine());
        }
        System.out.println("Your number is equal random number");
        System.out.println("Random number: " + randomNum);
        return 0;
    }
}
