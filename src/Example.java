import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
    InOut();
    }

    public static double InOut() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input variable a: ");
        double a = scan.nextInt();
        System.out.print("Input variable b: ");
        double b = scan.nextInt();
        System.out.print("Input variable c: ");
        double c = scan.nextInt();
        System.out.println("|a-b|/(a+b)\u00B2-\u221ac = " + (Solution(a,b,c)));
        return Solution(a,b,c);
    }
    public static double Solution(double a,double b,double c){
        double num = Math.abs(a-b);
        double dif = ((Math.pow((a+b), 2))-Math.sqrt(c));
        return num/dif;
    }
}
