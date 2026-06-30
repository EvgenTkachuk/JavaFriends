package VidLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class orAnd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int distance = Integer.parseInt(reader.readLine());

        if(distance<100){
            System.out.println("Green!");
        }
        else if(distance < 300){
            System.out.println("Orange");
        }
        else{
            System.out.println("Red");
        }
    }
}
