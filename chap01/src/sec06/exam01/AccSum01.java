package sec06.exam01;
/*Sum=1+2+3+4+...+NUM   NUM(10)�ױ����� ��
 i   1  2  3  4
      1  1  1*/
public class AccSum01 {
	public static void main(String[] args) {
		int sum = 0, i=0; //����ġ�� ������ �����ϰ� ���߿� ��ƶ�!!!
		int cnt;
		for(cnt=1; cnt<=10; cnt++) {
			i=i+1;
			sum = sum+i; //��ǻ�Ͱ� ����� ��Ÿ�������� ������ ���ġ ���� �ۼ��ϴ°��� ����.
			System.out.printf("cnt=%3d, i=%2d, sum=%3d\n", cnt, i, sum); //%2d�� �ڸ����� ���ڸ� �ذ�. ������ �������� �ڸ��� ����
			
		}
		System.out.printf("====�ݺ�������=====\n");
		System.out.printf("cnt=%2d, i=%2d, sum=%3d\n", cnt, i, sum);//cnt�� 11�� ��������.cnt=11, i=10, sum= 55
	}
	
}
