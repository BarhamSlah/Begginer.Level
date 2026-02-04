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

 
}
}
