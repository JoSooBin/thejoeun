package sec04.exam01_arithmetic;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(((int)c2 + 1));    //컴파일 에러
		System.out.println("c1: " + c1); //c1: B
		System.out.println("c2: " + c2); //c2: A
		System.out.println("c3: " + c3);
	}
}
