import java.util.Scanner;

public class StringReverser
{
   public static void main(String[] args)
   {

        String input;
        String reverse = "";

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter string to reverse: ");

           
       input = sc.nextLine();

           int length = input.length();
       for(int i = length-1; i >= 0; i--)
       {
           reverse = reverse +input.charAt(i);
       }

       System.out.println("string reverse is:  "+reverse);
   }

}
