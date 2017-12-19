/*
  	ISYS 320
  	Name(s): Jeremy Filler
  	Date: 11/26/17
*/

/* 4. Your pseudocode algorithm here
First statement writes 5 asterisks in 1 line.
Second statement does the first statement a variable amount of times.

*/
public class NestedLoopBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	printStars(6);	
			
		
	}
	public static void printStars(int i) {
		for (int t = 1; t <= i; t++) {
			for (int s = 1; s <= 5; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	}
	
