import java.util.Random;

class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    // define the Dice constructor
    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
    }

    // define the roll method
    public void roll() {
        // use randomGenerator to generate a random number between 1 and sides
        int randomNumber = randomGenerator.nextInt(sides) + 1;
        this.sideFacingUp = randomNumber;
    }

    public int view() {
        return this.sideFacingUp;
    }
}
