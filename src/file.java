import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class file {
    public static void main(String[] args) {

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

        System.out.print("Enter your favourite letter : ");
        char letter = receive.next().charAt(0);

        try (PrintWriter writer = new PrintWriter("personal_info.txt")) {
            writer.println("Name: " + name);
            writer.println("Age: " + age);
            writer.println("Height: " + height);
            writer.println("Color: " + color);
            writer.println("Job: " + job);
            writer.println("Letter: " + letter);

            System.out.println("your data saved successfully");
        } catch (IOException e) {
            System.out.println("if there is a mistake happen " + e.getMessage());
        }

        receive.close();
    }
}