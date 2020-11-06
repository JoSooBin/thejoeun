package sec06.exam01;
//구구단 변수 지정에 따른 빠져나가는 값 확인ㄴ
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
			System.out.println(dan + "X" +times + "=" + value); //마지막value값이 출력.2X10=18
			System.out.println(dan + "X" +times + "=" + dan*times);//마지막 dan,times이 연산돼서 출력.2X10=20
			System.out.printf("===============\n");
		}
		System.out.printf("=====구구단종료=====\n");
		System.out.println(dan + "X" +times + "=" + value); //10X10=81
		System.out.println(dan + "X" +times + "=" + dan*times);//10X10=100
		System.out.printf("===============\n");
	}
}
