package sec06.exam03_array_length;

//�������ϱ� ��������
public class ArraySortSlectionExample01 {
	public static void main(String[] args) {
		int[] scores = { 83, 70, 87, 50, 88, 55, 75 };
		int i, j, k ; 
//		int[] rank = { 1,1,1,1,1,1,1 };
		int[] rank = new int[scores.length];//8�����̶� ���� ��
		
		System.out.println("---------�⺻data���----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]);// 83  90  87  50  88  55  75  
		}
		System.out.println(" ");
	
		for (j=0; j<scores.length-1; j++){ //j�� ���ð�
			for (k=j+1; k<scores.length; k++){ //k�� �� ���
				if(scores[j]>scores[k]) { //ũ�� �ڷ� ������.
					int temp = scores[j];
					scores[j] =scores[k];
					scores[k]=temp;
				}
			}
			
			System.out.printf(" j=%d : ", j);
			for(int m =0; m<scores.length; m++) {
				System.out.printf("%3d" , scores[m]);
			}
			System.out.println(" "); //��ȯ ���� Ȯ��
		}
		System.out.println("---------���� data ���----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]); // 50  55  75  83  87  88  90 
		}
	
	}
}
