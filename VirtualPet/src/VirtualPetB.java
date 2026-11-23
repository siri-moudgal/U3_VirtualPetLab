// Part B

public class VirtualPetB {
        private String name;
        private int weight;
        private int energyLevel;
        private int happinessLevel;
        private int ageYears;
        private int ageMonths;

        public VirtualPetB(String name) {
            this.name = name;
            energyLevel = 0;
            happinessLevel = 0;
            weight = 5;
            ageYears = 0;
            ageMonths = 0;
        }

        public String getName() {
            return name;
        }

        public int getEnergyLevel() {
            return energyLevel;
        }

        public int getWeightGrams() {
            return weight;
        }

        public int getHappinessLevel() {
            return happinessLevel;
        }

        public int getAgeYears() {
            return ageYears;
        }

        public int getAgeMonths() {
            return ageMonths;
        }

        public String toString() {
            return name + "'s Information:\n" +
                    "Energy: " + energyLevel + "\n" +
                    "Happiness: " + happinessLevel + "\n" +
                    "Weight: " + weight + "g\n" +
                    "Age: " + ageMonths + " months\n" +
                    "and " + ageYears + " years";
        }

        public void feed(Food food) {
            energyLevel += food.getEnergyRating();

            if (energyLevel > 10) {
                energyLevel = 10;
            }

            if (energyLevel < 0) {
                energyLevel = 0;
            }

            happinessLevel += food.getHappinessRating();

            if (happinessLevel > 10) {
                happinessLevel = 10;
            }

            if (happinessLevel < 0) {
                happinessLevel = 0;
            }

            weight += food.getWeightGain();

            if (weight < 5) {
                weight = 5;
            }
        }

        public boolean play(Game game) {
            boolean won = game.isWinner();

            weight -= game.getWeightLoss();

            if (weight < 5) {
                weight = 5;
            }

            if (won) {
                happinessLevel += game.getHappinessIncr();
            } else {
                happinessLevel -= game.getHappinessIncr();
            }

            if (happinessLevel > 10) {
                happinessLevel = 10;
            }

            if (happinessLevel < 0) {
                happinessLevel = 0;
            }

            return won;
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
    

