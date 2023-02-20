import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*Is this where all great programs begin?
 * This feels very primitive, but it's a start nonetheless.
 */

public class App {

    private static List<String> cardList; //store names and amounts
    private static int cardCount;

    
    private static void addCards(String cardName, int howMany) {
        if (howMany != 0) {
            cardList.add(howMany + " " + cardName);
            cardCount = cardCount + howMany;
        }
    }
    
    private static void printCards() throws Exception { //TODO: have this write out into a .txt file 
        if(cardCount <= 0) {
            throw new Exception("Decklist is empty. ");
        }
        for (String card : cardList) {
            System.out.println(card);
        }
        System.out.println(cardCount);
    }

    private static void run() throws Exception {
        Scanner scanner = new Scanner(System.in);
        cardList = new ArrayList<>();

        System.out.println("Add cards to your decklist here. Enter nothing to print out your decklist. ");

        while(true) {
            System.out.println("Card name: ");
            String name = scanner.nextLine();
            if(name == "") {
                break;
            }
            System.out.println("Amount: ");
            int amount = scanner.nextInt();
            scanner.nextLine(); //consume the newline character

            addCards(name, amount);

        }
        scanner.close();
        printCards();
    }
    
    
    public static void main(String[] args) throws Exception {
        System.out.println("It sure runs, but nothing is ready yet.");
        run();
    }
}
