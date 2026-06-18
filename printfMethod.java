import java.util.Scanner;

public class Game{

public static void main(String[] args) {

Scanner bank = new Scanner (System.in);


System.out.print("Enter the amount of money by $ ");
double money = bank.nextDouble();

System.out.print("Enter rate of bank by % ");
double rate = bank.nextDouble() / 100;   // beacause it is percentage oyu should be divide by 100

System.out.print("In one year how many repeat the rate ");
int repeat = bank.nextInt();

System.out.print("how many year do you wanna participate ? ");
int year = bank.nextInt();

 double total = money * Math.pow(1 + (rate * repeat) , repeat * year );

 System.out.printf("Your money after %d year = $%.2f \n" , year , total);

 System.out.println("You got " + ((total - money) / year) + "$ per year" );

bank.close();

}
}
