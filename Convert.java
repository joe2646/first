import java.util.Scanner;
public class Convert{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

			System.out.println("1: Fahrenheit to Celsius");
			System.out.println("2: Celsius to Fahrenheit");
			System.out.println("3: Exit");

			System.out.println("Choice:");
  			int x = input.nextInt();
  			System.out.println("Enter Temperature:");
			int ne = input.nextInt();


			if(x == 1){
				System.out.println(ne+"Fahrenheit is "+Celsius(x)+"celsius");
			}

			}

		public static int Celsius(int x){
			int cel;
			int ne;

			while (x == 1){
			5.0/9.0 * (ne - 32)= cel;//}
			return cel;
				while (x == 2){
					9.0/5.0 * (ne + 32)= cel;
					}

			}
	}

}



	 /*double a;
	 int choice;
	 int ne;
	 double fn = 0.55555555555;
	 double fn2 = 1.8;





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
   }*/