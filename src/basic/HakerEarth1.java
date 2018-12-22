/* IMPORTANT: Multiple classes and nested static classes are supported 


 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
         Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        

        // Write your code here

    }
}
*/


package basic;
//import for Scanner and other utility classes
import java.util.*;

public class HakerEarth1 {
	 public static void main(String args[] ) throws Exception {
		 HakerEarth1 ob = new HakerEarth1();
		 //Scanner
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the value of M:");
	        int M = s.nextInt();                 // Reading input from STDIN
	        System.out.println("The value of M is "+M);    // Writing output to STDOUT
           
	        System.out.println("How many elements:");
	        int n = s.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter Elements");
	    	for(int i = 0; i <n ; i++)
	        {
	            arr[i] = s.nextInt();
	        }
	    	System.out.println("You entered elements as :");
	    	
	    	for (int intTemp : arr){

	    		System.out.println(intTemp);
                 
	    		}
	    	ob.bubbleSort(arr);
	    	System.out.println("After Sorting ");
	    	ob.printArray(arr);
	    	ob.printMaxSum(arr);
	    	ob.printMinSum(arr);
	    	
	 }
 
	 void bubbleSort(int arr[])
		{
			int n = arr.length;
			for (int i = 0; i < n-1; i++)
				for (int j = 0; j < n-i-1; j++)
					if (arr[j] > arr[j+1])
					{
						// swap temp and arr[i]
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
		}
	 /* Prints the array */
		void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i] + " ");
			System.out.println();
		}
		void printMaxSum(int arr[]) {
			int sum = 0,len = arr.length;
			for(int maxIt=1;maxIt<len;maxIt++) {
				sum+=arr[maxIt];
			}
			System.out.println("maxSum:"+sum);
		}
		
		void printMinSum(int arr[]) {
			int sum = 0,len = arr.length;
			for(int minIt=0;minIt<len-1;minIt++) {
				sum+=arr[minIt];
			}
			System.out.println("minSum:"+sum);
		}
}	

