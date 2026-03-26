public static method {
  public static void maid (String [] args) {

 /*
the disadvantage with copying and pasting code is we are duplicating code that mean if we need to 
 make change then we need to change it in more than one place and  if we forget that our code is 
 duplicated we may forget  to change it in one place for example : 
 lerada 2 secondFinalScore man haya ballam labar away ema copy w paste man krdya boya agar dastkary
 yakekyan bkain awa awaytr gorankary basar naya chwnka copy w pastea
 */

/* Methods:take the code block to the next level and effectively allow us to reuse that code in many 
places with the code written in just a single place so we type the code once and reuse it many time

swdakany method : 1- reduce duplication code 
2- datwane chand anjameky jyawazt bdate ba pey aw argumentay pey daday 

All the code  between the left and right curly braces is the called (method block ) & (method body) 
You can use any name for method & use lower camel case to name method

to execute the method we should be write a line of code that called invoking / called method 
for simple method we just write the name of method that followed by ();

when your color of method is changed from the light gray to normal black that mean your method 
is used and that is not allowed to delete this method but if the color is light gray it is 
normal to delete the method

when you make method you use parameter that you write (datatype + varibale)

when you call method you use arguments that you write (value or variable) 

when you delete the variables , you should be make a ( Parameter & Arguments ) 
*/

 boolean gameOver = true;
 int score = 800;
 int levelCompleted = 5;
 int bonus = 100;
 int finalScore = score;
 
 if (gameOver) {
 finalScore += (levelCompleted * bonus)
 finalScore += 1000;
 System.out.println("Your final score was " + finalScore);
 }  

 // katek to la liney 498 ta 508 delete dakay awa dabet call method bkay w parameter w argumentidh bkay 
  
 calculateStore(true, 800, 5, 100);   // la katy run krdn katek dagata call method dachet methodaka run dakat awja pashan detawa pash call method run daka

 /* 
 lera pewist nakat disan boolean gameOver = true; bnwsit agar darey chon bzanm har katek variable 2 agary habw bo nmwna : 
 (off/on) & (true/false) & (pass/fail) awa pewist nakat 2 jar binwsy
 */
 
 score = 10_000;
 levelCompleted = 8;
 bonus = 200;
 finalScore = score;

  if (gameOver) {
 finalScore += (levelCompleted * bonus)
 System.out.println("Your final score was " + finalScore);
  }
// disan katek la liney 514 ta 522 delete dakay awa dabet call method bkay w parameter w arguments bkay

// agar darey la hamw katek if-statement delete dakay awa tanha la 1 hallat nabet awish ( check null or wrong data ) 
 
/* agar daleit la bry if bo hich nanwsin awa am 2 xalla dabeta wallam 

1- agar jory datatypey method (void) bw awa hich nanwsy 
 
2- agar apart from void bw awa call method = variable la katy call method wa for instance:
int sum = calculateStore(); agar darey aw (int) la che har awa method ba ch declare kra bw awy danwsy 

katek return statement danwsy awa dabet yakek law 3 shta anjam bday : 

1- variable = call method   // (dabet yan haman datatype bet)  yan (rangey datatypey variable > rangey datatypey call method)

2- use call method in a expression 

3- System.out.println( call method )  */

   calculateStore(true, 800, 5, 100);
   /* labar away lera calculateScore hichy le nakrawawatta la 3 shtaka boya ignore dakret */
  
  /* agar darey chon bzanm method ba ch declare bkam awa agar :
watta away la pash return dainwsy kam lamanay xwarawaya

1 - return nabw watta tanha nwsin bw be return awa void 

2 - return habw watta tanha nwsin bw ba return awa String

3 - agar krdary birkary bw awa ba zhmaray tawaw int ba point double 

4 - agar false w true bw awa boolean 

5 - agar bo nmnwa nawy variable bw awa bzana aw variablea ba chy declare krawa */

 calculateStore(true, 10_000, 8, 200);
 
}
 public static void calculateStore (boolean gameOver, int score, int levelCompleted , int bonus  ) {
  
 /* boolean gameOver = true;
 int score = 800;
 int levelCompleted = 5;
 int bonus = 100;  */
  
// lera datwany aw variableana delete bkay ba marjek agar patameter w argument bkay
  
 int finalScore = score;

 if (gameOver) {
 finalScore += (levelCompleted * bonus)
 finalScore += 1000;
 System.out.println("Your final score was " + finalScore);
 }

 /* 
 the void meaning no data return from the method 
 
 aw shtanay la jyat void bakare det tanha primivate datatypen chwnka to declare method dakay wak chon delare variable dakay 

 katek void bakar naheny awa dabet 2 sht anjam bday awish : 1- la jyat void nawy aw datatypea bnwsy ka datawe
 2- return statement bnwsy

 return statement is used for : 1- return value   2- stop method 
 agar void bet awa tanha bo stop method bakar det awish la koytayi chwnaka agar la nawarast bet codey try ladwa bet awaq erorr dada
 tanha la yak kat la nawarast bakar det agar lanaw if-statement bakary beny 

 agar primivate datatype bet awa bo hardwky bakar det wa hamisha pekawa bakar det 

 agar darey chon bzanm stop method dakat awa dabet yakek law marjay tedabet awja 
 1- agar lanaw if-statement bakar net harka gaishta return statement awa stop dabet 
 2- agar lanaw if-statement bakar bet dabet conditionaka true bet awja stop dabet 

 the most common place to return statement is before the right curly brace 

 if you used void return statement is not required but if you not use void it is required 
 but also you can use return statement when you use void to stop method */

 public static int calculateStore (boolean gameOver, int score, int levelCompleted , int bonus  ) {

    if (gameOver) {
 finalScore += (levelCompleted * bonus)
 finalScore += 1000;
 System.out.println("Your final score was " + finalScore);
 }

  return finalScore;   // agar daley chon bzanm ka nawy kama variable bnwsm awa kama variable anjamy kotayi hallgrt bw nawy aw bnwsa 
 }
}

/* method agar value bgaretawa = function 
method agar value nagaretawa = procedure
ballam la java method = function ballam nawy method zyatr bakar det nak funtion */
 
 /* public : datwanre la hamw shwenek bang bkret
  static : pewist nakat object drwst bkret
 dabet (String [] args) bnwsit agar main bw */

if (age > 18) {

 return;   // agar hich valuek nanwsra bw awa tanha bo void rasta
}
// lera aw codeana danwsy ka agar age -18 bw chwnka condition false bet awa daraway if-staetment run dabet 

if (age > 18) return;  // datwany bam sheway bnwsy agar tanha yak line codet habw lanaw if-statement

/* swdy am codea chya ? agar am conditiona false bw awa method radawaste 

 lera daprsy aw codea chya ? 
agar age la +18 bw awa condition = true w dacheta sar return boya codeanaknytr ingnore dakret  
ballam agar -18 bw awa condition = false boya nacheta sar return w dacheta sar awanytr */

public static void ageOfClient (int age) {  // la katy call method xot valuey age dadaney 
boolean result = false;  // agar awya ba true daney aw kat hamw katek true dabet
if (age > 18 ) {
 result = true;
}
return result;
}

boolean result = true;
if (age > 18) {
 return false;
}
return result;
}

// hardkw tawawa boya kama bnwsy tawawa
    }
}
