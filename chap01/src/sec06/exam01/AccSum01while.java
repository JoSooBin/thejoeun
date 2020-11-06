package sec06.exam01;
/*Sum=1+2+3+4+...+NUM   NUM(10)항까지의 합
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
		System.out.printf("====반복문종료=====\n");
		System.out.printf("cnt=%2d, i=%2d, sum=%3d\n", cnt, i, sum);
	}
//for문은 증감을 뒤에 한다(문법 순서상ㅇㅇ) -> cnt가 필요없는 11로 끝남. 그러니 작업은 결과치 나오기 전에 마감시켜서 출력하는것이 좋음.
//while은 증감하고 작업할 수 있음. 대신 초기값과 조건이 변화.
}
