System.out.println(Math.PI);
System.out.println(Math.E);

double result;

// Math Methods
result = Math.pow(2, 5);      // 32.0 (2 raised to the power of 5)
result = Math.abs(-5);       // 5.0  (Absolute value)
result = Math.sqrt(9);       // 3.0  (Square root)
result = Math.round(3.14);   // 3.0  (Rounds to the nearest whole number)
result = Math.ceil(3.14);    // 4.0  (Rounds up to the nearest integer)
result = Math.floor(3.99);   // 3.0  (Rounds down to the nearest integer)
result = Math.max(10, 20);   // 20.0 (Returns the larger number)
result = Math.min(10, 20);   // 10.0 (Returns the smaller number)

System.out.println(result);

//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Game{

public void main(String[] args) {

    Scanner calculate = new Scanner (System.in);

    // circumference = 2 * Math.PI * radius;
    // area = Math.PI * Math.pow(radius, 2);
    // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
    System.out.print("Enter the number of radius ");
    double radius = calculate.nextDouble();
    double circumference = 2 * Math.PI * radius;
    System.out.println("circumference is = " + circumference + "cm");
    
    System.out.print("Enter the number of radius ");
    radius = calculate.nextDouble();
    double area = Math.PI * Math.pow(radius , 2);
    System.out.println("Area is = " + area + "cm²");

    System.out.print("Enter the numebr of radius ");
    radius = calculate.nextDouble();
    double volume = (4/3) * Math.PI * Math.pow(radius , 3);
    System.out.println("volume is = " + volume + "cm³" );
    
calculate.close();
}

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
