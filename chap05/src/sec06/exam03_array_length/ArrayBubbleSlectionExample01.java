package sec06.exam03_array_length;

//�������� ��������. �� ��ȯ�� �ּ�ȭ
public class ArrayBubbleSlectionExample01 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		int i, j, k, sw; 
		
		for (i = 0; i<scores.length; i++) {
			scores[i] = (int)(Math.random()*50)+10;
			System.out.println("-"+scores[i]+"���� ���Խ��ϴ�.");
		}
		
		System.out.println("---------�⺻data���----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]);// 83  90  87  50  88  55  75  
		}
		System.out.println(" ");
		System.out.println(" ");
		
		for (j=0; j<scores.length-1; j++){
			sw=0;
			for (k=0; k<scores.length-1-j; k++){ //0������ �����̱⿡
				if(scores[k]>scores[k+1]) {
					int temp = scores[k];
					scores[k] =scores[k+1];
					scores[k+1]=temp;
					
					sw=1; //��ȯ�� �Ͼ��
				}
			}
			if(sw==0) break; //sw=0�̸� ��ȯ�� ���Ͼ���̹Ƿ�. > �����Ұ� ����. ����.
			
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
