package sec02.exam01;
//
public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		System.out.println(num+"번이 나왔습니다.");
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default: //위에 조건 준게 아닌 나머지
			System.out.println("6번이 나왔습니다.");
			break;
		}

	}

}
