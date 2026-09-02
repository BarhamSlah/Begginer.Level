The Java programming language also supports a few special escape sequences for char and String literals:
\b (backspace),
\t (tab),
\n (line feed),
\f (form feed),
\r (carriage return), 
\" (double quote),
\' (single quote),
and \\ (backslash).


public class EscapeSequencesDemo {
    public static void main(String[] args) {

        // 1. \t (Tab)
        System.out.println("--- 1. Tab (\\t) ---");
        System.out.println("Name:\tBarham");

        // 2. \n (Line Feed / Newline)
        System.out.println("\n--- 2. Newline (\\n) ---");
        System.out.println("Hello\nWorld");

        // 3. \" (Double Quote)
        System.out.println("\n--- 3. Double Quote (\\\") ---");
        System.out.println("He said, \"Java is awesome!\"");

        // 4. \' (Single Quote)
        System.out.println("\n--- 4. Single Quote (\\') ---");
        char letter = '\'';
        System.out.println("Single quote char: " + letter);

        // 5. \\ (Backslash)
        System.out.println("\n--- 5. Backslash (\\\\) ---");
        System.out.println("Path: C:\\Users\\Barham\\Projects");

        // 6. \b (Backspace)
        System.out.println("\n--- 6. Backspace (\\b) ---");
        System.out.println("ABC\bD");

        // 7. \r (Carriage Return)
        System.out.println("\n--- 7. Carriage Return (\\r) ---");
        System.out.println("Hello\rWorld");

        // 8. \f (Form Feed)
        System.out.println("\n--- 8. Form Feed (\\f) ---");
        System.out.println("Page 1\fPage 2");
    }
}
