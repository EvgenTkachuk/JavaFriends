package VidLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isEven {
    public static void main(String[] args) throws IOException {
            System.out.println("Input the number:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());
            isEvenNum(number);

            String massage = "your number is ";
            if(isEvenNum(number)){
                massage += "even.";
            }
            else{
                massage += "odd.";
            }
            System.out.println(massage);

//Тернарний оператор    Умова ? Це значення : Інше значення
            String msg = isEvenNum(number) ? "Your number is even" : "Your number is odd";
            System.out.println(msg);


        }
        public static boolean isEvenNum(int number){
            if(number %2 != 0){
                return false;
            }
            else{
                return true;
            }
        }
    }

