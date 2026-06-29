public class Array {
    public static void main(String[] args) {

         String name[] = {"Barham", "Rasha" , "Alla" , "Fatah"};

         name[0] = "barez";  // change the value of the first element in the array

         System.out.println(name[0]);

         int numOfFruits = name.length;  // get the length of the array
         System.out.println(numOfFruits);

/////////////////////////////////////////////////////////////////////////////////////
        
        int numbers[] = new int[4];                                         
        System.out.println(numbers[1]);

        String names[] = new String[4];
        System.out.println(names[1]);

//  lera labar away tanha array man drwst krdya be away valuey bebday  boya valuekan ba default dadaneret 

/*(byte w short w int w long = 0 ) w (double e flaot = 0.0) w
 (boolean = false) w (char = '\u0000') w (String = null) */

//////////////////////////////////////////////////////////////////////////////////////
     /*   for(int i = 0 ; i < 4 ; i++){
            System.out.println(name[i]);
        }  */   // lera agar wistt ba loop array kaml print bkay

      /*  for (int number : numbers) {
            System.out.println(number); */   // lera agar natwist ba loop array kaml print bkay

        }
    }
