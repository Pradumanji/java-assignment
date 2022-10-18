/* 3) Use random class to implement blackjack card game. */
import java.util.*;

public class Assignment_09_Question3 {
    String input;
    char reDo;
    Scanner keyboard = new Scanner(System.in);
    Random random = new Random();
    int card1 = random.nextInt(10) + 1;
    int card2 = random.nextInt(10) + 1;
    int card = random.nextInt(10) + 1;
    int total1 = card1 + card2;
    int total2 = total1 + card;

    System.out.print("First cards: "+card1+", "+card2+"\n");System.out.print("Total: "+total1+"\n");

    boolean loop = true;while(loop)
    {
        System.out.print("Do you want another card? (y/n): ");
        input = keyboard.nextLine();
        reDo = input.charAt(0);
        if (reDo == 'y' || reDo == 'Y') {
            System.out.print("Card: " + card + "\n");
            System.out.print("Total: " + total2 + "\n");
        } else if (reDo == 'n' || reDo == 'N') {
            loop = false;
        }
    }
}}
