public class GuessNumber {
    public static void main(String[] args) {

        System.out.println(calculate(12.0, 23.0));
        System.out.println(calculate(12.0, 23, 23.0));
        System.out.println(calculate(12 , 23.0 , 2.0 ));
    }

    public static double calculate(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double calculate(double num1, int num2, double num3) {
        double sum = num1 + num2 - num3;
        return sum;
    }

    public static double calculate(int num1 , double num2 , double num3) {
        double sum = num1 + num2 * num3;
        return sum;
}
}