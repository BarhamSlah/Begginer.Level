import java.util.Scanner;    // that line bring Scanner to the system for receive data from user

public class a {
    static void main(String[] args) {


        Scanner receive = new Scanner(System.in);
        /*
        Scanner is a class - constant
        receive is a name of object - variable
        new Scanner creator of object - constant
        (System.in) to receive data from keyboard - constant
         */

        System.out.print("Enter your name : ");
        String name = receive.nextLine();

        System.out.print("Enter your age : ");
         byte age = receive.nextByte();
         receive.nextLine();

        System.out.print("Enter your height : ");
        double height = receive.nextDouble();
        receive.nextLine();

        System.out.print("Enter your favourite color : ");
        String color = receive.nextLine();

        System.out.print("Enter your job : ");
        String job = receive.nextLine();

        System.out.print("Enter your favourite letter : " );
        char letter = receive.next().charAt(0);  
        // in the primivate datatype only char written by this sort

        System.out.println("this is your personal info , your name is " + name + " , your age is "
                + age + " , your height is " + height + " , your favourite color is " + color +
                " , your job is " + job + " , your favourite color is " + color);


receive.close();   // that is make the Scanner close
    }
}

/*
if you say how would I know when i write this line (receive.nextLine();) after all primivte datatype
except from String beacause if you don't write this line the sout are print next to each other
*/
