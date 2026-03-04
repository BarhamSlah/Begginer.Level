public class MyFirstProject {
public static void main (String [] args){  // am linea  taybata ba dast be krdny program
 
System.out.println("barham"); // har shtek la newan double quote bnswy awa bot print dakat watta nisnaka pey dawte string literal

 int myvalue = 5;
 System.out.println("myvalue");
  System.out.println(myvalue);

int myFirstNumber = 1;
 int mySecondNumber = 10;
 int myThirdNumber = 100;
 System.out.println(" Hello world ");
 
 /var   // variablea kant ba  list dadate ba pey rez bandy 
 /list  // hamw aw codeanat dadate ka nwsiwta ba pey rez bandy 

 /*
 primivate datatype : aw jora datatypenan ka lanaw zmanakan hana , qabarayan dyari kraw nya
 ( byte , short , int , long , float , double , boolean , char )
 hamw primivate datatypek keyworda ballam hamw keywordek primivate datatype nya
 nabet nawy datatype la variable bnein
 */

  /*
  non primivate datatype ( Reference types ) : aw jora datatypenan ka la layan programmar dadanre,
  qabarayan dyari krawe nya
  (Array , String , Class , Object , Interface)
  */

  /* The ranges of primivate-datatype : 
  Byte : ( -128 to 127 ) 
  Short : ( -32_768 to 32_767 )
  Int : ( -2_147_483_648 to 2_147_483_647 )
  Float : ( 1.4 * 10^-45 to 3.4 * 10^38 )
  Double : ( 4.9 * 10^-324 to 1.79 * 10^308)
  Char : ( 0 to 65_535) 
  Long : ( -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807 )
  */
  
int myValue = 10;
myvalue = 10;   /* lera boman dardakawe ka agar jarashka aw variablea declare bkain awa pewist naka disan nawy datatype bnwsy aw qsa 
jora datatypek rasta nak bo joreky dyari kraw */

 /* datatype 2 jory haya  1-primivate datatype   2- non primivate datatype 
 hamw jorakany primivate datatype overflow w underflow yan haya tanha boolean nabet 
 ballam non primivate datatype hichyan underflow w overflowyan nya */
 
 int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
System.out.println(myTotal);
 
 int myFirstNumber = 5;
 // ba 2 shewaz datwanin ka aw variablay decleareman krdwa bigorin tamashay line 20 w 21 bka hardkw shewaz tawawa
myFirstNumber = myFirstNumber + 5;
 myFirstNumber = 6;
System.out.println(myFirstNumber);

/*ba 2 shewaz datwanin kamtrin valuey datatpyeaka bzanin awa bo hanw jora dataypek dabet kamat wist nawakay bnwsa
harwaha datwanin haman code bo zanini gawratrin valuey datatype bakarbenin ba gorini Mimiimum bo Maximum
int minValue = Integer.MAX_VALUE;
 System.out.println(" Integer Maximum Value = " + minValue);
 System.out.println(" Integer Maximum Value = " + Integer.MAX_VALUE);

int myValue = 1_000_000; //this is true 
 int myVlaue = 1,000,000; //this is false
 
int minIntValue = 2_147_483_647;
 System.out.println(" Busted Max Value = " + (maxIntValue + 1));

int minIntValue = -2_147_483_648;
System.out.println( " Busted Min Value = " + (minIntValue - 1));

System.out.println(" Integer Value Range ("+ Integer.MIN_VALUE + " to " + Integer.MAX_VALUE +")");
 System.out.println(" Short Value Range ("+ Short.MIN_VALUE + " to " + Short.MAX_VALUE +")");

System.out.println(" A Integer has a width of " + Integer.SIZE);

long longValue = 2_147_483_647;    // labar away la range integer darnachwa loya pewist ba (L) nakat
long largeValue = 2_147_483_647_444L;   // awja dakre L yan l bet kesha nya

// agar la lay zhmarayak hich petek nabet w zhmaray tawaw bet awa ba int hsaba chwnka integer defaulta

System.out.println( largeValue);
System.out.println(longValue);

short shortValue = Short.MIN_VALUE ,secondShortValue = Short.MAX_VALUE;   // Agar haman jor bwn awa bo jary dwam nawy datatype manwsa w (,) bakar bena
int integerValue = Integer.MAX_VALUE ;  long myLongValue = Long.MIN_VALUE;  // agar haman jor nabwn dabet nawy datatype bnwsy w (;) bakar bet
<img width="111" height="125" alt="Image" src="https://github.com/user-attachments/assets/af77cc7c-a82a-47ef-9f9e-575bba05b795" />

//lera basy casting dakam
/* 
xokar : watta jory bchwk bgory bo jory gawra 
int intvalue = 20;
double doubleValue = intValue;
(char_short_byte) aw 3 jora agar lagall yakrt yan batanya krdari birkaryan basar hat ba int hsaba 

dastkrd : watta jory gawra bo bchwk 
float floatValue = 3f;
int intValue = (int)floatValue;
(double_float_long) aw 3 jora agar batanya krdary birkaryan basar hat  har wakw xoyann hsabn ballam lagall yakatr ba pey gawraka dabet (double,float,long) 
*/
 
int anotherValue = 10;
 double doubleValue = anotherValue;
 System.out.println(doubleValue);

 float floatValue = 3f;
 byte bytevalue = (byte)floatValue ;
 System.out.println(bytevalue);
 
short Z = (4/2);  // grng awaya ka anjamy zhmaray naw kawana la range aw datatype darnachet
 System.out.println(Z); 

 /*
 the double is java`s deafault type for any decimal number 
 there are two primivate datatypes in java for expressing floating-point numbers : 1- float   2- double 
 we use a floating-point number when we need more precision in calculations
 double wrdtra la float ballam agar pewistit ba wrdy nabw awa datwany float bakarbeny
 aw factoray ka wa daka la jyat (whole-number) (floating-point) bakar benin awaya ka pewistyman ba wrdy habet
 */

 /*
 chonyati nwsini double lagall float 
 double : 1- yan D yan  d danwsy     2- yan awata point danwsy chwnka deafaulty zhmaray point doublea 3- yan bas zhmarayaky tawaw danwsy 
 float : dabet ba point bet w F yan f bnwsy 
 */
 
 double A = 2;
 double B = 2.25;
 double C = 2D;
 double D = 2d;
 System.out.println(" A = " + A);
 System.out.println(" B = " + B);
 System.out.println(" C = " + C);
 System.out.println(" D = " + D);

 float B = 5.25f;
 float C = 5.25F;

 double A = 5e4;
 System.out.println( " A = " + A );
 //out.input.jpg
 
double A = 4.00/2.00;
double B = 4.00/2.0;
double C = 4.0/2.0;
double D = 4.00/2;
double E = 4.0/2;
double A = 4 / 2;   // rasta awha error nadat ballam agar hardw zhmara zhmaray tawaw nabn awa anjam halla dadat 
double B = 5 / 2;   // esta labar away hardwk zhmara ba integer a boya anjam dakata 2 aw 1 ka damenetawa faramosh dakrre boya wa bashtra ka hardwkyan ba int nanwsy bo away twshy aw kehsaya naby 
double A = 5.00;
double A = 5.0;
double B = 5D;
double C = 5d;
double D = 4.00/2;
double E = 4d/2;

float A = 3f;
float E = 3.25f;
float B = 3F;
float C = 5f/3f;
float D = 5/3f;
 
double numbersOfPound = 200d;
 double numbersOfKilograms = numbersOfPound * 0.45; 
Systyem.out.println( " numbersOfKilograms = " + numbersOfKilograms);

 short A = 10;
 byte B = 20;
 int C = 30;
 int sumOfThree = (A + B + C);
 long totalValue = 50_000 + (10 * sumOfThree);     // agadar ba 50_00 w 10 aw 2 zhmara sar ba longn loya datwany L bnwsy yan na ba dry xot
 System.out.println( " totalValue = " + totalValue ) ;

  short totalValue = (short)(20_000 + (10 * sumOfThree));  // lera labar away ka layak (int) a w layakaytr ( short) a loya daby casting bkay 
   System.out.println( " totalValue = " + totalValue ) ;
 
byte A = 5;
 short B = 10;
 int totalValue = ( A + B );
 System.out.println( "TotalValue = " = totalValue);

 double myValue = 3_000_000.435;  // input = 3000000.435

 // harchanda (float & double) bo hsab krdny fariza ballam bo karwbary bank kesha drwst daka boya  bigdecimal bashtra

char a = 'H';    // use just one literal   + use this site (symbl.cc)  + ba kwrty char bo har shtek bakardet ka yak literal laxo bgret
 char b = 68;    // unicodenumber 
 char c = '\u0068'; // javascript-JSON
 char V = 0x0068;  // java

 char firstChar = 'A' , secondChar =  'B' , thirdChar = '#';
 System.out.println( firstChar + secondChar + thirdChar );  // lera away lanaw single quote bet la unicode raqam chand bet katek printy dakay awandat dadate  
 System.out.println("" + firstChar + secondChar + thirdChar);   // dway "" + chy bnwsy dabeta hoy away pekawa blken  

 /*
 the common primivate datatype are (Integer & double & boolean)
 from the time use the (long & char)
 rarly use the (float & byte & short) when you get more experienced the most less use is byte
  */

 /*
 BIG DECIMAL : jora classeka ka teyda mamalla lagall zhmaray ba point dakre  ka teyda hsab bo chand zhmaray pash fariza daka ka btawe & zhmaray zor gawra laxo dagret ka (double&float) natwann laxoy bgrn 
  bochy bakarde : 1- karwbary bank 
  2- law shwenanay ka pewisty ba wrdy zor haya 
  example : agar float yan double bet awa 0.3 ballam bigdecimal 0.300_000_004 boya zor hastyara
  */

 /*
 CLASS : custom & special datatypea watta dast krda ka wadaka chand joreky data (nwsin & zhmara) la yak shwen kobkaytawa
 for example  : datwane yak chandin datay wakw (boolean / double) kobkatawa
 */
  
 String S = "Barham Slah";
        S = S  + " is the best developer";  // habwny space lera ("is )  yan (slah") wadaka lanewan barham  slah w is the best developer space habet 
        System.out.println(S);

 /* katek to (S)y dwam danwsy awa automaticlly hi yakam rash dabetawa rasta to awa ba chaw nabini
 ballam bo save memeory grnga amash ba manay awa det ka string immutale */

// int x = 4 * 2;  operand:4&2   operator:*   variable = x   value = 8   expression x = 4 * 2
 
String myString = " I wish i had \u00241_000_000 ";  // when symbols arent available on your keyboard and you will to look up their unicode value
 System.out.println(myString);

int newResult = 3;
int oldResult = newResult;
newResult = newResult - 1;  //esta valuey oldfresult  = 3 watta hich gorankary basar naya ballam oldResult = 2
 
// Remaider operator = modulus = modulo = mod = % 
// katek / bakar daheny awa anjamt dadate ballam katek % bakar daheny awa mawat dadate
double a = 5 / 3.0;  // 1.6666667
double b = 5 % 3;  // 2
 
// incrementing by one and decrementing by one very common requirement in programming 

 int A = 1;
 A ++;   // A = A + 1;
 System.out.println(A);

 int A = 1;
 A +=1;  // A = A + 1;
  System.out.println(A);

 int E = 5;
E *=4;
 System.out.println(E);

int A = 4;
 A +=2.5;   // aw shewaya xoy automaticlly casting daka + double bakar bena chwnka amnjam dakata 6.5 ballam labar away (int)a boya 6 pshan dadat
 System.out.println(A);    // lam shewaya wakw awa waya bnwsre A = (int) A + 2.5;

 int B = 5;
 B =(int) (B - 2.5);    // agar aw kawana bakar naheny awa aw castinga tanha bo B dabet nak har hamwy 
 System.out.println(B);

 // from now on the  intellij begin 
 /*
bash nya la katy nwsyni Address w project space bakar bet labar bwny kesha w vairous la hande OP
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
 
/* here terenary operator is begin
ternary operator (conditonal operator) only operator in java has 3 operand
operand 1 ? operand 2 : operand 3  // operand 1 hamisha dabet boolean bet operand 2,3 hamisha haman jor bn ballam boolean nabn 
ama habn manay awaya ka  booleana ( < , > , =< , >= , != , == )
aw conditionay la operand 1 haya agar true bet O2 run dabet agar false bet O3 run dabet watta pash away 
zanit conditionaka true yan falsea chy di esht ba conditionaka nabet 
if bakarbena agar true w false bw chwnka agar wanakay awa rastawxo sout print dabet w awanytr karigary nabet
*/
 
 int ageOfClient = 20;
 String ageText = (ageOfClient >= 18) ? "Adult" : "kid";  
 System.out.println(" Our client is " + ageText);
// tanha law katana (") bakar bena la O2 w O3 agar string bw wa la sout " nawy variable bakar bena 
// ballam agar string nabw awa  la O3 w O2 " bakar mahena wa la sout "" bakar bhena

 int produceCar = 5000;
 boolean carFactory = (produceCar >= 4000) ? true : false;
 if (carFactory) {
  System.out.println(" We have a lot of Car");
 }

 String makeOfCar = "Toyota";
 boolean isDomestic = makeOfCar == "Toyota" ? true : false;  // boolean isDomestic = makeOfCar == ""Toyota" ? false : true;   =  boolean isDomestic = ( makeOfCar != "Toyota" );                                                  
 if (isDomestic) {
  System.out.println(" Toyota is your car");
 }

 String carModel = (isDomestic) ? "this is your car" : "this is not your car";
 System.out.println( carModel );

int stopWatch = 20;
 string oclock = stopWatch == 20 ? "late" : "early";
 System.out.println(oclock);

  double firstValue = 20.00;
 double secondValue = 80.00;
 double sum = (firstValue + secondValue) * 100.00 ;
 double theRemainder = sum % 40;
 String text = (theRemainder == 0) ? "true" : "false";
 System.out.println(text);

 double A = 200.00;
 boolean scoreCount = (A >= 150) ? true :  false ;
 if (scoreCount) {
System.out.println("you have got high score");
}
 
int highScore = 200;
if(highScore > 100) { 
highScore = 1000 + highScore;
System.out.println("this is your score by adding bonus");
} 

 /*
In Java we have 51 keywords by the time you leann it throughout the course 
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
highScore = highScore - 10;
 health = health - 20;
 System.out.println(health + highScore);     // anjamy health w highScore kodakretawa watta dabeta 270
 }

/* awa 5 shta sar ba if-statementa ( if , { , } , ( , ) 
expression : 1 - health > 150
2 - highScore > 50
3 - (highScore > 50) && (health > 150)
4 - highScore = highScore - 10;
5 - highScore - 10
6 - health = health - 20;
7 - health - 20
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

jare tawk  mawayak bo nwsiny method (public static void) har bnwsa dwatr nawy method
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

 calculateStore(true, 10_000, 8, 200);
 
}
 public static void calculateStore (boolean gameOver, int score, int levelCompleted , int bonus  ) {
  
 boolean gameOver = true;
 int score = 800;
 int levelCompleted = 5;
 int bonus = 100;
// lera datwany aw variableana delete bkay ba marjek agar patameter w argument bkay
  
 int finalScore = score;

 if (gameOver) {
 finalScore += (levelCompleted * bonus)
 finalScore += 1000;
 System.out.println("Your final score was " + finalScore);
 }
 
  
  
 }
}
