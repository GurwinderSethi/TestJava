/*You have been given an array A of size N . you need to sort this array non-decreasing oder using bubble sort. However, you do not need to print the sorted array . You just need to print the number of swaps required to sort this array using bubble sort

Input Format

The first line consists of a single integer N denoting size of the array. The next line contains N space separated integers denoting the elements of the array.

Output Format Print the required answer in a single line

Constrains 1<=N<=100
   1<=a[i]<=100
*/



package basic;
import java.util.Scanner;
public class BubbleSort {
	public static int BubbleSortAppls(int a[],int n)
	{
	int count =0;
	for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a.length-1-i;j++)
	if(a[j]>a[j+1])
	{
	count++;
	int temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;

	}

	}

	return count;
	}
	public static void main(String args[] ) throws Exception {
    System.out.println("How many elements you want to sort:");
	Scanner s= new Scanner(System.in);
	
	int x= s.nextInt();
	int arr[]= new int[x];
	System.out.println("Enter Elements");
	for(int i=0;i<arr.length;i++)
	{
	arr[i]=s.nextInt();

	}
	System.out.println("Elements swaped "+BubbleSortAppls(arr,x)+" times in Bubble sorting.");
	
	}
		
}
