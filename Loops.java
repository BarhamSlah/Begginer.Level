/*  
i know you ask how would i know use for , while , do-while loop ? 
for loop : when you exactly know that how many times repeat 

while loop : when you don't konw that hoe many times repeat OR we can say execute till the condition will be false

do-while loop : The do-while loop is very similar to the while loop, with one major difference: it executes the code block first,
and then checks the condition. This guarantees that the loop will run at least once, no matter what OR we can say the code will run 
at least one time , then continue till the condition will be false
*/

/*
1 - (searching) : katek zanayaryakt dast dakawet pewist nakat zwa w katy CPU ba firo bday watta lanaw loop bakardet
2 - (switch-case) : katek traditional switch-case bakardeny 
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Bit {

    public static void main(String[] args) {

        for (int i = 10; i <= 20; i++) {

            System.out.println(i);
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// awa pet dalet la bry awanda paraya awanda swd wardagiret
        public class Barham {
  public static void main(String[] args) {

      calculateInterest(200);
  }

      public static void calculateInterest(double constant) {

          for (double rate =  7.5 ; rate <= 10.0 ; rate += 0.25 ){
              double division = (rate/ 100) * constant;
              System.out.println(rate + " % receive for each " + constant + "$ it means " + division + "$");

          }
      }

    }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
            int b = 25;
            while (b <= 35) {
                System.out.println(b);
                b++;
            }

        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////
// ragrtny barnama bo mawayak 

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) throws InterruptedException {
        // marja awa bnwsit agar wistt bo mawayak program rabgry 

        Scanner scanner = new Scanner (System.in);

        System.out.print("Do you wanna countdown from what number ? ");
        int yourNumber = scanner.nextInt();

        for(int i = 1 ; i <= yourNumber ; --yourNumber){
            System.out.println(yourNumber);
            Thread.sleep(1000);   // aw zhmaraya hamisha (ms) a.
        }
        System.out.println("HBD 🎂🎂🎂🎂🎂🎂");
    }
}
//////////////////////////////////////////////////////////////////////////
// basy har yaka la (CONTINUE & BREAK)

 for(int i = 1; i <= 10 ; i++){
           System.out.println(i);

           if(i == 5){
              break;
           }
       }
////////////////////
    for(int i = 1; i <= 10 ; i++){

           if(i == 5) {
               continue;
           }
           System.out.println(i);

       }
    }
}
////////////////////////////////////////////////////////////////////////////////////


