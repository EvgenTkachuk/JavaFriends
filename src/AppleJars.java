import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppleJars {
    public static void main(String[] Args)throws IOException{
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter apples count: ");
        int applesCount = Integer.parseInt(READER.readLine());
        System.out.println("Enter big jar count: ");
        int bigJar = Integer.parseInt(READER.readLine());
        System.out.println("Enter middle jar count: ");
        int middleJar = Integer.parseInt(READER.readLine());
        System.out.println("Enter small jar count: ");
        int smallJar = Integer.parseInt(READER.readLine());
        ApplesPackaging(applesCount, bigJar, middleJar, smallJar);
    }
    public static int ApplesPackaging(int applesCount, int bigJar, int middleJar, int smallJar) {
        int bigRes = 0;
        int middleRes = 0;
        int smallRes = 0;
        if(bigJar<(applesCount / 5)){
            bigRes = bigJar;
            if( middleJar<((applesCount - (bigJar *5))/3)){
                middleRes = middleJar;
                smallRes = (applesCount - (bigJar *5)) - (middleJar*3);
            }
            else{
            middleRes = (applesCount - (bigJar *5)) / 3;
            }

        }
        else{
            bigRes = applesCount / 5;
            middleRes = (applesCount %5) / 3;
            smallRes = middleRes;
        }
        System.out.println("If you have " + applesCount + " apples.\n" +
                bigRes + " large jar\n"+
                middleRes + " middle jar\n"+
                smallRes + " small jar");
        return smallRes + middleRes + bigRes;
    }
}
