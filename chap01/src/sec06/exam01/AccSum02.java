package sec06.exam01;
//Sum=1+3+5+...+NUM 항까지의 합(홀수의 합)

public class AccSum02 {
	public static void main(String[] args) {
		int sum=1, i=1 ;
		int cnt;
		for(cnt=1;cnt<10;cnt++) {
			i=i+2;
			sum = sum+i;
			System.out.printf("cnt=%3d, i=%2d, sum=%3d\n", cnt, i, sum); 
		}
		System.out.printf("====반복문종료=====\n");
		System.out.printf("cnt=%2d, i=%2d, sum=%3d\n", cnt, i, sum);
	}

}
