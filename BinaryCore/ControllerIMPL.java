package BinaryCore;

import java.util.Scanner;

/* Utility class using Controller Interface */
public class ControllerIMPL implements Controller {
	private static Scanner keyboard = new Scanner(System.in);
	
	private ControllerIMPL() {}
	public static String convertToBinary(int number) { return ModelBinaryConverter.convertToBinary(number); }
	
	public static int getInput(String message) {
		
		System.out.print(message);
		while(!keyboard.hasNextInt()) {
			System.out.println();
			System.out.print(message);
			keyboard.nextLine();
		}
		return keyboard.nextInt();
		
		// Alternative method using try/catch
		/*
		int input = 0;
		boolean goodInput = false;
		do {
			try {
				System.out.print(message);
				input = keyboard.nextInt();
				// This only runs if a valid integer is inputed
				goodInput = true;
			}
			catch(InputMismatchException ex) {
				keyboard.nextLine(); // Clear keyboard buffer
			}
		}
		while(!goodInput);
		return input;
		*/
	}
}
