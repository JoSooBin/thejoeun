package sec02.exam01;
import java.util.Scanner;

//����: ���డ���� ���Ϸ� ��ȯ�ϴ� ��. ������ -> 
public class IfExample {
	public static void main(String[] args) {
		while(true){
		Scanner scanner = new Scanner(System.in); 	//new�� ������ ��ƶ�=������. ��ȣ�ȿ� �ִ°� �޼ҵ�
		System.out.println("������ �Է��ϼ���: �� 9999�̸� ����");
		int score = scanner.nextInt();
											/*System.out.println("�̸�");
											String name = scanner.nextLine();*/
		if (score == 9999) {
			System.out.println("�Է� ����Ȯ�� ��.");
		 break;
		}
//�޼ҵ�� ������ �� �� �ִ�. 
//Ŭ������ ������ ������ ���� ��ü�� ����
//�ν��Ͻ��� ��ü�� ���� �ǹ�. Ŭ������ ���� ���->�ν��Ͻ�
//Ŭ���� ���� ���: �Ӽ�+�޼ҵ�+������(��ü�� ���� ����)
		
		if(score >100 || score < 0) { 
			System.out.printf("�������� %d�� ������ �ʰ��Ͽ����ϴ� \n", score);
		}
		else if(score >=90 && score <= 100) { 
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
		}
		else if(score >=80) { 
			System.out.println("������ 80���� Ů�ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
		else if(score >=70) { 
			System.out.println("������ 70���� Ů�ϴ�.");
			System.out.println("����� C�Դϴ�.");
		}
		else if(score >=60) { 
			System.out.println("������ 60���� Ů�ϴ�.");
			System.out.println("����� D�Դϴ�.");
		}
		else{ 
			System.out.println("������ 60���� �۽��ϴ�.");
			System.out.println("����� E�Դϴ�.");
		}
		}
	}
}
