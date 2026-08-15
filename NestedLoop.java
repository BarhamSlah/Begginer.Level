most usage in (DSA & Matrix)

*******************************************************************************************************************************

import java.util.Scanner;
void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of row ");
    int row = scanner.nextInt();

    System.out.print("Enter number of colomn ");
    int colomn = scanner.nextInt();

    System.out.print("Enter symbol in matrix ");
    char symbol = scanner.next().charAt(0);

    for (int i = 0; i < row ; i++) {
        for (int j = 0; j < colomn ; j++) {
            System.out.print(symbol);
        }
        System.out.println();
    }


    scanner.close();
}
