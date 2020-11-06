package sec02.exam01;
import java.util.Scanner;
//점수를 입력받아 점수별 등급 메기기

//빌드: 실행가능한 파일로 변환하는 것. 컴파일 - 
public class SwitchExample01 {
	public static void main(String[] args) {
		while(true){
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요: 단 9999이면 종료");
		int score = scanner.nextInt();
		if (score == 9999) {
			System.out.println("입력 점수확인 끝.");
		 break;
		}
		System.out.printf("점수가 %d입니다. \n",score);
		
			switch(score/10) {
			case 10: //점수가 102라면 몫이 10 나와서 A등급입니다 뜸.
			case 9:
				System.out.println("점수가 90보다 큽니다.");
				System.out.println("등급은 A입니다.");
				break;
			case 8:
				System.out.println("점수가 80보다 큽니다.");
				System.out.println("등급은 B입니다.");
				break;
			case 7:
				System.out.println("점수가 70보다 큽니다.");
				System.out.println("등급은 C입니다.");
				break;
			case 6:
				System.out.println("점수가 60보다 큽니다.");
				System.out.println("등급은 D입니다.");
				break;
			default:
			System.out.println("점수가 범위와 다릅니다");
			}	
		}
	}
}
