package sec04.exam01_arithmetic;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		/*//char c3 = c2 + 1;    ������ ����(char�� ����� ���� int�� ���� �� ����. 
		���� 10�����ε� �����Ű���� ������ ������char�� �ٲ�����Ѵ�.)*/
		System.out.println("c1: " + c1); //c1: B
		System.out.println("c2: " + c2); //c2: A
		//System.out.println("c3: " + c3);
	}
}
