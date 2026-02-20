package VidLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validate {
    public static void main(String[] args) throws IOException {
        System.out.println("Input the parse number from 0 to 10:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        isNumberValid(number);
//        if(number %2 == 0 && number <= 10 && number > 0){
//            System.out.println("You are Win!");
//        }
//        else{
//            System.out.println("You are lose!");
//        }
    }
    public static boolean isNumberValid(int number){
        if(number %2 != 0 && number<=10 && number>0){
            System.out.println("You are lose!");
            return false;
        }
        else{
            System.out.println("You are Win!");
            return true;
        }
    }
}
