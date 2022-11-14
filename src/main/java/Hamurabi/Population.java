package Hamurabi;

public class Population {

    int population;
    int newPeople;
    int starved;
    int plagueDeaths;
    public Population(int population, int newPeople, int starved, int plagueDeaths) {
        this.population = population;
        this.newPeople = newPeople;
        this.starved = starved;
        this.plagueDeaths = plagueDeaths;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getNewPeople() {
        return newPeople;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    public int getStarved() {
        return starved;
    }

    public void setStarved(int starved) {
        this.starved = starved;
    }

    public int getPlagueDeaths() {
        return plagueDeaths;
    }

    public void setPlagueDeaths(int plagueDeaths) {
        this.plagueDeaths = plagueDeaths;
    }

}
