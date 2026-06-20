String name = "Password";

int length = name.length();                       // bo zaniny drezhy
char letter = name.charAt(0);                     // pet dalet 0 kama pita
int index = name.indexOf("s");                    // pet dallet s chandam pita
int lastIndex = name.lastIndexOf("s");        // pet dallet kota s chandam pita

name = name.toUpperCase();
name = name.toLowerCase();
name = name.trim();    // agar la pesh w la pash nawaka space habet awa space nahalet
name = name.replace("o", "a");

        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }
        */

        if(name.contains(" ")){      // check if name has space
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name DOESN'T contain any spaces");
        }

////////////////////////////////////////////////////////////////////////////////////// 

