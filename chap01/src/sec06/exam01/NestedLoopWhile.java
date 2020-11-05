package sec06.exam01;
//구구단 출력
public class NestedLoopWhile {

	public static void main(String[] args) {
		int dan = 0;
		int times = 0;
		int value = 0;
		dan = 2;
		
		do{
			times = 1;
			do{
				value = dan*times;
				System.out.println(dan + "X" +times + "=" + value);
				times++;
			}while(times<=9) ;
			System.out.printf("====="+dan+"단종료=====\n");
			
			dan++;
		}while(dan<=9);
	}
}
