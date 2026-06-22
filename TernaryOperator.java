/* here terenary operator is begin
ternary operator (conditonal operator) only operator in java has 3 operand
operand 1 ? operand 2 : operand 3  // operand 2,3 hamisha haman jor bn ballam boolean nabn 
aw conditionay la operand 1 haya agar true bet O2 run dabet agar false bet O3 run dabet watta pash away 
zanit conditionaka true yan falsea chy di esht ba conditionaka nabet 
*/
 
 int ageOfClient = 20;   // 1- sarata variable declare dakait 
 String ageText = (ageOfClient >= 18) ? "Adult" : "kid";  // 2- variable lanaw condition dadaney 
  // 3 - variabley dwam ba ch declare krabw dabe 2 anjamaka ba pey aw datatype bet
 System.out.println(" Our client is " + ageText);


 int produceCar = 5000;
 boolean carFactory = (produceCar >= 4000) ? true : false;
 if (carFactory) {
  System.out.println(" We have a lot of Car");
 }


 String makeOfCar = "Toyota";
 boolean isDomestic = makeOfCar == "Toyota" ? true : false;  // boolean isDomestic = makeOfCar == ""Toyota" ? false : true;   =  boolean isDomestic = ( makeOfCar != "Toyota" );                                                  
 if (isDomestic) {
  System.out.println(" Toyota is your car");
 }


 String yourCar =  (isDomestic) ? "this is your car" : "this is not your car";
 System.out.println( carModel );


int stopWatch = 20;
 string oclock = (stopWatch >= 20) ? "late" : "early";
 System.out.println(oclock);


  double firstValue = 20.00;
 double secondValue = 80.00;
 double sum = (firstValue + secondValue) * 100.00 ;
 double theRemainder = sum % 40;
 String text = (theRemainder == 0) ? "We Have No Remainder" : "We Have Remainder";
 System.out.println(text);

 double A = 200.00;
 boolean scoreCount = (A >= 150) ? true :  false ;
 if (scoreCount) {
System.out.println("you have got high score");
}
 
int highScore = 200;
if(highScore > 100) { 
highScore = 1000 + highScore;
System.out.println("this is your score by adding bonus");
} 

   
        int number = 0;
        
        String result = number==0 ?"The Number Is Zero" : number>0 ? "The Number Is Possitive" : "The Number Is Negative";
        System.out.println(result);
