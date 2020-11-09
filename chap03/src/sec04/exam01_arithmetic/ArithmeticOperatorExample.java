package sec04.exam01_arithmetic;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
//실수 강제 형변환 		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		double result7 = v1 / v2;
		System.out.println("result7=" + result7);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		
		double result6 = (double) v1 / v2; //정확한 값이 필요할때 (나머지)
	
			System.out.println("result6=" + result6);	
	}
}
