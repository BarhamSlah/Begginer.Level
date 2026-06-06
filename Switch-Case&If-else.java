/*
In Java we have 51 keywords by the time you learn it throughout the course 
You can`t use the keywords to variables for instance :
int double = 2; // this is false
int double2 = 2;  // this  is  true
Now we talk about rules for naming variables called (Identifiers):
1 _ ($) is acceptable anywhere
2 _ (_) is acceptable anywhere
3 _ (number) is acceptable but not  in the beginning
4 _ (-) that is not acceptable  
 */
 
 /* && dabet hardkw marj true bet awja rasta  
 || dabet yak marj yan hardwk true bet awja  rasta */ 
int highScore = 100;
int health = 200;
 if ((highScore > 50) && (health > 150)) {  
highScore -=10;
 health  -=20;
 System.out.println(health + highScore);     // anjamy health w highScore kodakretawa watta dabeta 270
 }

/* awa 5 shta sar ba if-statementa ( if , { , } , ( , ) 
expression :
1 - health > 150
2 - highScore > 50
3 - (highScore > 50) && (health > 150)
4 - highScore -=10;
5 - highScore = 10
6 - health -=20;
7 - health = 20
*/
 
 /*
 int   a    = 
 2        ;   datwany bam shewa code bnwsy ballam bash w jwan nya
 */
 
System.out.println(" there are" + 
              " a lot of line" +
                   " we wrote");
    /*codey sout la haman line yan liney jyawaz bnwsy farqy nya ballam bo jwany w memory la haman line bnwsy jwantra
ballam agar codey sout la liney jyawaz bnwsy dabet baw shewazay sarawa bet nak tanha leky jya bkayawa awa hallaya (" a
n");  */
 
 float myFloatValue = 30f;
  myFloatValue ++;   // nawy variable chy bet daby bo aw jora codeash haman sht bkay  + am jora code 1 bo variable zyad daka
 myFloatValue --;    //  nawy variable chy bet daby bo aw jora codeash haman sht bkay  + am jora code 1 la variable kam dakatawa
 System.out.println( myFloatValue );

 /* hata if true  bet awany jeba je nabn pashan agar false bet else if je ba je dabet aagr if else false bet awa else je ba je dabet 
 ballam agar if w else if false bn awa hamisha else run dabet
 else pewist ba marj nakat  
*/

  int Score = 20;
 if((Score > 15) && (Score < 25)) {
  System.out.println(" your score is between 15 and 25");
 } else if (Score == 20) {                          
  System.out.println(" your score equal 20 ");
 } else {
  System.out.println(" your score less than thirty ");
 }

boolean isStudent = false;
 if (isStudent) {
 System.out.println(" this is the student ");
 } else {
  System.out.println(" this is not the student ");
 }    //la rstay (if w else ) agar if true bw awa bas rstay if execute dabet ballam agar rstay if false bw awa rstay else execute dabet 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
aagr break nanwsy awa casey dway xoy run dabet 

aw variabley ka dakreta naw switch dabet tanha yakak law shtaan bet (byte , short , int , String , char , enum) 
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int yourValue = 3;              

        switch (yourValue) {

            case 1:
                System.out.println("your number is one");
                break;
            case 2:
                System.out.println("your number is two");
                break;
            case 3 : case 4 : case 5:
                System.out.println("your number is three , four , or five");
                System.out.println("your number is absoultely  = " + yourValue);
                break;

            default:
                System.out.println("your number is not 1 , 2 , 3 , 4 , or 5");

        }
   // agar la condition expression habw awa if-statement bakar bena ballam agar la condition tanha yak value habw awa switch-case bakar bena
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
   int switchValue = 4;

    switch (switchValue){

        case 1 -> System.out.println("Your number is one");
        case 2 -> System.out.println("Your number is two");
        case 3 ,  4 ,  5 -> {
            System.out.println("Your number is three , four , or five");
            System.out.println("Your number is exactly = " + switchValue );
        }
        default -> System.out.println("Your number is not 1 , 2 , 3 , 4 , or 5 ");
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Bit {

    public static void main(String[] args) {

        System.out.println( months("jun") + " in 2026");

    }

     public static String months(String  nameOfMonth){

      return  switch (nameOfMonth){

            case "jan" , "feb" , "mar" -> { yield "fisrt quater"; }

            case "apr" , "may" , "jun" ->  "second quater";

            case "jul" , "aug" , "sep" ->  "third quater";

          default -> "fourth quater";

        };

     }

}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
/* yield pewista lanaw code block bnwsret ballam agar yak value bw pewist ba yield naka 
yield reeeekkkk wakw return waya ballam yield keywordy taybata lanaw switch-case 
katek switch 
*/






