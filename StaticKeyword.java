when the variable is static the value of its share to all object 
All objects created from that class share that exact same memory location


when the method is static we don't need object to call method but it is normal if you create an object but not nessecery
but if an method is not static you should create an object to call that method

******************************************************************************************************************************************    

void main(){

    Friend[] friends = {
            new Friend("Fatah"),
            new Friend("Ballen"),
            new Friend("Mohammed"),
            new Friend("Alwand"),

    };

    Friend.getNumOfFriends();
// for static variable / method use name of class not object

}

/////////

public class Friend {

    String name;
    static int numOfFriends;  // this public variable for all object

    Friend(String name){
        this.name=name;
        numOfFriends ++;   // when you create object number of friend increment by one
    }

    static void getNumOfFriends(){
        System.out.println("You have " + numOfFriends + " friends");
    }

}
