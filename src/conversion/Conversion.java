package conversion;

/** This class convert a decimal number to a pointed radix based system, only for bases from 2 to 19
 * @author Wilm
 * @version 0.0.1
 * @date 2014-09-26
 */

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println(scanner.nextLine());
		System.out.println("Please input two numbers, first is the base, second is the number you want to convert");
		
		int base = scanner.nextInt();
		int number = scanner.nextInt();
		
//		System.out.println(base);
//		System.out.println(number);

		System.out.println("The number after conversion is " + conversion(base, number));
		
		scanner.close();
	}
	
	public static String conversion(int base, int number){
		/** This function returns a string of a pointed radix based number
		 * @param base is the pointed base
		 * @param number is the pointed number to be converted
		 * @return return is a blank string if error occurred, else is the string of the converted.
		 */
		StringBuffer resultBuffer = new StringBuffer("");
		String characters = "0123456789ABCDEFGHI";
		
		if (characters.length() < base) {
			System.out.println("Error, base too big");
			return "";
		}
		
		int remainder = 0;
		int quotient = number;
		
		do{
			remainder = quotient % base;
			quotient = (int)(quotient/base);
			resultBuffer = resultBuffer.append(characters.charAt(remainder));
		}while(quotient != 0);
		
		return resultBuffer.reverse().toString();
	}
}
