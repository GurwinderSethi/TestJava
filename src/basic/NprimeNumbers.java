/* Java Program Example - Print Prime Numbers */
package basic;
import java.util.Scanner;
public class NprimeNumbers {
	
	    public static void main(String args[])
	    {
	        int n,i, j, count=0;
	        
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Number : ");
	        n = scan.nextInt();
			
	        System.out.print("Prime Numbers are :\n");
	        for(i=2; i<=n; i++)
	        {
	            count = 0;
	            for(j=2; j<i; j++)
	            {
	                if(i%j == 0)
	                {
	                    count++;
	                    break;
	                }
	            }
	            if(count == 0)
	            {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}
	