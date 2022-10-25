/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);

        System.out.println("What are your names?");
        String name1 = in.nextLine();
        String name2 = in.nextLine();

        if (name1.equalsIgnoreCase("Alice") || name1.equalsIgnoreCase("Bob")) {
            System.out.println("Greetings " + name1 + "!");
        }
        if (name2.equalsIgnoreCase("Alice") || name2.equalsIgnoreCase("Bob")) {
            System.out.println("Greetings " + name2 + "!");
        }
        if (!name1.equalsIgnoreCase("Alice") && !name2.equalsIgnoreCase("Alice")){
            System.out.println("Where's Alice?!");
        }
        if (!name1.equalsIgnoreCase("Bob") && !name2.equalsIgnoreCase("Bob")){
            System.out.println("Where's Bob?!");
        }
    }
}
