public static void main(String[] args) {

    System.out.println(challenge());

}
public static String challenge(){

    char nameOfClass = 'S';

   String a = switch (nameOfClass){

        case 'A' -> {
            System.out.println("perfect");
            yield "1";
        }
        case 'B' -> {
            System.out.println("good");
            yield "2";
        }

        case 'C' -> {
            System.out.println("bad");
            yield "3";
        }

       default -> {
           System.out.println("your input is invalid");
           yield "4";
       }

    };
return a;
}
