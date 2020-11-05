package sec06.exam01;
//짝수단는 1부터 홀수단은 9부터 출력하는 구구단. if문 없이 for문 중첩으로 표현
public class GooGoodan {

	public static void main(String[] args) {
		int dan = 0;
		int times = 0;
		int value = 0;
		int st =1;
		int end = 9;
		int sw =1, temp;
		for(dan = 2; dan<=9; dan++) {
				for(times = st; times != end+sw; times=times+sw) { 
					//for(times = end; times != 1+(-sw); times=times+(-sw)) { //그냥 증감과 하향을 표현하기위한 표현법. 이 줄은 없어야 맞는거.
						value = dan*times;
						System.out.println(dan + "X" +times + "=" + value);
					}
				System.out.printf("====="+dan+"단종료=====\n");
				temp = st;
				st = end;
				end=temp;
				sw = sw*(-1);
					
		//	}
		}
	}
}

