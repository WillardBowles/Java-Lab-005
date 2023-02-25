class Player {
    private String name;
    private int score;

    // define the Player constructor that takes a String parameter name
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        // return the name
        return this.name;
    }

    public int getScore() {
        // return the score
        return this.score;
    }

    public void toss(Dice die) {
        // roll the die and record its view score
        die.roll();
        this.score += die.view();
    }
}