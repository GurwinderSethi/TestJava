package basic;
import java.util.Scanner;

public class HEInputOutputPhotoDimensions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Side of square:");
		int l = input.nextInt();
		System.out.println("How many photos to be uploaded?");
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			int w = input.nextInt();
			int h = input.nextInt();	
			if(w<l || h<l) {
				System.out.println("Upload another");
				continue;
			}
			else if((w == h) && (w>=l) &&(h>=l)) {
				System.out.println("Accepted");
				continue;
			}
			else {
				System.out.println("Crop it");
				
			}
		}

	}

}
