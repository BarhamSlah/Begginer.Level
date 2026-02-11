public class MyFirstProject {
public static void main (String [] args){

Systtem.out.println("barham"); 

 int myvalue = 5;
 System.out.println("myvalue");
  System.out.println(myvalue);

int myFirstNumber = 1;
 int mySecondNumber = 10;
 int myThirdNumber = 100;
 System.out.println(" Hello world ");

 int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
System.out.println(myTotal);

// ba 2 shewaz datwanin ka aw variablay decleareman krdwa bigorin tamashay line 20 w 21 bka hardkw shewaz tawawa  
myFirstNumber = myFirstNumber + 5;
 myFirstNumber = 6;
System.out.println(myFirstNumber);

int maxIntValue = Integer.MAX_VALUE;
 System.out.println(" Integer Maximum Value = " + maxIntValue);
 System.out.println(" Integer Maximum Value = " + Integer.MAX_VALUE);

int minIntValue = Integer.MIN_VALUE;
 System.out.println (" Integer Min Value = " + minIntValue);
 System.out.println (" Integer Min Value = " + Integer.MIN_VALUE);
 
 int maxIntValue = 2_147_483_647;  // tanha (_) rasta la newan zhmara dabney nak (,)
 System.out.println( " Busted Max Value = " + (maxIntValue + 1));

int minIntValue = -2_147_483_648;
System.out.println( " Busted Min Value = " + (minIntValue - 1));

System.out.println(" A Integer has a width of " + Integer.SIZE);

long longValue = 2_147_483_647;    // labar away la range integer darnachwa loya pewist ba (L) nakat
long largeValue = 2_147_483_647_444L;   

System.out.println( largeValue);
System.out.println(longValue);

 System.out.println(" Integer Value Range ("+ Integer.MIN_VALUE + " to " + Integer.MAX_VALUE +")");
 System.out.println(" Short Value Range ("+ Short.MIN_VALUE + " to " + Short.MAX_VALUE +")");

short shortValue = Short.MIN_VALUE ,secondShortValue = Short.MAX_VALUE;   // Agar haman jor bwn awa bo jary dwam nawy datatype manwsa w (,) bakar bena
int integerValue = Integer.MAX_VALUE ;  long myLongValue = Long.MIN_VALUE;  // agar haman jor nabwn dabet nawy datatype bnwsy w (;) bakar bet

int anotherValue = 10;
 double doubleValue = anotherValue;
 System.out.println(doubleValue);

 float floatValue = 3f;
 byte bytevalue = (byte)floatValue ;
 System.out.println(bytevalue);
 
short A = 20;   // bchwk bo gawra pewist ba casting nakat 
long L = A;
 System.out.println(L);

 double A = 20d;
 int B = (int) A;  // gawra bo bchwk pewist ba casting dakat
 System.out.println(B);

short Z = (4/2);  // grng awaya ka anjamy zhmaray naw kawana la range aw datatype darnachet
 System.out.println(Z); 

 double A = 2;
 double B = 2.25;
 double C = 2D;
 double D = 2d;
 System.out.println(" A = " + A);
 System.out.println(" B = " + B);
 System.out.println(" C = " + C);
 System.out.println(" D = " + D);
 
float A = 5;
 float B = 5.25f;
 float C = 5.25F;

 double A = 5e4;
 System.out.println( " A = " + A );

double A = 4.00/2.00;
double B = 4.00/2.0;
double C = 4.0/2.0;
double D = 4.00/2;
double E = 4.0/2;
 
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

char a = 'H';
 char b = 68;
 char c = '\u0068';
 char V = 0x0068;

 String S = "Barham Slah";
        S = S  + " is the best developer";
        System.out.println(S);

 
char firstChar = 'A' , secondChar =  'B' , thirdChar = '#';
 System.out.println( firstChar + secondChar + thirdChar );  // lera away lanaw single quote bet la unicode raqam chand bet katek printy dakay awandat dadate  
 System.out.println("" + firstChar + secondChar + thirdChar);   // dway "" + chy bnwsy dabeta hoy away pekawa blken  

 int A = 1;
 A ++;   // A--:
 System.out.println(A);

 int A = 1;
 A +=1;  //A-=1;
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

 boolean isCar = true;
 if (isCar)   // hokary away ka nabet la rstay if ; habet awaya ka agar falsesh bet codeaka har run dabet
 System.out.println(" this is your car"); 

 boolean isCar = false;
 if (!isCar)
  System.out.println(" this is your car ");

 boolean isStudent = false;
 if (isStudent) {
 System.out.println(" this is the student ");
 } else {
  System.out.println(" this is not the student ");
 }

boolean isCar = false;
 if (isCar = true)
  System.out.println(" this is car ");

 /*
there is a multiline comment
*/

 System.out.print(" barham \n is the best programmer ");     // am \n wa dakat ka codey haman line outputy line jyawaz bet
 
System.out.println ("Barham " + "2026");
  System.out.println ("Barham" + " 2026");    // am 3 code haman shtn ballam la yakekyan space haya away tr (" ") haya
  System.out.println (" Barham" +  " " + "2026 ");

boolean isCar = false;
 if (isCar)
  System.out.println(" this is your car");     // labar away ka curley braces nya boya tanha aw statementa sarba baw rstay marjaya  
 System.out.println(" this is not your car");    // labar away ka curley braces nya boya aw rsataya hamisha run dabet wakw rstayaky asayi waya
// bo away keshat bo drwst nabet awa tananat agar yak rstaat habet awa har curley braces bakarbena

// here terenary operator is begin
 int ageOfClient = 20;
 String ageText = (ageOfClient >= 18) ? "Adult" : "kid";  // tanha law kataana (") bakar bhena agar string bw wata wistt xwdy wshaka print bbet
 System.out.println(" Our client is " + ageText);

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
 System.out.println(oclock):

  double firstValue = 20.00;
 double secondValue = 80.00;
 double sum = (firstValue + secondValue) * 100.00 ;
 double theRemainder = sum % 40;
 String text = (theRemainder == 0) ? "true" : "false";
 System.out.println(text);

int highScore = 200;
if(highScore > 100) { 
highScore = 1000 + highScore;
System.out.println("this is your score by adding bonus");
} 

int highScore = 100;
int health = 200;
 if ((highScore > 50) && (health > 150)) {
highScore = highScore - 10;
 health = health - 20;
 System.out.println(health + highScore);     // anjamy health w highScore kodakretawa watta dabeta 270
 }

System.out.println(" there are" + 
              " a lot of line" +
                   " we wrote");    // code la haman line yan liney jyawaz bnwsy farqy ballam bo jwany w memory la haman line bnwsy jwantra

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

boolean gameOver = true;
int score = 1000;
int levelCompleted = 5;
 int bouns = 200;
 int finalScore = (score + bouns);

 if (gameOver) {
  finalScore = (levelCompleted * finalScore);
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
  secondFinalScore = (secondLevelCompleted * secondFinalScore);
  System.out.println(" Your final score = " + secondFinalScore );
 } 
 
 secondScore = 1000;
 secondLevelCompleted = 5;
 secondBouns = 200;
 secondFinalScore = (secondScore + secondBouns);

 if (gameOver) {
  secondFinalScore = (secondLevelCompleted * secondFinalScore);
  System.out.println(" Your final score = " + secondFinalScore );
 } 







 
 
 
 
}
}
