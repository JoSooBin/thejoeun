package sec03.exam01_sign;
/*Sum=1-2+3-4+...+NUM   NUM(10)항까지의 합
i   1  2  3  4
     1  1  1*/
public class AddExam01 {
	public static void main(String[] args) {
		int sum =0, i=0, cnt, sw=1, m;
		
		for(cnt=1; cnt<=10; cnt++) {
			i=i+1;
			m=(i*sw);//i의 부호바꾸기
			sum = sum+m; //부호바꿔서 더하기.
			System.out.printf("cnt=%2d, i=%2d, sw=%2d, m=%2d, sum=%3d\n", cnt, i, sw, m, sum); //%2d는 자리수를 두자리 준거. 오른쪽 기준으로 자리가 잡힘.
			sw=-sw;
		}
			System.out.printf("====반복문종료=====\n");
			System.out.printf("cnt=%2d, i=%2d, sw=%3d, sum=%3d\n", cnt, i, sw, sum);
		
		}
}
