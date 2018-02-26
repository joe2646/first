import java.util.Scanner;
public class Graphs{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);

		counter = 1;


		System.out.println("");
		System.out.println("Enter a number");
		int num1 = input.nextInt();
		System.out.println("Enter a number");
		int num2 = input.nextInt();
		System.out.println("Enter a number");
		int num3 = input.nextInt();
		System.out.println("Enter a number");
		int num4 = input.nextInt();
		System.out.println("Enter a number");
		int num5 = input.nextInt();

		for(int counter = 1; counter<= 5; counter++){//code does not work
		switch (counter){//sample switch if used instead of nested for loop
				case 1:
					value = num1;
					break;
				case 2:
					value = num2;
					break;
				case 3:
					value = num3;
					break;
				case 4:
					value = num4;
					break;
				case 5:
					value = num5;
					break;
				default:
					System.out.println("Invalid Number must enter number between 1 and 5");
					break;
					}

			for(int inner = 1; inner<= value; inner++){
						system.out.println("*");1
	}
}