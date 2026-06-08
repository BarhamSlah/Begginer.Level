import java.util.Scanner;

public class a {
    static void main(String[] args) {


        Scanner receive = new Scanner(System.in);

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

        System.out.println("this is your personal info , your name is " + name + " , your age is "
                + age + " , your height is " + height + " , your favourite color is " + color +
                " , your job is " + job + " , your favourite color is " + color);


receive.close();
    }
}
