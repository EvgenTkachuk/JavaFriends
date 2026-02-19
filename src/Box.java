import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input wight(integer): ");
        int width = scan.nextInt();
        System.out.print("Input height(integer): ");
        int height = scan.nextInt();
        System.out.print("Input depth(integer)");
        int depth = scan.nextInt();
        System.out.print("Box volume: " + (Volume(width,height,depth)) + "M\u00B3");
//        System.out.print("Box volume: " + (Volume(2,2,2)));
    }
    public static int Volume(int width,int height,int deph){
        return(width*height*deph);
    }
}
