void main(String[] args) {

    boolean isUnemployee = false;
    boolean isStudent = false;
    int price = 100;

    if (isUnemployee) {
        if (isStudent) {
            System.out.println("You have got 10$ discount cuz you are student ");
            System.out.println("You have got 20$ discount cuz you are unemployee");
            price *= 0.7;
        } else {
            System.out.println("You have got 20$ discount cuz you are unemployee");
            price *= 0.8;
        }
    }
    else{
            if (isStudent) {
                System.out.println("You have got 10$ discount cuz you are student");
                price *= 0.9;
            }

        }
    System.out.println("You should pay " + price + "$");

}
