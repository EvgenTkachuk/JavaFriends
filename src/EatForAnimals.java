import java.util.Scanner;

public class EatForAnimals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of cats: ");
        int catNum = scan.nextInt();
        System.out.println("Input number of dogs: ");
        int dogNum = scan.nextInt();

        System.out.println("How gram of feed to eat your cat? > ");
        int feedForOneCat = scan.nextInt();
        System.out.println("How gram of feed to eat your dog? > ");
        int feedForOneDog = scan.nextInt();

        System.out.println("How many coast the feed for cat? > ");
        double coastFeedForCat = scan.nextDouble();
        System.out.println("How many coast the feed for dog? > ");
        double coastFeedForDog = scan.nextDouble();

        System.out.println("How discount for feed for cat? > ");
        int discountFeedForCat = scan.nextInt();
        System.out.println("How discount for feed for dog? > ");
        int discountFeedForDog = scan.nextInt();
        int forWeek = 7;
        int forMonth = 31;
        int forYear = 365;
        double allSumm = DaysMoneyInShelter(catNum,feedForOneCat,coastFeedForCat,discountFeedForCat)+
                DaysMoneyInShelter(dogNum,feedForOneDog,coastFeedForDog,discountFeedForDog);

        System.out.printf("You're need a %.2f$ in a day for cat's feed.%n",
                DaysMoneyInShelter(catNum,feedForOneCat,coastFeedForCat,discountFeedForCat));
        System.out.printf("You're need a %.2f$ in a day for dog's feed.%n",
                DaysMoneyInShelter(dogNum,feedForOneDog,coastFeedForDog,discountFeedForDog));
        System.out.printf("You're need %.2f$ in a day for all animals.%n\n",allSumm);

        System.out.printf("You're need a %.2f$ in a week for cat's feed.%n",
                DaysMoneyInShelter(catNum,feedForOneCat,coastFeedForCat,discountFeedForCat)*forWeek);
        System.out.printf("You're need a %.2f$ in a week for dog's feed.%n",
                DaysMoneyInShelter(dogNum,feedForOneDog,coastFeedForDog,discountFeedForDog)*forWeek);
        System.out.printf("You're need %.2f$ in a week for all animals.%n\n",allSumm*forWeek);

        System.out.printf("You're need a %.2f$ in a month for cat's feed.%n",
                DaysMoneyInShelter(catNum,feedForOneCat,coastFeedForCat,discountFeedForCat)*forMonth);
        System.out.printf("You're need a %.2f$ in a month for dog's feed.%n",
                DaysMoneyInShelter(dogNum,feedForOneDog,coastFeedForDog,discountFeedForDog)*forMonth);
        System.out.printf("You're need %.2f$ in a month for all animals.%n\n",allSumm*forMonth);

        System.out.printf("You're need a %.2f$ in a year for cat's feed.%n",
                DaysMoneyInShelter(catNum,feedForOneCat,coastFeedForCat,discountFeedForCat)*forYear);
        System.out.printf("You're need a %.2f$ in a year for dog's feed.%n",
                DaysMoneyInShelter(dogNum,feedForOneDog,coastFeedForDog,discountFeedForDog)*forYear);
        System.out.printf("You're need %.2f$ in a year for all animals.%n\n",allSumm*forYear);
    }
    public static double DaysMoneyInShelter(int AnimalNum, int FeedForOneAnimal, double coastFeedForAnimal, int discount){
        int gramForDay = (FeedForOneAnimal *3);
        double result = (AnimalNum*gramForDay)*(coastFeedForAnimal/1000);
        return (result/100)*(100-discount);
    }
}
