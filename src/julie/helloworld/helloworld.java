package julie.helloworld;

import java.util.Scanner;
public class helloworld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("what is your first name?");
        String first = scanner.nextLine();
        System.out.println("\nyour first name is " + first);
        System.out.println("what is your age?");
        String age = scanner.nextLine();
        System.out.println("\nyour age is " + age);
        System.out.println("\nyour name is " + first + "and your age is " + age);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("EXIT")) {
                break;
            }
        }

        System.out.println("bye");
    }
}


/* you're actually reading my code? here's an ascii raccoon
       .-.
               .-"` .`'.    /\\|
        _(\-/)_" ,  .   ,\  /\\\/
        {(#b^d#)} .   ./,  |/\\\/
      `-.(Y).-`  ,  |  , |\.-`
           /~/,_/~~~\,__.-`
        ////~    // ~\\
        jgs   ==`==`   ==`   ==`
    */
