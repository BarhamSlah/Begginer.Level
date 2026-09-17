1. Purpose:
Checks whether an object is an instance of a specific class/type.
  
2. Important rule:
If Dog extends Animal, then a Dog object is also an Animal.
  
3. Common use:
Usually used before downcasting to make sure the cast is safe.
if (a instanceof Dog) {
    Dog d = (Dog) a;
}

4. What is enough : Know what it checks + inheritance relationship + why it's useful before downcasting. 
🎯 Remember: instanceof checks the actual object's type and its inheritance relationships.  
  
***********************************************************************************************************************************************************

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class Main {
    public static void main(String[] args) {

        Animal a = new Dog();

        System.out.println(a instanceof Dog);  //true
        System.out.println(a instanceof Cat);  // false
        System.out.println(a instanceof Animal);  // true
    }
}

***********************************************************************************************************************************************************


