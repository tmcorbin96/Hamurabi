package Hamurabi;
import java.util.Random;
import java.util.Scanner;

public class Hamarabi {
    Random rand = new Random();  // this is an instance variable
    Scanner scanner = new Scanner(System.in);

/////////////////////////////////////////////////////CONSTANTS
        private static final int MIN_BUSHELS_FOR_SURVIVAL = 15;
        private static final int MAX_LAND_PER_PERSON = 10;
        private static final int MAX_SEEDS_PER_ACRE = 5;
    int population = 100;
    int bushel = 2800;
    int acresOwned = 1000;
    int price = 19;
    int bushelsToFeedPeople= 0;
    int ratsAte = 0;
    int starved = 0;
    int harvest = 0;
    int newPeople = 0;
    int year = 1;

//////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) { // required in every Java program
        new Hamarabi().playGame();
    }

    void playGame() {
        /////////////////////////////////////VARIABLES



        System.out.println("O great Hammurabi!  You are in year " + year + " of your ten year rule. " +
                        "In the previous year " + starved + " people starved to death. ");
        System.out.println("In the previous year " + newPeople + " people entered the kingdom.");
        System.out.println("The population is now " + population + " .  We harvested " + harvest + " bushels at 3 bushels per acre.");
        System.out.println("Rats destroyed " + ratsAte + " bushels, leaving " + bushel + " bushels in storage. The city owns " + acresOwned + " acres of land. ");
        System.out.println("Land is currently worth " + price + " bushels per acre.");




////////////////////////////////////////////////////////////////////
        // statements go after the declations
    }

    //other methods go here
    public int askHowManyAcresToBuy(int price, int bushel){
        int currentBushels = 0;
        System.out.println("How many acres would you like to buy?");
        int userInput = scanner.nextInt();
        if (price * userInput > bushel){
            System.out.println("Try again.");
            scanner.nextInt();
        } else if (price * userInput < bushel){
            currentBushels = bushel - (price * userInput);
        }
        return currentBushels;
    }

    public int askHowManyAcresToSell(int price, int acresOwned){
        int currentBushels = 0;
        System.out.println("How many acres would you like to sell?");
        int userInput = scanner.nextInt();
        currentBushels = acresOwned - userInput;
        if (currentBushels == 0){
            System.out.println("Try again");
            scanner.nextInt();
        }
        return currentBushels;
    }

    public int askHowMuchGrainToFeedPeople(int bushel){
        int currentBushels = 0;
        System.out.println("How much grain would you like to feed your people?");
        int userInput = scanner.nextInt();
        if ()
    }
}
