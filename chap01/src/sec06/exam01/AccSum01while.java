package sec06.exam01;
/*Sum=1+2+3+4+...+NUM   NUM(10)�ױ����� ��
 i   1  2  3  4
      1  1  1*/
public class AccSum01while {
	public static void main(String[] args) {
		int sum = 0, i=0;
		int cnt;
		cnt=0;
		while( cnt<10) {
			cnt++;
			i=i+1;
			sum = sum+i;
			System.out.printf("cnt=%3d, i=%2d, sum=%3d\n", cnt, i, sum); 		
		}
		System.out.printf("====�ݺ�������=====\n");
		System.out.printf("cnt=%2d, i=%2d, sum=%3d\n", cnt, i, sum);
	}
//for���� ������ �ڿ� �Ѵ�(���� �����󤷤�) -> cnt�� �ʿ���� 11�� ����. �׷��� �۾��� ���ġ ������ ���� �������Ѽ� ����ϴ°��� ����.
//while�� �����ϰ� �۾��� �� ����. ��� �ʱⰪ�� ������ ��ȭ.
}
