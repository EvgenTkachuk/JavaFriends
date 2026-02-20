import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyNum {
    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first number: ");
        int num1 = Integer.parseInt(READER.readLine());
        System.out.println("Input second number: ");
        int num2 = Integer.parseInt(READER.readLine());
        LuckyNum(num1, num2);
    }

    public static int LuckyNum(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i % 10 == 4 || i % 10 == 9) {
                System.out.println("Here is unlucky num");
            } else
                System.out.println(i);
        }
        return 0;
    }
}
