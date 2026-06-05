import java.util.Scanner;

    public class Exercise {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter The First Number: ");
            int number1 = sc.nextInt();

            System.out.println("Enter The Second Number: ");
            int number2 = sc.nextInt();

            System.out.println("Enter your third Number : ");
            int number3 = sc.nextInt();

            int sum = number1 + number2 + number3;
            System.out.println("Sum = " + sum);



        }
    }
