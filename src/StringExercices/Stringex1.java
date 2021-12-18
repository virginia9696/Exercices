package StringExercices;

//Write a Java program to get the character (Unicode code point) at the given index within the String.

public class Stringex1 {
    public static void main (String [] args){
        String str = "w3resource.com";
        System.out.println("Original string: " + str);
        System.out.println("Code point at index 1 is: " +  str.codePointAt(1) );
        System.out.println("Code point at index 9 is: " +  str.codePointAt(9) );
    }

}
