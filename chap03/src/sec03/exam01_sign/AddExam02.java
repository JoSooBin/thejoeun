package sec03.exam01_sign;
/*Sum=1-2+3-4+...+NUM   NUM(10)항까지의 합
i   1  2  3  4
     1  1  1*/
public class AddExam02 {

	public static void main(String[] args) {
		int sum =0, i=0, cnt;
		
		for(cnt=1; cnt<=10; cnt++) {
			i=i+1;
			if(cnt%2==0) {//짝수면 뺌
				sum=sum-i;
			}else { //홀수면 더함
				sum =sum+1;
			}
			System.out.printf("cnt=%3d, i=%2d, sum=%3d\n", cnt, i, sum);
		}
			System.out.printf("====반복문종료=====\n");
			System.out.printf("cnt=%2d, i=%2d, sum=%3d\n", cnt, i, sum);
		}
}
