package sec06.exam03_array_length;
import java.util.Scanner;
//�Է¹��� ���� ��������. �� ��ȯ�� �ּ�ȭ

public class ArraySortSlectionAdvExample01 {
	public static void main(String[] args) {
		int[] scores = new int[7];
		int i, j, k ; 

		Scanner scanner = new Scanner(System.in);
		for (i = 0; i<scores.length; i++) {
			System.out.println((1+i)+"��° ���� �Է�: ");
			scores[i]=scanner.nextInt();
		}
		
		System.out.println("---------�⺻data���----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]);// 83  90  87  50  88  55  75  
		}
		System.out.println(" ");
		System.out.println(" ");
	
		for (j=0; j<scores.length-1; j++){ //j�� ���ð�
			int lo=j; //j�� ���� �ٲٴ� ������ �ؼ��� �ȵ�.
			for (k=j+1; k<scores.length; k++){ //k�� �� ���
				if(scores[lo]>scores[k]) {
					lo=k; //�񱳴�� �� ���� �������� ����
				}
			}
			int temp = scores[j];
			scores[j] =scores[lo];
			scores[lo]=temp; //�ּڰ��� i���� ��ȯ
			
			System.out.printf(" j=%d : ", j);
			for(int m =0; m<scores.length; m++) {
				System.out.printf("%3d" , scores[m]);
			}
			System.out.println(" "); //��ȯ ���� Ȯ��
		}
		
		
		System.out.println("---------���� ���� data ���----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]); // 50  55  75  83  87  88  90 
		}
	
	}
}
