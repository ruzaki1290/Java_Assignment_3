import java.util.Scanner;

/* 
Write an application that inputs a line of text,
tokenizes the line with String method split and
outputs the tokens in reverse order. Use space 
characters as delimiters.
1. Write an application that inputs a line of text
2. Tokenizes the line with String method split
3. Outputs the tokens in reverse order
*/

public class Ex1409 {

  public static void main(String[] args) {
    
    // 1. Write an application that inputs a line of text
    StringBuffer sbuffer = new StringBuffer();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a sentence and press the Enter key: ");
    sbuffer.append(input.nextLine());
    
    // 2. Tokenizes the line with String method split
    String[] tokens = sbuffer.toString().split(" ");
    
    // 3. Outputs the tokens in reverse order
    sbuffer.reverse();
    for (int i = tokens.length - 1; i >= 0; i--) {
      System.out.println(tokens[i]);
    }
    input.close();

  } // main

} // Ex1409