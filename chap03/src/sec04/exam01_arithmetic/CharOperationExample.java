package sec04.exam01_arithmetic;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		/*//char c3 = c2 + 1;    컴파일 에러(char로 선언된 값은 int와 더할 수 없다. 
		만약 10번라인도 실행시키려면 우항을 통으로char로 바꿔줘야한다.)*/
		System.out.println("c1: " + c1); //c1: B
		System.out.println("c2: " + c2); //c2: A
		//System.out.println("c3: " + c3);
	}
}
