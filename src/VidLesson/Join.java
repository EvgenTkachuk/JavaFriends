package VidLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Join {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        int weight = Integer.parseInt(reader.readLine());

        if(age<=18 && weight>60){
            System.out.println("You need to work on yourself!");
        }
        else if (age>=18 && weight<40){
            System.out.println("You need more eating!");
        }
        else {
            System.out.println("Input right parameters.");
        }
    }
}
