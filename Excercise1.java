import java.util.Scanner;
public class Excercise1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	 double a;
	 int choice;
	 int ne;
	 double fn = 0.55555555555;
	 double fn2 = 1.8;

    System.out.println("1: Fahrenheit to Celsius");
    System.out.println("2: Celsius to Fahrenheit");
    System.out.println("3: Exit");

  	System.out.println("Choice:");
  	choice = input.nextInt();



  	switch(choice){
		case 1:
			System.out.println("Enter Temperature:");
			ne = input.nextInt();

			a = (ne - 32) * fn;
			System.out.println(ne+" Fahrenheit is "+a+" Celsius");
			break;
		case 2:
		  	System.out.println("Enter Temperature:");
			ne = input.nextInt();

			a = (ne  * fn2) + 32 ;
			System.out.println(ne+" Celsius is "+a+" Fahrenheit");
			break;
		case 3:
			System.out.println("Exiting");
			break;


		}



    }
   }