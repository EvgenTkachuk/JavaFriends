
public class RandomNum {
    public static void main(String[] args){
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        int num3 = (int)(Math.random() * 100);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        MinimalNum(num1,num2,num3);
    }
    public static int MinimalNum(int num1,int num2,int num3){
        if(num1<num2 && num1< num3){
            System.out.println("Minimal number is: " + num1);
        }
        if(num2< num1 && num2 < num3){
            System.out.println("Minimal number is: "+ num2);
        }
        if(num3 < num2 && num3 < num1){
            System.out.println("Minimal number is: "+ num3);
        }
        return 0;
    }
}
