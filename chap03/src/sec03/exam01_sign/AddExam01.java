package sec03.exam01_sign;
/*Sum=1-2+3-4+...+NUM   NUM(10)�ױ����� ��
i   1  2  3  4
     1  1  1*/
public class AddExam01 {
	public static void main(String[] args) {
		int sum =0, i=0, cnt, sw=1, m;
		
		for(cnt=1; cnt<=10; cnt++) {
			i=i+1;
			m=(i*sw);//i�� ��ȣ�ٲٱ�
			sum = sum+m; //��ȣ�ٲ㼭 ���ϱ�.
			System.out.printf("cnt=%2d, i=%2d, sw=%2d, m=%2d, sum=%3d\n", cnt, i, sw, m, sum); //%2d�� �ڸ����� ���ڸ� �ذ�. ������ �������� �ڸ��� ����.
			sw=-sw;
		}
			System.out.printf("====�ݺ�������=====\n");
			System.out.printf("cnt=%2d, i=%2d, sw=%3d, sum=%3d\n", cnt, i, sw, sum);
		
		}
}
