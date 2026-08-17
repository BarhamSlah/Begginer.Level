// Varargs is used instead of method overloaded

public class Varargs {
    public static void main(String[] args) {

        System.out.println(sum(1 ,2 , 3  ,4 ));

    }

        public static int sum(int... numbers) {  // you can write argument as you like from 0 to infinity

            int result = 0;

            for (int sum : numbers) {

                 result += sum;

            }

            return result;
        }

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Bit {
    public static void main(String[] args) {

        System.out.println(average(23,44,4,76));

    }

    public static int average (int ...numbers){
       int result = 0;
       int average = 0;

        for (int sum : numbers){

        result += sum;

         average = result / numbers.length;

        }
        return average;
    }

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// we don't need overload method when we use varargs

void main(){

    System.out.println(sum(1, 2, 3 ,4 ,5));
}

int sum(int... numbers) {
// int... numbers is array
// int... numbers = int[] array;

    int sum = 0;

    for (int number : numbers) {

        sum += number;

    }
    return sum;
}



