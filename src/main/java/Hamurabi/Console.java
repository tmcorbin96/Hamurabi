package Hamurabi;

import java.util.Scanner;

public class Console {
    int bushelsPerAcre = 19;
    int acresOwned = 2800;
    int population = 100;

    public Hamarabi getHamarabi() {
        return hamarabi;
    }


    Scanner scanner = new Scanner(System.in);
    Hamarabi hamarabi = new Hamarabi();
    public int askHowManyAcresToBuy(){
        System.out.println("How many acres would you like to buy?");
        int userInput = scanner.nextInt();
        return hamarabi.amountOfBushelsOwned - (userInput*19);
    }


    public int askHowManyAcresToSell(){
        System.out.println("How many acres would you like to sell?");
        int userInput = scanner.nextInt();
        return hamarabi.acresOwned -userInput;
    }

    public int askHowMuchGrainToFeedPeople(){
        System.out.println("How much grain would you like to feed your people?");
        int userInput = scanner.nextInt();
        return hamarabi.amountOfBushelsOwned- userInput;
    }

    public int askHowManyAcresToPlant(){
        System.out.println("How many acres would you like to plant?");
        int userInput = scanner.nextInt();
        return hamarabi.acresOwned - userInput;
    }
    public void setBushelsPerAcre(int bushelsPerAcre) {
        this.bushelsPerAcre = bushelsPerAcre;
    }
    public int getBushelsPerAcre() {
        return bushelsPerAcre;
    }
}
