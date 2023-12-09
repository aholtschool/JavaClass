/* Java Favorite Number Program */

import java.util.Scanner;
public class FavoriteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userFavoriteNumber; //user's favorite number
	Scanner inp = new Scanner (System.in); //to read input
	
	//get user's favorite number
	System.out.print ("What is your favorite number? ");
	userFavoriteNumber = inp.nextInt();
	
	//compute next number
int nextNumber = userFavoriteNumber + 1;	
	//write the output
	System.out.println();
	String userFavoriteNumber1 = null;
	System.out.println("You've entered: " + userFavoriteNumber1);	
	System.out.println("My favorite number is 1 more than that, " + nextNumber);
	System.out.println();
	System.out.println();
	
	  // Display a message based on the value of the user's favorite number
    if (userFavoriteNumber > 10) {
        System.out.println("That's a big number!");
    } else if (userFavoriteNumber < 0) {
        System.out.println("Negative numbers are interesting!");
    } else {
        System.out.println("That's an okay number!");
    }

    System.out.println();
	}

}
