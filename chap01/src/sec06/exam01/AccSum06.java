package sec06.exam01;
/*6) Sum=2+3+5+8+12+17+?...+NUM 항까지의 합
	       i	 2  3  5  8 12
	       j   1  2  3  4*/
public class AccSum06 {

	public static void main(String[] args) {
		int sum = 0, i=2, j=0; //기준치를 과정을 생각하고 나중에 잡아라
		int cnt;
		for(cnt=1; cnt<=10; cnt++) {
			i=j+i;
			j=j+1;
			sum = sum+i; //컴퓨터가 결과를 나타내기전에 과정은 결과치 전에 작성하는것이 좋음.
			System.out.printf("cnt=%3d, j=%2d, i=%2d, sum=%3d\n", cnt, j, i, sum); //%2d는 자리수를 두자리 준거. 오른쪽 기준으로 자리가 잡힘
			
		}
		System.out.printf("====반복문종료=====\n");
		System.out.printf("cnt=%2d,  j=%2d, i=%2d, sum=%3d\n", cnt, j, i, sum);
	}

}
