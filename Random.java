/* Here , we learn that 2 notice that refer difference between (Random & Scanner)
1- In Random you don't write (System.in)
2- At last you don't write random.close();
*/
import java.util.Random;

public class Game{

public void main(String[] args) {

    Random random = new Random ();

    int randomNumber = random.nextInt(1, 10);  // from 1 to 9
    System.out.println(randomNumber);

    int intValue = random.nextInt();
    System.out.println("int " +  intValue);

    boolean boolValue = random.nextBoolean();
    System.out.println("Boolean: " + boolValue);

    double doubleValue = random.nextDouble();
    System.out.println("Double: " + doubleValue);

    float floatValue = random.nextFloat();
    System.out.println("Float: " + floatValue);

    long longValue = random.nextLong();
    System.out.println("Long: " + longValue);

    String stringValue = random.toString();
    System.out.println("String " + stringValue);
    
// short w byte w char

}

}
