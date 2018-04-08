// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-14):");
    System.out.println();
    System.out.println("1. \tBreak");
    System.out.println("2. \tSwitch");
    System.out.println("3. \tMethods");
    System.out.println("4. \tShadowing");
    System.out.println("5. \tOverloading");
    System.out.println("6. \tReverse");
    System.out.println("7. \tArray");
    System.out.println("8. \tSecond Array");
    System.out.println("9. \tTryCatch");
    System.out.println("10.\tEnhanced For");
    System.out.println("11.\tSearch Student");
    System.out.println("12.\tConvert");
    System.out.println("13.\tSearch");
    System.out.println("14.\tExiting....");

    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
  	case 1:
        System.out.println("Break lab");
        Break_Ex2.main(null); //static method call, no instance required.
        break;
  	case 2:
        System.out.println("Switch lab");
        System.out.println();
        FirstSwitch.main(null);
        break;
  	case 3:
	   	System.out.println("Methods Lab");
	   	System.out.println();
	   	Methods.main(null);
        break;
	case 4:
	   	System.out.println("Shadowing Lab Excersise");
	   	System.out.println();
	   	Shadow.main(null);
        break;
	case 5:
		System.out.println("Overloading Lab");
		System.out.println();
		Arithmetic.main(null);
        break;
  	case 6:
		System.out.println("Reverse Digits Lab");
		System.out.println();
		Reverse.main(null);
        break;
    case 7:
		System.out.println("Array Lab");
		System.out.println();
		FirstArray.main(null);
        break;
    case 8:
		System.out.println("Second Array Lab");
		System.out.println();
		SecondArray.main(null);
        break;
  	case 9:
        System.out.println("Try Catch");
        System.out.println();
		TryCatch.main(null);
        break;
   	case 10:
	 	System.out.println("Enhanced For lab");
	 	System.out.println();
		EnhancedFor.main(null);
        break;
  	case 11:
		System.out.println("Search Student");
		System.out.println();
		SearchStudent.main(null);
        break;
   	case 12:
		System.out.println("Convert");
		System.out.println();
		Convert.main(null);
        break;
  	case 13:
		System.out.println("Search");
		System.out.println();
		Search.main(null);
        break;
  	case 14:
		System.out.println("Exiting....");
        break;
  	default:
        System.out.println("Invalid choice");
        break;
    }
    System.out.println();

  }
}