// Part A

public class VirtualPet {
    private String name;
    private int weightGrams;
    private int energyLevel;
    private int happinessLevel;
    private int ageYears;
    private int ageMonths;

    public VirtualPet(String name){
        this.name= name;
        this.weightGrams = 5;
        this.energyLevel = 0;
        this.ageMonths = 0;
        this.ageYears = 0;
        this.happinessLevel = 0;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return name + "'s Information:\n" + "Energy: " + energyLevel + "\n" +
                "Happiness: " + happinessLevel + "\n" + "Weight: " + weightGrams + "g\n" +
                "Age: " + ageMonths + " months\n" + "and " + ageYears + " years";
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void feed(){
        if(energyLevel < 10){
            energyLevel++;
        }
        weightGrams++;
    }
    public void play(){
        if(weightGrams > 5){
            weightGrams--;
        }
    }
    public void updateStatus() {
        if (energyLevel > 0) {
            energyLevel--;
        }

        if (happinessLevel > 0) {
            happinessLevel--;
        }
        ageMonths++;

        if (ageMonths == 12) {
            ageYears++;
            ageMonths = 0;
        }
    }

}



