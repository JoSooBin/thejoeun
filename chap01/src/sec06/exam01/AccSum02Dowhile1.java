package sec06.exam01;
/*Sum=1+2+3+4+...+NUM   NUM(10)항까지의 합
 i   1  2  3  4
      1  1  1*/
public class AccSum02Dowhile1 {
	public static void main(String[] args) {
		int sum = 0, i=0;
		int cnt=10;
		do{
			i=i+1;
			sum = sum+i;
			System.out.printf("cnt=%3d, i=%2d, sum=%3d\n", cnt, i, sum); 		
			cnt--;
		}while( cnt>0); // while( cnt>=1); while( cnt !=0) 같은 의미
		System.out.printf("====반복문종료=====\n");
		System.out.printf("cnt=%2d, i=%2d, sum=%3d\n", cnt, i, sum);
	}
//do~while은 무조건 한번은 돌림
//cnt<N은 증가로직, cnt>N은 감소로직.
}