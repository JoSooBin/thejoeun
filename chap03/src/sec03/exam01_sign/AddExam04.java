package sec03.exam01_sign;
//Sum= (1*10)+(2*9)+(3*8)+...+(10*1)
public class AddExam04 {

	public static void main(String[] args) {
		int sum =0, i=0, j=11, cnt, m;
		
		for(cnt=1; cnt<=10; cnt++) {
			i=i+1;
			j=11-i;
			m=i*j;
			sum = sum +m;
			
			System.out.printf("cnt=%2d, i=%2d, j=%2d, sum=%3d\n", cnt, i, j, sum);
		}
			System.out.printf("====반복문종료=====\n");
			System.out.printf("cnt=%2d, i=%2d,  j=%2d, sum=%3d\n", cnt, i, j, sum);
		
		}
}
