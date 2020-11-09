package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		/*System.out.println("-----------------------");
		x++;
		System.out.println("x=" + x);	
		++y;
		System.out.println("y=" + x);		

		System.out.println("-----------------------");		
		x--;
		System.out.println("x=" + x);	
		--y;
		System.out.println("y=" + y);	*/	

		int a = 10;
		System.out.println("-----------------------");		
		z = ++a;
		System.out.println("z=" + z);
		System.out.println("a=" + a);
		
		int b =10;
		System.out.println("-----------------------");		
		z = b++;
		System.out.println("z=" + z);
		System.out.println("x=" + b);
		
		System.out.println("-----------------------");	
		
		z = ++x + y++ ;//x와 y 공간은 하나
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}

