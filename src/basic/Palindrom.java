package basic;

import java.util.Scanner;

public class Palindrom {
    public static void main(String []args) {
    	int originalNum, num,revNum =0,rem;
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter any number");
    	num = s.nextInt();
    	originalNum = num;
    	while(num!=0)
    	{
    		rem = num%10;
    		revNum = revNum*10 + rem;
    		num /=10;
    	}
    	if(originalNum == revNum)
    	{
    		System.out.println("Number:"+originalNum+" is Palindrome");
    	}
    	else
    	{
    		System.out.println("Number:"+originalNum+" is not Palindrome");
    	}
    }
}	    	



