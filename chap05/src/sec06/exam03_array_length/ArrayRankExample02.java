package sec06.exam03_array_length;

//�������ϱ� for��. �ڱ� �ڽ� ���� �ߴ� �� �ߺ� �����ϰ� �� 4321.. 
public class ArrayRankExample02 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 50, 88, 55, 75 };
		int i, j, k ; 
//		int[] rank = { 1,1,1,1,1,1,1 };
			int[] rank = new int[scores.length];//8�����̶� ���� ��
		
		System.out.println("---------�⺻data���----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]);// 83  90  87  50  88  55  75 
		}
		System.out.println("------------------------");
		System.out.println("---------�⺻ ���� ���----------");
		for (i=0; i<rank.length; i++){
			System.out.printf("%3d ",rank[i]); //  0   0   0   0   0   0   0 
		}
		System.out.println("------------------------");
		
		for (j=0; j<scores.length-1; j++){
			for (k=j+1; k<scores.length; k++){
				if(scores[j]<scores[k]) {
					rank[j]=rank[j]+1; //������ ���� ū ��� ������ ���� ����
				}else if(scores[j]>scores[k]){
					rank[k]=rank[k]+1;  //������ ���� ���� ��� ������ ��� ���� ����
				}else{
					continue;
				}
			}
		}
		System.out.println("---------���� ���� ���----------");
		for (i=0; i<rank.length; i++){
			System.out.printf("%3d ",rank[i]); //  3   0   2   6   1   5   4 
		}
	
	}
}
