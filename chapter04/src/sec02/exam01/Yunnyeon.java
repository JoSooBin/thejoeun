//�޾Ƶ��̴� �⵵�� ���⿡ �ش��ϴ� ������ ã��(4�ǹ���� ����. 4�� ������� 100�� ����� ������ �ƴ�. 400�� ����̸� ����) if������ �ۼ�.
package sec02.exam01;
import java.util.Scanner;

public class Yunnyeon {
	public static void main(String[] args) {
		while(true){
		Scanner scanner = new Scanner(System.in); //new�� ������ ��ƶ�=������. ��ȣ�ȿ� �ִ°� �޼ҵ�
		System.out.println("�⵵�� �Է��ϼ���.");
		int year = scanner.nextInt();
		
		if (year == 9999) {
			System.out.println("����Ȯ�� ��.");
		 break;
		}
		
		if(year >=1900) {
			if(year%4 == 0) {//4�ǹ���� ����.
			if((year%4 == 0) && (year%100 == 0)) { //4�� ������� 100�� ����� ������ �ƴ�
				
				if(year%400 == 0) { //400�� ����̸� ����
					System.out.printf("%d�⵵�� �����Դϴ� \n", year);
					continue;
				}
				System.out.printf("%d�⵵�� ������ �ƴմϴ� \n", year);
				continue;
			}
			System.out.printf("%d�⵵�� �����Դϴ� \n", year);
			}
		} else System.out.printf("%d�⵵�� ���� ������ �ƴմϴ� \n", year);
	}
	}
}
