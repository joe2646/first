import java.util.Scanner;
public class breaex3{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);
	int counter = 0;

	System.out.println("Guess a number betwenn 1 and 10");
	System.out.println("You have ten attempts");
	System.out.println("");

	while(input.hasNext()){
		if((input.nextInt() == 8) || (counter == 10)){
			System.out.println("you guessed right,Game over");
			break;
				}
			counter++;
				if (counter == 10){
				System.out.println("10 attempts only");
				break;
			}
		}
	}


}

