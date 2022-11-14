package Hamurabi;

import java.util.Random;

public class Acres {
    Random rand = new Random();
    int bushel;
    int ratsAte;
    int acresOwned;
    int bushelsHarvested;
    int bushelsPerAcre;


    public Acres(int bushel, int ratsAte, int acresOwned) {
        this.bushel = bushel;
        this.ratsAte = ratsAte;
        this.acresOwned = acresOwned;
    }

    public int getBushel() {
        return bushel;
    }

    public void setBushel(int bushel) {
        this.bushel = bushel;
    }

    public int getRatsAte() {
        return ratsAte;
    }

    public void setRatsAte(int ratsAte) {
        this.ratsAte = ratsAte;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int harvest(int acres, int bushelsUsedAsSeed){
        int harvest = rand.nextInt((6 - 1) + 1) + 1;
        acres = bushelsUsedAsSeed;
        bushelsHarvested = acres * harvest;
        return bushelsHarvested;
    }

    public int newCostOfLand(){
        int bushelsPerAcre = rand.nextInt(23 - 17 + 1) + 17;
        return bushelsPerAcre;
    }

//    public int grainEatenByRats(int bushels){
//        int percentageEaten = rand.nextInt(100) < (rand.nextInt(30 - 10 + 1) + 10);
//        if (rand.nextInt(100) < 40) {
//            if (){
//
//            }
//            }
//        }
    }


