import java.util.Scanner;


public class BabylonianAlgorithm {

	public static void main(String[] args) {

		double n = 0, guess = 0, r = 0, ratio = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Find squre root of: ");

		n = keyboard.nextDouble();
		guess = n/2;
		r = n/guess;
		ratio = r/guess;


		while(ratio >= 1.01 || ratio <= 0.99)
		{
			r = n / guess;
			guess = (guess + r) / 2;
			//keyboard.nextLine();
			ratio = r/guess;

		}
		System.out.println(r);
	}



}
