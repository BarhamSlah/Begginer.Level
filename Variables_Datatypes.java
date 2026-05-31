public static Variables_Datatypes {
public static void main (String [] args){

  System.out.println("barham"); /* har shtek la newan double quote bnswy awa bot print dakat watta nisnaka pey dawte string literal
ballam agar text nabw awa datwnay " nanwsy tanha shtaka bnwsy  */
 
 int myvalue = 5;
 System.out.println("myvalue");
  System.out.println(myvalue);

int myFirstNumber = 1;
 int mySecondNumber = 10;
 int myThirdNumber = 100;
 System.out.println(" Hello world ");

System.out.println(" \"hello \" world ");     // the output is " hello " world
 
 /var   // variablea kant ba  list dadate ba pey rez bandy 
 /list  // hamw aw codeanat dadate ka nwsiwta ba pey rez bandy 

 /*
 primivate datatype : aw jora datatypenan ka lanaw zmanakan hana , qabarayan dyari krawa
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
  Byte : ( -128 to 127 )  + 8 bit 
  Short : ( -32_768 to 32_767 ) + 16 bit
  Int : ( -2_147_483_648 to 2_147_483_647 ) + 32 bit
  Float : ( 1.4 * 10^-45 to 3.4 * 10^38 ) + 32 bit
  Double : ( 4.9 * 10^-324 to 1.79 * 10^308) + 64 bit  
  Char : ( 0 to 65_535)  + 16 bit
  Long : ( -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807 ) + 64 bit
  */
  
int myValue = 10;
myvalue = 1;   /* lera boman dardakawe ka agar jarashka aw variablea declare bkain awa pewist naka disan nawy datatype bnwsy aw qsa 
jora datatypek rasta nak bo joreky dyari kraw */

 /* datatype 2 jory haya  1-primivate datatype   2- non primivate datatype 
 hamw jorakany primivate datatype overflow w underflow yan haya tanha boolean nabet 
 ballam non primivate datatype hichyan underflow w overflowyan nya */
 myFirstNumber = 1;
 mySecondNumber = 2;
 mythirdNumber = 3; 
 int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
System.out.println(myTotal);
 
 int myFirstNumber = 5;
 // ba 2 shewaz datwanin ka aw variablay decleareman krdwa bigorin tamashay line 20 w 21 bka hardkw shewaz tawawa
myFirstNumber = myFirstNumber + 5;
 myFirstNumber = 6;
System.out.println(myFirstNumber);

/* ba 2 shewaz datwanin kamtrin valuey datatpyeaka bzanin awa bo hanw jora dataypek dabet kamat wist nawakay bnwsa
harwaha datwanin haman code bo zanini gawratrin valuey datatype bakarbenin ba gorini Mimiimum bo Maximum
int minValue = Integer.MAX_VALUE;
 System.out.println(" Integer Maximum Value = " + minValue);
 System.out.println(" Integer Maximum Value = " + Integer.MAX_VALUE);

int myValue = 1_000_000; //this is true 
 int myVlaue = 1,000,000; //this is false  */
 
         int minValue = Integer.MIN_VALUE;
         System.out.println("Integer minimum value = " + Integer.MIN_VALUE);

         int maxValue = Integer.MAX_VALUE;
         System.out.println("Integer maximum value = " + Integer.MAX_VALUE);

         int overFlow = maxValue+1;
         System.out.println("Integer's overflow = " +  overFlow);

         int underFlow = minValue-1;
         System.out.println("Integer's underflow = " +  underFlow);
  

System.out.println(" Integer Value Range ("+ Integer.MIN_VALUE + " to " + Integer.MAX_VALUE +")");
 System.out.println(" Short Value Range ("+ Short.MIN_VALUE + " to " + Short.MAX_VALUE +")");

  
     System.out.println("a long has width of " + Long.SIZE + " bit");

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
// katek decimal number danwsy awa shtek bka ka farqy habet lagall integer number ja d / D / .0 / .00 danwsy kesha nya 

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
newResult = newResult - 1;  //esta valuey oldresult = 3 watta hich gorankary basar naya ballam newResult = 2
 
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

  /*

\"  print double quote
\'  print single quote
\\  print backslash
\t  make a space as much as tab
\r  make the cursor go to the beginning     System.out.println(" ABC \r  D   ")  the ouput is D





  */
  
  }
}
