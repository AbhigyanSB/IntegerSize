import java.util.Scanner;

public class IntegerSize {

	public static void main(String[] args) {
		
		System.out.println("Please enter an integer and the width: "); //asking the user for the inputs of an integer and its width
		Scanner input = new Scanner(System.in); //creating scanner object to store the user input
		int number = input.nextInt(); //storing the integer that the user provided in the variable "number"
		int width = input.nextInt(); //storing the width that the user provided in the variable "width"
		input.close(); //closing the input
		
		System.out.println(format(number, width)); //displaying the result from the "format(number, width)" method
	}	
	//creating a method to find to display the which will include 0s if length of the number is less than the width, or else, it will just display the number itself
	public static String format(int number, int width) {
		String nums = number+""; //converting the integer "number" to a string "nums"
		int b = nums.length(); //taking the length of the string "nums" and denoting it as "b"
		
		if (b < width) { //if the "b" is smaller than the width provided
			for (int c = width-b; c>0; c--) { //creating an integer "c" which is the difference of the width and the length of the number provided
				nums = 0 + nums; //adding a "0" to "nums" each time the loop runs
			}
		}	
		return nums; //returning the String "nums" to the String type of method
		
	}

}
