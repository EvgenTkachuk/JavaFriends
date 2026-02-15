import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a grade for each of the 5 subjects: ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int sum = 0;
        int average = sum / numbers.length;;
        for (int number : numbers) {
            sum += number;
            average = sum / numbers.length;
        }
        Bursary(average);
    }

    public static void Bursary(int average) {
        System.out.println("Your grade point average is: " + average);
        if(average < 8){
            System.out.println("Your average score is insufficient to qualify for a scholarship .");
        }
        else if(average < 10){
            System.out.println("Your average score is sufficient to qualify for a scholarship.");
        }
        else{
            System.out.println("Your average score is excellent for receiving an increased scholarship.");
        }
    }
}
