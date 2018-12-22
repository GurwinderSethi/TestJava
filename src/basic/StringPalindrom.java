package basic;
import java.util.Scanner;

public class StringPalindrom {

	
	    public static void main(String args[])
	    {
	        String a, b = "";
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the string you want to check:");
	        a = s.nextLine().toLowerCase();
	        /*a= st.toLowerCase();*/
	        int n = a.length();
	        System.out.println(n);
	        for(int i = n - 1; i >= 0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equals(b))
	        {
	            System.out.println("The string '"+a+"' is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string "+a+" is not palindrome.");
	        }
	    }
	}
