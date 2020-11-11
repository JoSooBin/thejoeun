package sec06.exam05_array_in_array;
//구구단11월11일

public class GooGooDanEx01 {
	public static void main(String[] args) {
		int dan, k=0, value=0;
		dan=1;
		while(dan<9) {
			dan++;
			k=0;
		while(k<9) { //while(dan<=8) //while(dan!=9) while문의 장점은 빠져나오는문구가 직전 상태 그대로이다.
				k++;
				value = dan*k;
				System.out.println("dan="+dan+","+" k="+k+","+" value="+value);
			
			}
			System.out.printf("======%d단 종료=======\n",dan);
			System.out.println("dan="+dan+","+" k="+k+","+" value="+value);
			
		}
		System.out.printf("=========반복문 종료=======\n");
		System.out.println("dan="+dan+","+" k="+k+","+" value="+value);
	}
	
}
	
