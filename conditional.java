public static conditional {
public static void main (String [] args) {

 // from now on intellij begin 
 /*
bash nya la katy nwsyni Address w project space bakar bet labar bwny kesha w vairous la hande OS
Upper w Lower bakardet katek 
1 _ natwanit space bakar benit watta bo more readable
2 _ agar la teamek kar bkait hamw dazann ka (user) variablea ballam (User) classa
Upper camel case ( pascal case) : used for clasess and interface
lower camel case : used for variable and functions
 */

/* la rstay if agar curly braces bakar nahenin awa conditionaka tanha bo rstay yakama watta agar conditionaka true bw 
 awa rstay yakam run dabet ballam agar conditionaka false bet awa tanha rstay yakam run nabet w la har dw hallat 
  rstakany tr run dabn bo away twshy le rabe awa agar tanha yak rstat habw curly braces bakar bhena */

boolean isCar = false;
 if (isCar)
  System.out.println(" this is your car");     // labar away ka curley braces nya boya tanha aw statementa sarba baw rstay marjaya  
 System.out.println(" this is not your car");    // labar away ka curley braces nya boya aw rsataya hamisha run dabet wakw rstayaky asayi waya

boolean isCar = true;
 if (isCar) 
 System.out.println(" this is your car"); 
/*
 hokary away ka nabet la rstay if ; habet awaya ka agar falsesh bet codeaka har run dabet
 (isCar) = (isCar == true) boya true danrawa labar away ka lz sarawa isCar = true ballam bam sheway sarawa Pro tra
*/

 boolean isCar = false;
 if (!isCar)   //NOT operator = logical complent operator = !
  System.out.println(" this is your car ");

boolean isCar = false;
 if (isCar = true)   // lerada hsab bo daraway kawana nakre labar away to nrxy variablet gory w tanha la boolean datwany 1 (=) dabney lanaw kawana watta assignment bkay nak comparasion  
 System.out.println(" this is car ");

 System.out.print(" barham \n is the best programmer ");     // am \n wa dakat ka codey haman line outputy line jyawaz be
 
  System.out.println ("Barham " + "2026");
  System.out.println ("Barham" + " 2026");    // am 3 code haman outputyan haya 
  System.out.println (" Barham" +  " " + "2026 ");

/*
        int a = 20 , b = 26;
        System.out.println(a + b):       //46
        System.out.println("" + a + b);  //2026
        System.out.println(" " + a + b); // 2026
        System.out.println( a + "" + b); //2026
        System.out.println(a + " " + b); //20 26
        ballam nabet aw double quote la la kotaye dabney 
*/

boolean gameOver = true;
int score = 1000;
int levelCompleted = 5;
 int bouns = 200;
 int finalScore = (score + bouns);
 if (gameOver) {
  finalScore += (levelCompleted * finalScore);
  System.out.println(" Your final score = " + finalScore );
 }
 
// esta dabe haman codey liney (263 ta 272) be away ka hich dastkary bkay  ballam ba shewazek ka btwany hamw shewazakan la haman method bn 
// ba 2 shewaz datwany ka aw codea bnwsy be  away edit bo codea asllyaka bkay awish 
 /*
 1 _ nawy variable  bgory 
 2 _  datatype rashbkayawa 
 */

int secondScore = 1000;
int secondLevelCompleted = 5;
 int secondBouns = 200;
 int secondFinalScore = (secondScore + secondBouns);
 if (gameOver) {
  secondFinalScore = (secondLevelCompleted * secondFinalScore);   //here 
  System.out.println(" Your final score = " + secondFinalScore );
 } 
 
 secondScore = 1000;
 secondLevelCompleted = 5;
 secondBouns = 200;
 secondFinalScore = (secondScore + secondBouns);
 if (gameOver) {
  secondFinalScore = (secondLevelCompleted * secondFinalScore);  // here 
  System.out.println(" Your final score = " + secondFinalScore );
 } 
 
  }
}
