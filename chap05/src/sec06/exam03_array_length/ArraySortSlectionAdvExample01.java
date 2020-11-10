package sec06.exam03_array_length;
import java.util.Scanner;
//입력받은 숫자 선택정렬. 비교 교환을 최소화

public class ArraySortSlectionAdvExample01 {
	public static void main(String[] args) {
		int[] scores = new int[7];
		int i, j, k ; 

		Scanner scanner = new Scanner(System.in);
		for (i = 0; i<scores.length; i++) {
			System.out.println((1+i)+"번째 점수 입력: ");
			scores[i]=scanner.nextInt();
		}
		
		System.out.println("---------기본data출력----------");
		for (i=0; i<scores.length; i++){
			System.out.printf("%3d ",scores[i]);// 83  90  87  50  88  55  75  
		}
		System.out.println(" ");
		System.out.println(" ");
	
		for (j=0; j<scores.length-1; j++){ //j는 선택값
			int lo=j; //j의 값을 바꾸는 행위를 해서는 안됨.
			for (k=j+1; k<scores.length; k++){ //k는 비교 대상
				if(scores[lo]>scores[k]) {
					lo=k; //비교대상 중 가장 작은값은 저장
				}
			}
			int temp = scores[j];
			scores[j] =scores[lo];
			scores[lo]=temp; //최솟값과 i항을 교환
			
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
