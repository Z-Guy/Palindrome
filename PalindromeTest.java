import java.util.Scanner;

class PalindromeTest
   {
   public static void main(String args[])
       {
       
       String s;
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a string: ");
       s = in.nextLine();
       
       if (Palindrome.test(s))
           System.out.println("Given string is a palindrome.");
       else
           System.out.println("Given string is not a palindrome.");
       }
   }