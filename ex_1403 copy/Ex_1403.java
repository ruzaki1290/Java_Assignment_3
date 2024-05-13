
import java.util.Scanner;

/* 
  Write an application that uses String method compareTo
  to compare two strings input by the user. Output whether 
  the first string is less than, equal to or greater than 
  the second.

  1. Write a method that takes input from the user and stores
     it as a string of characters.
  2. Then use compareTo method to compare inputs of both strings.
  3. Create an output method to print whether the first string is:
     a. less than
     b. equal to 
     c. greater than the second.
 */

 public class Ex_1403 {

   public static void main(String[] args) {

      /* 
        1. Write a method that takes input from the user and stores
        it as a string of characters. 
      */
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your first string:");
      String string1 = input.nextLine();
      System.out.println("Enter your second string:");
      String string2 = input.nextLine();

      System.out.println("String one is: " + string1);
      System.out.println("String one is: " + string2);
      // 2. Then use compareTo method to compare inputs of both strings.
      int compareStrings = string1.compareTo(string2);

      // 3. Create an output method to print whether the first string is <, >, or equal to.
      if (compareStrings < 0) {
         System.out.println("First string is less than the second one");
      } else if (compareStrings == 0) {
         System.out.println("Two strings are equal to each other");
      } else {
         System.out.println("First string is greater than the second one");
      }

      input.close();

   } // main

 } // Ex_1403