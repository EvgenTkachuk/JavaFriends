import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number: ");
        int num1 = Integer.parseInt(READER.readLine());
        System.out.println("Enter operation: ");
        char operation = READER.readLine().charAt(0);
        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(READER.readLine());
        System.out.println("Result is: " + Calculate(num1, num2, operation));
    }
    public static int Calculate(int num1, int num2, char operation){
        int result = 0;
        switch(operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                if(num1 == 0 || num2 == 0){
                    System.out.println("Error!");
                }
                result = num1 * num2;
                break;
            case '/':
                if(num1 == 0 || num2 == 0){
                    System.out.println("Error!");
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error!");
                break;
        }
        return result;

    }
}