package sec06.exam03_array_length;

//랜덤숫자 선택정렬. 비교 교환을 최소화
public class ArrayBubbleSlectionExample01 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		int i, j, k, sw; 
		
		for (i = 0; i<scores.length; i++) {
			scores[i] = (int)(Math.random()*50)+10;
			System.out.println("-"+scores[i]+"번이 나왔습니다.");
		}
		
		System.out.println("---------기본data출력----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]);// 83  90  87  50  88  55  75  
		}
		System.out.println(" ");
		System.out.println(" ");
		
		for (j=0; j<scores.length-1; j++){
			sw=0;
			for (k=0; k<scores.length-1-j; k++){ //0번부터 시작이기에
				if(scores[k]>scores[k+1]) {
					int temp = scores[k];
					scores[k] =scores[k+1];
					scores[k+1]=temp;
					
					sw=1; //교환이 일어났다
				}
			}
			if(sw==0) break; //sw=0이면 교환이 안일어났다이므로. > 정렬할게 없다. 종료.
			
			System.out.printf(" j=%d : ", j);
			for(int m =0; m<scores.length; m++) {
				System.out.printf("%3d" , scores[m]);
			}
			System.out.println(" "); //교환 과정 확인
		}
		
		System.out.println("---------최종 정렬 data 출력----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]); // 50  55  75  83  87  88  90 
		}
	}
}
