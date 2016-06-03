package Assignment;

import java.util.Scanner;

public class CountNumberOccurance {

	

	private static Scanner input;

	public static void main(String[] args) {
		
		 input = new Scanner(System.in);

	        int[] number = new int[100];

	       
	        System.out.print("Enter the Nos. [Enter 0 to end the Input] : ");
	        for (int i = 0; i < number.length; i++) {
	            int a = input.nextInt();
	            number[a] += a;
	            if (a == 0)
	                break;
	        }
	        for (int i = 1; i < number.length; i++) {
	            if (number[i] != 0) {
	                if (number[i] / i > 1)
	                    System.out.println(i + " occured " + number[i] / i + " times");
	                else
	                    System.out.println(i + " occured " + number[i] / i + " time");               }
	        }

	}

}
