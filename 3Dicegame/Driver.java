import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int numDice = 3, trails = 5;
        int playerPoints = 0, computerPoints = 0;
        Random choice = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the target number: ");
        int playerTarget = scan.nextInt();
        Game player = new Game(numDice,trails);
        playerPoints = player.play("Player:" ,playerTarget);
        int computerTarget = choice.nextInt(6)+1;//generate numb/w 1 to 6
        System.out.println("Computer choice is:"+ computerTarget);
        Game computer = new Game(numDice,trails);
        computerPoints = computer.play("Player: ", computerTarget);
        if (playerPoints > computerPoints){
            System.out.println("Winner, Winner, Chicken Dinner");
        } else if (computerPoints > playerPoints){
            System.out.println("OMG! it is a huge try again one more time moment");
        } else {
            System.out.println("you are not less than any computer champy");
            scan.close();
        }
    } 
}
