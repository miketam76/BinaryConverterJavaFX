package BinaryCore;

/*
 * Class name: BinaryConverter
 * Description: Contains methods which converts a integer type value to binary (8 bit) stored in a String
 * object
 */

/* This is a utility type class - This Class acts as the Model*/
public class ModelBinaryConverter {
	
	// Constructors - Utility class - Cannot instantiate
	private ModelBinaryConverter() { }
	
	// Converts an integer to binary - also shows the calculation breakdown
	public static String convertToBinary(int number) {
		int remainder;
		String binaryValue = "";
		
		while(number > 0) {
			System.out.println(number + " / 2 = " + (number / 2) + "\t" + (number % 2));
			remainder = number % 2;
			binaryValue = remainder + binaryValue;
			number = number / 2;
		}
		
		if(binaryValue.length() < 8) {
			int max = 8 - binaryValue.length();
			for(int i = 0; i < max; i++)
				binaryValue = "0" + binaryValue;
		}
		return binaryValue;
	}
	
	public static String twosComplement(int number) {
		return null;
		// TODO Add code for two's complement
		
	}
	public static String convertToSinglePrecision() {
		return null;
		// TODO Add code for IEEE-754 Single precision
		
	}
	public static String convertToDoublePrecision() {
		return null;
		// TODO Add code for IEEE-754 Double precision
		
	}
	public static String addTwoBinaryNumbers(int a, int b) {
		return null;
		// TODO Add code to add two numbers and determine if either value
		// requires a two's complement conversion
		
	}
}
