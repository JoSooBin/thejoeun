package sec06.exam01;

public class NestedLoop {

	public static void main(String[] args) {
		int dan = 0;
		int times = 0;
		int value = 0;
		for(dan = 2; dan<=9; dan++) {
			for(times = 1; times<=9; times++) {
			value = dan*times;
			System.out.println(dan + "X" +times + "=" + value);
			}
			System.out.printf("====="+dan+"단종료=====\n");
			System.out.println(dan + "X" +times + "=" + value);
			System.out.println(dan + "X" +times + "=" + dan*times);
			System.out.printf("===============\n");
		}
		System.out.printf("=====구구단종료=====\n");
		System.out.println(dan + "X" +times + "=" + value);
		System.out.println(dan + "X" +times + "=" + dan*times);
		System.out.printf("===============\n");
	}

}
