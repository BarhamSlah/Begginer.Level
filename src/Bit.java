public class Bit {

    public static void main(String[] args) {


        convertInchToCm(68);

        secondMethod(5, 8);

    }

    public static void convertInchToCm (int heightInInche) {

        double cm  = heightInInche * 2.54;
        System.out.println("height in cm = " + cm);

    }



    public static void secondMethod(int heightInFeet, int reaminHeightInInche) {

        double feet = 5;
        double inche = 12 * feet + (reaminHeightInInche);
        System.out.println("inche = " + inche);


    }

}





