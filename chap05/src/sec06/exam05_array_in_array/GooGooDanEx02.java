package sec06.exam05_array_in_array;
//구구단11월11일
public class GooGooDanEx02 {
	public static void main(String[] args) {
		int dan, k=0, value=0;
		for(dan=2;dan<=9;dan++) {
			for(k=1;k<=9;k++) {
				if(k%4==0) 
					continue; //4일때만 건너뛰고 5로 진행
					//break; 	//아예 종료. 다음단으로 진행
				value = dan*k;
				
				System.out.println("dan="+dan+","+" k="+k+","+" value="+value);
			}
			System.out.printf("======%d단 종료=======\n",dan);
		}
		System.out.printf("=========반복문 종료=======\n");
		System.out.println("dan="+dan+","+" k="+k+","+" value="+value);
	}
	
}
	
