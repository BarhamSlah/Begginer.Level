
public class MyFirstProject {
public static void main (String [] args){

System.out.println(" Hello world ");

 System.out.println("barham"); 

 int myvalue = 5;
 System.out.println("myvalue");
  System.out.println(myvalue);

int myFirstNumber = 1;
 int mySecondNumber = 10;
 int myThirdNumber = 100;
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

 
}
}
