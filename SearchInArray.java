import java.util.Scanner;

void main(){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter what you wanna find ");
    String find = scanner.nextLine();

    String[] names = {"Barham" , "Alwand" , "Fatah" , "Mohammed" , "Balen"};
    boolean isFound = false;

    for (int i = 0; i < names.length; i++) {
        if (names[i].equals(find)){  // for each loop search if user input = element
            System.out.println(find + " is found at index " + i);
            isFound = true;
            break;
        }
    }

    if (!isFound){
        System.out.println(find + " is not found");
    }

}