// Strings 

//Example demonstrating basic string operations:

public class StringExample {
    public static void main(String[] args) {
        // Declaring and initializing strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // String length
        System.out.println("Length of str3: " + str3.length());

        // Character at a specific position
        System.out.println("Character at index 1: " + str3.charAt(1));

        // Substring
        System.out.println("Substring from index 0 to 5: " + str3.substring(0, 5));

        // String comparison
        System.out.println("str1 equals str2: " + str1.equals(str2));
    }
}
