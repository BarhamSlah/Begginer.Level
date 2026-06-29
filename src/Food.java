import java.util.Scanner;

public class Food {
    public static void main(String[] args) {

        Scanner resturant = new Scanner(System.in);

        System.out.println("Welcome to Syamand Resturant");
        System.out.println("This is our foods");
        System.out.println("(Pizza - Burger - Sandwich - Finger - Hotdog - Fried_Chicken - Tacos)");

        double Pizza = 6000.0;
        double Burger = 4000.0;
        double Sandwich = 3500.0;
        double Finger = 2000.0;
        double Hotdog = 3500.0;
        double Fried_Chicken = 7000.0;
        double Tacos = 4000.0;
        double finalTotal = 0;

        System.out.print("How many type of food ");
        int typeOfFood = resturant.nextInt();
        resturant.nextLine();

        for (int i = 1; i <= typeOfFood; i++) {

            System.out.print("What kinda of food do you order ");
            String nameOfFood = resturant.nextLine();

            System.out.print("How many ? ");
            int numberOfFood = resturant.nextInt();
            resturant.nextLine();


            System.out.print("How much of ordered food ");
            double price = resturant.nextDouble();
            resturant.nextLine();

            double total = numberOfFood * price ;
            System.out.println(total + " cost of " +  nameOfFood);
            finalTotal += total;

        }

        System.out.println("Final Total is = " + finalTotal);

        resturant.close();
    }

}