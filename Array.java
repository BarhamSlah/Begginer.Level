When you create a new array without filling in the values—like new int[5] or new String[5]—Java automatically fills it with default values for you:

Numbers (int, double, etc.): Set to 0 (or 0.0 for decimals).

Booleans (boolean): Set to false.

Characters (char): Set to an empty character ('\u0000').

Objects / Text (String, custom classes): Set to null (meaning empty or pointing to nothing).

      
int numbers[] = new int[4];                                         
System.out.println(numbers[1]);

String names[] = new String[4];
System.out.println(names[1]);

//////////////////////////////////////////////////////////////////////////////////////

      void main(String[] args) {

         String name[] = {"Barham", "Rasha" , "Alla" , "Fatah"};

         name[0] = "barez";  // change the value of the first element in the array

         System.out.println(name[0]);

         int numOfFruits = name.length;  // get the length of the array
         System.out.println(numOfFruits);

/////////////////////////////////////////////////////////////////////////////////////        
    
     /*   for(int i = 0 ; i < 4 ; i++){
            System.out.println(name[i]);
        }  */   // lera agar wistt ba loop array kaml print bkay

      /*  for (int number : numbers) {
            System.out.println(number); */   // lera agar natwist ba loop array kaml print bkay

 // THERE IS ARRAY OF OBJECT



        }

