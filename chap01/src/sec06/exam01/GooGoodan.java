package sec06.exam01;

public class GooGoodan {

	public static void main(String[] args) {
		int dan = 0;
		int times = 0;
		int value = 0;
		
		for(dan = 2; dan<=9; dan++) {
			if (dan%2==0) {
				for(times = 1; times<= 9; times++) {
					value = dan*times;
					System.out.println(dan + "X" +times + "=" + value);
				}
			}else{
				for(times = 9; times>=1; times--) {
				value = dan*times;
				System.out.println(dan + "X" +times + "=" + value);
				}
			}
			System.out.printf("====="+dan+"¥‹¡æ∑·=====\n");
		}
	}
}

