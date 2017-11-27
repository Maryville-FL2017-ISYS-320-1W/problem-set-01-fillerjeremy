/*
  	ISYS 320
  	Name(s): Jeremy Filler
  	Date: 11/26/17
*/

public class ScalableNumbersRIght {

	public static void main(String[] args) {
		int j = 8;
		for( int line = 1; line <= j; line++ ) {
			for( int spacesIndex = 1; spacesIndex <= j - line; spacesIndex++ ) {
				System.out.print(" ");
			}
			for( int numbersIndex = 1; numbersIndex <= line; numbersIndex++ ) {
				System.out.print( line );
			}
			System.out.println();
		}

	}

}
