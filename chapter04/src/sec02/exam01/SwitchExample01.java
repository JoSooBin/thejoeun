package sec02.exam01;
import java.util.Scanner;
//������ �Է¹޾� ������ ��� �ޱ��

//����: ���డ���� ���Ϸ� ��ȯ�ϴ� ��. ������ - 
public class SwitchExample01 {
	public static void main(String[] args) {
		while(true){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: �� 9999�̸� ����");
		int score = scanner.nextInt();
		if (score == 9999) {
			System.out.println("�Է� ����Ȯ�� ��.");
		 break;
		}
		System.out.printf("������ %d�Դϴ�. \n",score);
		
			switch(score/10) {
			case 10: //������ 102��� ���� 10 ���ͼ� A����Դϴ� ��.
			case 9:
				System.out.println("������ 90���� Ů�ϴ�.");
				System.out.println("����� A�Դϴ�.");
				break;
			case 8:
				System.out.println("������ 80���� Ů�ϴ�.");
				System.out.println("����� B�Դϴ�.");
				break;
			case 7:
				System.out.println("������ 70���� Ů�ϴ�.");
				System.out.println("����� C�Դϴ�.");
				break;
			case 6:
				System.out.println("������ 60���� Ů�ϴ�.");
				System.out.println("����� D�Դϴ�.");
				break;
			default:
			System.out.println("������ ������ �ٸ��ϴ�");
			}	
		}
	}
}
