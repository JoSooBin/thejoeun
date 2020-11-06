package sec02.exam01;
import java.util.Scanner;

//빌드: 실행가능한 파일로 변환하는 것. 컴파일 -> 
public class IfExample {
	public static void main(String[] args) {
		while(true){
		Scanner scanner = new Scanner(System.in); 	//new는 공간을 잡아라=생성자. 괄호안에 있는거 메소드
		System.out.println("점수를 입력하세요: 단 9999이면 종료");
		int score = scanner.nextInt();
											/*System.out.println("이름");
											String name = scanner.nextLine();*/
		if (score == 9999) {
			System.out.println("입력 점수확인 끝.");
		 break;
		}
//메소드는 스스로 할 수 있는. 
//클래스는 유사한 성격을 가진 객체의 모임
//인스턴스와 객체는 같은 의미. 클래스에 대한 대상문->인스턴스
//클래스 구성 요소: 속성+메소드+생성자(객체를 찍어내는 역할)
		
		if(score >100 || score < 0) { 
			System.out.printf("현재점수 %d는 범위를 초과하였습니다 \n", score);
		}
		else if(score >=90 && score <= 100) { 
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		else if(score >=80) { 
			System.out.println("점수가 80보다 큽니다.");
			System.out.println("등급은 B입니다.");
		}
		else if(score >=70) { 
			System.out.println("점수가 70보다 큽니다.");
			System.out.println("등급은 C입니다.");
		}
		else if(score >=60) { 
			System.out.println("점수가 60보다 큽니다.");
			System.out.println("등급은 D입니다.");
		}
		else{ 
			System.out.println("점수가 60보다 작습니다.");
			System.out.println("등급은 E입니다.");
		}
		}
	}
}
