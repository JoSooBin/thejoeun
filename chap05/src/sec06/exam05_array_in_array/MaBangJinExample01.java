package sec06.exam05_array_in_array;
import java.util.Scanner;
//마방진
//가로세로대각선의 합이 동일.
//첫줄 가운데에 시작값을 넣어라
//행이나 열을 벗어나면 제일 큰 행, 제일 작은 열 값에 넣어라.
//정가운데 시작값을 평균으로 선정
//행은 1감소하여 그 위에 배치. 열 1증가되어 대각선에 배치.

public class MaBangJinExample01 {
	public static void main(String[] args) {	
		int i, j, row=0, col, num, mid;
		System.out.println("배열의 크기를 입력하세요(홀수) : "); 
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		int[][] arr1 = new int[num][num];
		
		mid = num/2;
		col=mid;
		
		for(i=1; i<=num*num; i ++){
			arr1[row][col] = i;
			if(i%num==0) {
				row++;
			}else {
				col++;
				row--;
				if(row<0) {
					row=num-1;
				}
				if(col>num-1) {
					col=0;
				}
			}
		}
		

		/*for(int p[]:arr1) { //행이 몇개냐
			for(int q:p) {
				System.out.printf("%4d",q);
			}
			System.out.println();
		}*/
		for(i=0; i<arr1.length; i++) {//행
			for(j=0; j<arr1[i].length; j++) { //해당 행의 열.
				System.out.printf("%4d",arr1[i][j]);
			}
			System.out.println();
		}
	} 
}

