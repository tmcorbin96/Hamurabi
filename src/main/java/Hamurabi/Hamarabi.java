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
    int amountOfBushelsOwned = 2800;
    int acresOwned = 1000;
    int bushelsPerAcre = 19;
    int bushelsFedToPeople = 0;
    int ratsAte = 0;
    int starved = 0;
    int bushelsHarvested = 0;
    int newPeople = 0;
    int year = 1;
    int bushelsUsedAsSeed = 0;

//////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) { // required in every Java program
        new Hamarabi().playGame();
    }

    void playGame() {
        /////////////////////////////////////VARIABLES



        System.out.println("O great Hammurabi!  You are in year " + year + " of your ten year rule. " +
                        "In the previous year " + starved + " people starved to death. ");
        System.out.println("In the previous year " + newPeople + " people entered the kingdom.");
        System.out.println("The population is now " + population + " .  We harvested " + bushelsHarvested + " bushels at 3 bushels per acre.");
        System.out.println("Rats destroyed " + ratsAte + " bushels, leaving " + amountOfBushelsOwned + " bushels in storage. The city owns " + acresOwned + " acres of land. ");
        System.out.println("Land is currently worth " + bushelsPerAcre + " bushels per acre.");

    Console console = new Console();
    System.out.println(console.askHowManyAcresToBuy());
    System.out.println(console.askHowMuchGrainToFeedPeople());
    System.out.println(console.askHowManyAcresToPlant());
    System.out.println(console.askHowManyAcresToSell());

    System.out.println("oops, looks like God hates Hammurabi. Everybody dies from depression. " +
            "EVERYBODY DIES");


////////////////////////////////////////////////////////////////////
        // statements go after the declations
    }

    //other methods go here
    public int askHowManyAcresToBuy(int bushelsPerAcre, int acresToBuy){
        if (bushelsPerAcre * acresToBuy > amountOfBushelsOwned){
            System.out.println("Try again.");
            acresToBuy = scanner.nextInt();
        } else {
            amountOfBushelsOwned = amountOfBushelsOwned - (bushelsPerAcre * acresToBuy);
        }
        return acresToBuy;
    }

    public int askHowManyAcresToSell(int acresToSell, int acresOwned){
        if (acresOwned - acresToSell <= 0){
            System.out.println("Try again");
            scanner.nextInt();
        }
//            acresOwned = acresOwned - acresToSell;
//            amountOfBushelsOwned = amountOfBushelsOwned + (acresToSell * bushelsPerAcre);
        return acresToSell;
    }

    public int askHowMuchGrainToFeedPeople(int bushel){
        if (bushel > amountOfBushelsOwned){
            System.out.println("Try again.");
        } else if (bushel < amountOfBushelsOwned){
//            amountOfBushelsOwned = amountOfBushelsOwned - bushel;
            bushelsFedToPeople = bushel;
        }
        return bushelsFedToPeople;
    }

    public int askHowManyAcresToPlant(int acresOwned, int population, int bushelsUsedAsSeed){
        if (bushelsUsedAsSeed > population * 10 || bushelsUsedAsSeed > acresOwned){
            System.out.println("Try again");
        } else if (bushelsUsedAsSeed <= population *  10 && bushelsUsedAsSeed < acresOwned){
        } return bushelsUsedAsSeed;
    }

}
