// Varargs is used instead of methoo overloaded

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




