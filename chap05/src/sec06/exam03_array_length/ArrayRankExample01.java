package sec06.exam03_array_length;
//�������ϱ� for��. �ڱ��ڽŰ��� ��. ���� �� �ߺ�
public class ArrayRankExample01 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 50, 88, 55, 75 };
		int rank, i, j, k ; 
		
		System.out.println("---------�⺻data���----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]);
		}
		System.out.println("------------------------");
		
		for (j=0; j<scores.length; j++){
			rank=1;
			for (k=0; k<scores.length; k++){
				if(scores[j]<scores[k]) {
					rank=rank+1; //������ ���� ū ��� ������ ���� ����
				}
			}
			System.out.printf("scores[%d]=%3d, rank=%d \n", j, scores[j], rank);
		}
		System.out.println("------------------------");
	
	}
}
