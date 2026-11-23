// Part B

public class Game{
    private String name;
    private int happinessIncr;
    private int weightDecr;


    public Game(String name, int happinessIncr, int weightLoss) {
        this.name = name;
        this.happinessIncr = happinessIncr;
        this.weightDecr = weightLoss;
    }

    public String getName() {
        return name;
    }

    public int getHappinessIncr() {
        return happinessIncr;
    }

    public int getWeightLoss() {
        return weightDecr;
    }

    public boolean isWinner() {
        return Math.random() < 0.5;
    }
}