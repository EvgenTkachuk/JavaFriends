import java.util.Scanner;

public class EatForAnimals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of cats: ");
        int catNum = scan.nextInt();
        System.out.println("Input number of dogs: ");
        int dogNum = scan.nextInt();

        System.out.println("How gram of feed to eat your cat? > ");
        int FeedForOneCat = scan.nextInt();
        System.out.println("How gram of feed to eat your dog? > ");
        int FeedForOneDog = scan.nextInt();

        System.out.println("How many coast the feed for cat? > ");
        double coastFeedForCat = scan.nextDouble();
        System.out.println("How many coast the feed for dog? > ");
        double coastFeedForDog = scan.nextDouble();

        System.out.println("How discount for feed for cat? > ");
        int discountFeedForCat = scan.nextInt();
        System.out.println("How discount for feed for dog? > ");
        int discountFeedForDog = scan.nextInt();

        double allSumm = DaysMoneyInShelter(catNum,FeedForOneCat,coastFeedForCat,discountFeedForCat)+
                DaysMoneyInShelter(dogNum,FeedForOneDog,coastFeedForDog,discountFeedForDog);

        System.out.printf("You're need a %.2f$ in a day for cat's feed.%n",
                DaysMoneyInShelter(catNum,FeedForOneCat,coastFeedForCat,discountFeedForCat));
        System.out.printf("You're need a %.2f$ in a day for dog's feed.%n",
                DaysMoneyInShelter(dogNum,FeedForOneDog,coastFeedForDog,discountFeedForDog));
        System.out.printf("You're need %.2f$ in a day for all animals.%n\n",allSumm);

        System.out.printf("You're need a %.2f$ in a week for cat's feed.%n",
                DaysMoneyInShelter(catNum,FeedForOneCat,coastFeedForCat,discountFeedForCat)*7);
        System.out.printf("You're need a %.2f$ in a week for dog's feed.%n",
                DaysMoneyInShelter(dogNum,FeedForOneDog,coastFeedForDog,discountFeedForDog)*7);
        System.out.printf("You're need %.2f$ in a week for all animals.%n\n",allSumm*7);

        System.out.printf("You're need a %.2f$ in a month for cat's feed.%n",
                DaysMoneyInShelter(catNum,FeedForOneCat,coastFeedForCat,discountFeedForCat)*31);
        System.out.printf("You're need a %.2f$ in a month for dog's feed.%n",
                DaysMoneyInShelter(dogNum,FeedForOneDog,coastFeedForDog,discountFeedForDog)*31);
        System.out.printf("You're need %.2f$ in a month for all animals.%n\n",allSumm*31);

        System.out.printf("You're need a %.2f$ in a year for cat's feed.%n",
                DaysMoneyInShelter(catNum,FeedForOneCat,coastFeedForCat,discountFeedForCat)*365);
        System.out.printf("You're need a %.2f$ in a year for dog's feed.%n",
                DaysMoneyInShelter(dogNum,FeedForOneDog,coastFeedForDog,discountFeedForDog)*365);
        System.out.printf("You're need %.2f$ in a year for all animals.%n\n",allSumm*365);
    }
    public static double DaysMoneyInShelter(int AnimalNum, int FeedForOneAnimal, double coastFeedForAnimal, int discount){
        int gramForDay = (FeedForOneAnimal *3);
        double result = (AnimalNum*gramForDay)*(coastFeedForAnimal/1000);
        return (result/100)*(100-discount);
    }
}
