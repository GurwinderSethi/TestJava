package basic;

public class ReverseOfNumberWithoutLoops {

	public static void main(String[] args) {
		long number = 881729839;
		printReverseOfNumber(number);
	}
 
	private static void printReverseOfNumber(long number) {
		if (number != 0) {
			long divisor = 10;
			long lengthOfNumber = String.valueOf(number).length();
			if (lengthOfNumber != 0) {
				long numberRemainder = number % divisor;
				System.out.print(numberRemainder);
				number = number / divisor;
				printReverseOfNumber(number);
			}
		}
	}
}
