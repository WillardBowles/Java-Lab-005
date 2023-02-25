/**
 *
 * @author Trevor Hartman
 * @author Willard Bowles
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;
class Game {
        private Player p1;
        private Player p2;
        private Dice die;
        public Game(Player p1, Player p2, Dice die) {
                this.p1 = p1;
                this.p2 = p2;
                this.die = die;
        }
        public void play() {
                Player current = this.p1;
                takeTurn(current);
                current = nextPlayer(current);
                takeTurn(current);
                System.out.println(announceWinner());
        }
        private void takeTurn(Player player) {
                player.toss(this.die);
        }
        private Player nextPlayer(Player player) {
                if (player == this.p1) {
                        return this.p2;
                } else {
                        return this.p1;
                }
        }
        private String announceWinner() {
                // display each Player's name and score
                String result = this.p1.getName() + ": " + this.p1.getScore() + "\n";
                result += this.p2.getName() + ": " + this.p2.getScore() + "\n";
                // determine the winner
                String winner;
                if (this.p1.getScore() > this.p2.getScore()) {
                        winner = this.p1.getName();
                } else if (this.p2.getScore() > this.p1.getScore()) {
                        winner = this.p2.getName();
                } else {
                        winner = "It's a tie!";
                }
                // display the winner
                result += "The winner is " + winner + "!";
                return result;
        }
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the number of sides for the dice: ");
                int sides = input.nextInt();
                input.nextLine();
                Player p1 = new Player("Alice");
                Player p2 = new Player("Bob");
                Dice d = new Dice(sides);
                Game g = new Game(p1, p2, d);
                g.play();
        }
}