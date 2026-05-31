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


String day = "one";

 switch (day) {

   case "one":
     System.out.println("Saturday");
     break;
   case "one":
     System.out.println("sunday");
     break;
   default "one":
     System.out.println("Monday");
     break;



        int myValue = 10;

        switch (myValue) {

            case 10:
                System.out.println("Your Value Is Ten");
                break;

            case 20:
                System.out.println("Your Value Is Twenty");
                break;

            case 30:
                System.out.println("Your Value Is Thirty");
                break;

            default:
                System.out.println("Your Value Is Not Ten or Twenty or Thirty");


          /*
          

          
         */
        }
