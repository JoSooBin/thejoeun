package sec06.exam03_array_length;

//석차구하기 for문. 자기 자신 빼고 했던 비교 중복 제외하고 비교 4321.. 
public class ArrayRankExample02 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 50, 88, 55, 75 };
		int i, j, k ; 
//		int[] rank = { 1,1,1,1,1,1,1 };
			int[] rank = new int[scores.length];//8번줄이랑 같은 말
		
		System.out.println("---------기본data출력----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]);// 83  90  87  50  88  55  75 
		}
		System.out.println("------------------------");
		System.out.println("---------기본 석차 출력----------");
		for (i=0; i<rank.length; i++){
			System.out.printf("%3d ",rank[i]); //  0   0   0   0   0   0   0 
		}
		System.out.println("------------------------");
		
		for (j=0; j<scores.length-1; j++){
			for (k=j+1; k<scores.length; k++){
				if(scores[j]<scores[k]) {
					rank[j]=rank[j]+1; //나보다 점수 큰 사람 만나면 석차 증가
				}else if(scores[j]>scores[k]){
					rank[k]=rank[k]+1;  //나보다 점수 작은 사람 만나면 상대 석차 증가
				}else{
					continue;
				}
			}
		}
		System.out.println("---------정렬 석차 출력----------");
		for (i=0; i<rank.length; i++){
			System.out.printf("%3d ",rank[i]); //  3   0   2   6   1   5   4 
		}
	
	}
}
