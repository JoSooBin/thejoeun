package sec06.exam01;
/*6) Sum=2+3+5+8+12+17+?...+NUM �ױ����� ��
	       i	 2  3  5  8 12
	       j   1  2  3  4*/
public class AccSum06 {

	public static void main(String[] args) {
		int sum = 0, i=2, j=0; //����ġ�� ������ �����ϰ� ���߿� ��ƶ�
		int cnt;
		for(cnt=1; cnt<=10; cnt++) {
			i=j+i;
			j=j+1;
			sum = sum+i; //��ǻ�Ͱ� ����� ��Ÿ�������� ������ ���ġ ���� �ۼ��ϴ°��� ����.
			System.out.printf("cnt=%3d, j=%2d, i=%2d, sum=%3d\n", cnt, j, i, sum); //%2d�� �ڸ����� ���ڸ� �ذ�. ������ �������� �ڸ��� ����
			
		}
		System.out.printf("====�ݺ�������=====\n");
		System.out.printf("cnt=%2d,  j=%2d, i=%2d, sum=%3d\n", cnt, j, i, sum);
	}

}
