/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*

1. Fill out the table for the loop below

| ITERATION 		 | VARIABLE NAME	 | VARIABLE NAME	 | VARIABLE NAME	 |
| initialization	 |				 |				 |				 | 
| 1				 |				 |				 |				 |
I'm not sure how to write this as a table, but the program updates the value for number each time it runs, until MAX is less than 1. 
Starts wtih 7, then 12, then 15, then 16. End result is "The result is 16"

*/

public class FollowTheLoop {

	   public static final int MAX = 4;
	   public static void loopDeDoop() {
	      int number = 0;
	      for( int count = MAX; count >= 1; count-- ) {
	         int product = count * 2 - 1;
	         number = number + product;
	      }
	      System.out.println("The result is: " + number);
	   }

	   public static void main( String[] args ) {
		   loopDeDoop();
	   }

}
