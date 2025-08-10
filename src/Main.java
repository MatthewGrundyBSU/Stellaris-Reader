

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/* Fallen Empire Homeworlds
    Enigmatic Observers = Cradle
    Militant Isolations = The Core
    Holy Guardians = Celestial Throne
    Keepers of Knowledge = Font of Knowledge
    Ancient Caretakers = Alpha Complex
    Shattered Fragments? = Redoubt
*/

class exists {
    boolean observers = false;
    boolean isolationists = false;
    boolean keepers = false;

}

;

public class Main {


    public static void main(String[] args) {

        exists whatExists = new exists(); // creates the class

        //File file = new File(args[0]);
        File file = new File("gamestate2"); // Has Observers, Isolations, and Keepers

        // Does file exist?

        try {
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                String lineScanner = fileScanner.nextLine().trim();

                //stem.out.println("!"+ lineScanner);

                if (lineScanner.contains("key=\"NAME_Cradle\"")) {
                    whatExists.observers = true;
                }
                if (lineScanner.contains("key=\"NAME_The_Core\"")) {
                    whatExists.isolationists = true;
                }
                if (lineScanner.contains("key=\"NAME_The_Archives\"")) { // not the capital I couldn't find font of Knowledge for some reason
                    whatExists.keepers = true;
                }


            }

            if(whatExists.observers){
                System.out.println("Observers Exist");
            }
            if(whatExists.isolationists){
                System.out.println("Isolationists Exist");
            }
            if(whatExists.observers){
                System.out.println("Keepers Exist");
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}