import java.util.Scanner;  // this line of code should be written for Scanner

    public class Improve {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            /* Scanner is a class & consnant
               sc is a variable & variable
               new Scanner is an object & consnant
               (System.in) is an object & variable but
                keep it if wanna flow datsa from user to program
             */


            System.out.println("Enter Your Name: ");
            String name = sc.nextLine();

            System.out.println("Welcome " + name);


    }
}
