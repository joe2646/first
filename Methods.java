public class Methods{
	public static void main(String [] args){
		Methods m = new Methods();
		m.method1();
		Index.main(null);
		}

	public void method1(){
		System.out.println("Method one here and i am calling method 2");
		method2();
		}

	public void method2(){
		System.out.println("Hi method one, from method two, i am calling method three");
		method3();
		}

	public void method3(){
		System.out.println("Hi method 2, from method 3, tell method one i say hello");
		}

	}
