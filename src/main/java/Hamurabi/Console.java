package Hamurabi;

import java.util.Scanner;

public class Console {
    int bushelsPerAcre;
    int acresOwned;
    int population;
    Scanner scanner = new Scanner(System.in);
    Hamarabi hamarabi = new Hamarabi();
    public int askHowManyAcresToBuy(){
        System.out.println("How many acres would you like to buy?");
        int userInput = scanner.nextInt();
        return hamarabi.askHowManyAcresToBuy(bushelsPerAcre, userInput);
    }


    public int askHowManyAcresToSell(){
        System.out.println("How many acres would you like to sell?");
        int userInput = scanner.nextInt();
        return hamarabi.askHowManyAcresToSell(userInput, acresOwned);
    }

    public int askHowMuchGrainToFeedPeople(){
        System.out.println("How much grain would you like to feed your people?");
        int userInput = scanner.nextInt();
        return hamarabi.askHowMuchGrainToFeedPeople(userInput);
    }

    public int askHowManyAcresToPlant(){
        System.out.println("How many acres would you like to plant?");
        int userInput = scanner.nextInt();
        return hamarabi.askHowManyAcresToPlant(acresOwned, population, userInput );
    }
    public void setBushelsPerAcre(int bushelsPerAcre) {
        this.bushelsPerAcre = bushelsPerAcre;
    }
    public int getBushelsPerAcre() {
        return bushelsPerAcre;
    }
}
