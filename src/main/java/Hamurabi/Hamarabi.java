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
//////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) { // required in every Java program
        new Hamarabi().playGame();
    }

    void playGame() {
        /////////////////////////////////////VARIABLES
        int population = 100;
        int grain = 2800;
        int acresOwned = 1000;
        int grainPerAcre = 19;
        int bushelsToFeedPeople= 0;
        int ratsAte = 0;
        int starved = 0;
        int harvest = 0;
        int newPeople = 0;
        int year = 1;


        System.out.println("O great Hammurabi!  You are in year " + year + " of your ten year rule. " +
                        "In the previous year " + starved + " people starved to death. ");
        System.out.println("In the previous year " + newPeople + " people entered the kingdom.");
        System.out.println("The population is now " + population + " .  We harvested " + harvest + " bushels at 3 bushels per acre.");
        System.out.println("Rats destroyed " + ratsAte + " bushels, leaving " + grain + " bushels in storage. The city owns " + acresOwned + " acres of land. ");
        System.out.println("Land is currently worth " + grainPerAcre + " bushels per acre.");




////////////////////////////////////////////////////////////////////
        // statements go after the declations
    }

    //other methods go here
}
