public class ReturnMethods{
	public static void main(String [] args){
		Methods m = new Methods();
		m.method1();
		}

	public void method1(){
		System.out.println("NO problem method 2, can you ask method 3 for a number and return it for me");
		method2();
		}

	public void method2(){
		System.out.println("of course i can method 1. Method 3 can you please send me a number");
		method3();
		}

	public void method3(){
		System.out.println("Yes method 2 i will rutrn a numebr to you now");
		}

	}
