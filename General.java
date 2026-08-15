Use static: If you want to call a method or variable directly inside main() without creating an object with new.

Don't use static: When writing standard Object-Oriented code where each object needs its own distinct data.

******************************************************************************************************************************
Static (No Object Needed):

static void greet() { 
    System.out.println("Hello"); 
}

public static void main(String[] args) { 
    greet(); // Direct call
}

Non-Static (Requires Object):

Java
void greet() { 
    System.out.println("Hello"); 
}

public static void main(String[] args) { 
    Main app = new Main(); // Must create object first
    app.greet(); 
}
