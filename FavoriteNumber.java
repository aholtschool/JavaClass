/* Java Favorite Number Program */

import java.util. *;
public class FavoriteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; //user's favorite number
	Scanner inp = new Scanner (System.in); //to read input
	
	//get user's favorite number
	System.out.print ("What is your favorite number? ");
	n = inp.nextInt();
	
	//compute next number
	n = n + 1;
	
	//write the output
	System.out.println();
	System.out.println("My favorite number is 1 more than that, " + n);
	System.out.println();
	System.out.println();
	}

}
