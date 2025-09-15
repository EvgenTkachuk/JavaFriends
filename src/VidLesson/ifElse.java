package VidLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifElse {
    public static void main(String[] args) throws IOException {
        int number = 10;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isTrue = Boolean.parseBoolean(reader.readLine());
        if(isTrue){
            System.out.println("You are true");
        }
        else{
            System.out.println("You are false");
        }


    }
}
