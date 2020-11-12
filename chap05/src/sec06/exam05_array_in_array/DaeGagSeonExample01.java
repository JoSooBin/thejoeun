package sec06.exam05_array_in_array;
import java.util.Scanner;

//대각선
public class DaeGagSeonExample01 {
	public static void main(String[] args) {	
		int i, j, n=0, row=0, col, num, mid;
		System.out.println("배열의 크기를 입력하세요(홀수) : "); 
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		int[][] arr1 = new int[num][num];
		
		
		for(i=0; i<=num*2-1; i ++){  //대각선 회전
			for(row=0; row<num; row++) { //0 1 2 3 4
				col = i-row;
				if(col<0)continue;
				if(col>num-1)continue;
				n++;
				arr1[row][col]=n;
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

