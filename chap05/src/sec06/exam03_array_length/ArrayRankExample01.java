package sec06.exam03_array_length;
//석차구하기 for문. 자기자신과도 비교. 같은 비교 중복
public class ArrayRankExample01 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 50, 88, 55, 75 };
		int rank, i, j, k ; 
		
		System.out.println("---------기본data출력----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]);
		}
		System.out.println("------------------------");
		
		for (j=0; j<scores.length; j++){
			rank=1;
			for (k=0; k<scores.length; k++){
				if(scores[j]<scores[k]) {
					rank=rank+1; //나보다 점수 큰 사람 만나면 석차 증가
				}
			}
			System.out.printf("scores[%d]=%3d, rank=%d \n", j, scores[j], rank);
		}
		System.out.println("------------------------");
	
	}
}
