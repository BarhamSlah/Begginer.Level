void main(){

    char[] row1 = {'1' , '2' , '3'};
    char[] row2 = {'4' , '5' , '6'};
    char[] row3 = {'7' , '8' , '9'};
    char[] row4 = {'#' , '0' , '*'};

    char[][] combine = {row1, row2, row3, row4};

    for (char[] rows : combine ) {
        for (char row : rows ) {
            System.out.print(row + "  ");
        }
        System.out.println();
    }
}

////////

void main(){

    String[] meats = {"beef" , "pork" , "fish"};
    String[] vegetables = {"celery" , "onion" , "cucumber"};
    String[] fruit = {"apple" , "pear" , "peach"};

    String[][] combine = {meats, vegetables, fruit};

    for (String[] foods : combine ) {
        for (String food : foods ) {
            System.out.print(food + "  ");
        }
        System.out.println();
    }
}

////////////

void main (){

    Random random = new Random();

  int[][] num = new int[2][3];

  for (int i = 0; i < 2; i++){
      for (int j = 0; j < 3; j++){
          int randomNumber = random.nextInt(10);
          num[i][j] = randomNumber;
          IO.print(randomNumber );
      }
      IO.println();
  }

}
