public class Shadow{
	int x = 1;

public static void main (String [] args){
	//WRONG CODE  	int x = 2;
	//        		System.out.println("local x = "+x+"");
	//				System.out.println("Global x form method = ");
	Shadow s = new Shadow();
	System.out.println("local x = "+s.localVar());
	System.out.println("Global x form method = "+s.globalVar());
	System.out.println("Global x from attribute = "+s.x);
	Index.main(null);
	}

public int localVar(){
	int x = 2;
	return x;
	}

public int globalVar(){
	return this.x;
	}
}