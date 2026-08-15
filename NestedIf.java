Independent Conditions (when conditions are not directly dependent on each other): Use if / else if or &&.
Dependent Conditions (when the inner condition makes no sense without the outer condition being true): Use nested if.
    
****************************************************************************************************************************
// نموونەی دروست بۆ nested if:
if (isCardInserted) {
    // ئەم بەشە تەنها کاتێک پشکنینی بۆ دەکرێت کە کارتەکە داخل کرابێت
    if (isPinCorrect) {
        // ئەم بەشەش تەنها کاتێک ڕەن دەبێت کە کۆدەکە ڕاست بێت
        if (balance >= amount) {
            System.out.println("پارەکە ڕاکێشرا");
        } else {
            System.out.println("پارەی پێویست لە هەژمارەکەتدا نییە");
        }
    } else {
        System.out.println("کۆدی کارتەکە هەڵەیە");
    }
}

*****************************************************************************************************************************
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
