//받아들이는 년도가 윤년에 해당하는 조건을 찾아(4의배수는 윤년. 4의 배수지만 100의 배수면 윤년이 아님. 400의 배수이면 윤년) if문으로 작성.
package sec02.exam01;
import java.util.Scanner;

public class Yunnyeon {
	public static void main(String[] args) {
		while(true){
		Scanner scanner = new Scanner(System.in); //new는 공간을 잡아라=생성자. 괄호안에 있는거 메소드
		System.out.println("년도를 입력하세요.");
		int year = scanner.nextInt();
		
		if (year == 9999) {
			System.out.println("윤년확인 끝.");
		 break;
		}
		
		if(year >=1900) {
			if(year%4 == 0) {//4의배수는 윤년.
			if((year%4 == 0) && (year%100 == 0)) { //4의 배수지만 100의 배수면 윤년이 아님
				
				if(year%400 == 0) { //400의 배수이면 윤년
					System.out.printf("%d년도는 윤년입니다 \n", year);
					continue;
				}
				System.out.printf("%d년도는 윤년이 아닙니다 \n", year);
				continue;
			}
			System.out.printf("%d년도는 윤년입니다 \n", year);
			}
		} else System.out.printf("%d년도는 윤년 범위가 아닙니다 \n", year);
	}
	}
}
