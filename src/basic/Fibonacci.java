package basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c,i,n;
		System.out.println("How many numbers:");
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Fibonacci Series is");
		System.out.print(a);
	    for(i=0;i<n-1;i++)
	    {
	    	c= a+b;
	    	a=b;
	    	b=c;
	    	System.out.print(" "+c);
	    }

	}

}
