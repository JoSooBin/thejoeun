package sec06.exam01;
//������ ���� ������ ���� ���������� �� Ȯ�Τ�
public class NestedLoop {

	public static void main(String[] args) {
		int dan = 0;
		int times = 0;
		int value = 0;
		for(dan = 2; dan<=9; dan++) {
			for(times = 1; times<=9; times++) {
			value = dan*times;
			System.out.println(dan + "X" +times + "=" + value);
			}
			System.out.printf("====="+dan+"������=====\n");
			System.out.println(dan + "X" +times + "=" + value); //������value���� ���.2X10=18
			System.out.println(dan + "X" +times + "=" + dan*times);//������ dan,times�� ����ż� ���.2X10=20
			System.out.printf("===============\n");
		}
		System.out.printf("=====����������=====\n");
		System.out.println(dan + "X" +times + "=" + value); //10X10=81
		System.out.println(dan + "X" +times + "=" + dan*times);//10X10=100
		System.out.printf("===============\n");
	}
}
