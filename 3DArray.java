void main (){

    Random random = new Random();

  int[][][] nums = new int[2][3][4];

  for (int i = 0; i < 2; i++){
      for (int j = 0; j < 3; j++) {
          for (int k = 0; k < 4; k++) {
              int randomNumber = random.nextInt(10);
              nums[i][j][k] = randomNumber;
              IO.print(randomNumber + " ");
          }
          IO.println(); // between each colomn
      }
      IO.println(); // between each layer
  }
}
