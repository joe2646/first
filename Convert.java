import java.util.Scanner;
public class Convert{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);//scanner input

	System.out.println("1: Fahrenheit to Celsius");
	System.out.println("2: Celsius to Fahrenheit");
	System.out.println("3: Exit");//options list

	double a;
	int choice;
	int ne;


	System.out.println("Choice:");
	choice = input.nextInt();



  	switch(choice){
		case 1:
			System.out.println("Enter Temperature:");
			ne = input.nextInt();

			a = (ne - 32) * 5.0/9.0;
			System.out.println(ne+" Fahrenheit is "+Math.round(a)+" Celsius");//math round is used to give value rounded
			break;
		case 2:
		  	System.out.println("Enter Temperature:");
			ne = input.nextInt();//number entered being temperature entered

			a = (ne  * 9.0/5.0) + 32 ;
			System.out.println(ne+" Celsius is "+Math.round(a)+" Fahrenheit");
			break;
		case 3:
			System.out.println("Exiting");
			break;


		}
Index.main(null);


    }
   }