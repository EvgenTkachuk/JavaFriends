public class Airplanes {
    public static void main(String[] args) {
        String[] type= {"Jet", "Airliner", "Airliner"};
        String[] model= {"F-22 Raptor", "Aerobus 737", "Boeing 777"};
        int[] businessClassSeats = {0 , 0, 28};
        int[] economyClassSeats = {0, 120, 180};
        printAirplaneInfo(type[0], model[0]);
        printAirplaneInfo(type[1], model[1], economyClassSeats[1]);
        printAirplaneInfo(type[2], model[2], businessClassSeats[2], economyClassSeats[2]);
    }
    public static void printAirplaneInfo(String type, String model){
        System.out.printf("Тип літака: %s, модель: %s.\n",
                type, model);
    }
    public static void printAirplaneInfo(String type, String model, int economyClassSeats){
        System.out.printf("Тип літака: %s, модель: %s, кількість пасажирів економ класу: %d.\n",
                type, model, economyClassSeats);
    }
    public static void printAirplaneInfo(String type, String model, int businessClassSeats, int economyClassSeats){
        System.out.printf("Тип літака: %s, модель: %s, кількість пасажирів економ класу: %d, кількість пасажирів бізнес класу: %d.\n",
                type, model, economyClassSeats, businessClassSeats);
    }
}
