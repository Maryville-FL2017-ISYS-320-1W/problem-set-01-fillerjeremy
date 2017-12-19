/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 6. Your pseudocode algorithm here
One statement prints a line that says 000111222333444555666777888999
Next statement prints that line 3 times

*/

public class NumberString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=3; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 1; k <= 3; k++) {
					System.out.print(j);
				}
			}
				
			System.out.println();
		}
		
	}

}
