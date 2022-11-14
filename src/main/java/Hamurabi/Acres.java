package Hamurabi;

public class Acres {

    int bushel;
    int ratsAte;
    int acresOwned;


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


}

