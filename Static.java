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
