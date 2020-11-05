package sec06.exam01;

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
			System.out.printf("====="+dan+"´ÜÁ¾·á=====\n");
			
			dan++;
		}while(dan<=9);
	}
}
