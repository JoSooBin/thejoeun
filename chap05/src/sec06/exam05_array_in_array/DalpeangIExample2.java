package sec06.exam05_array_in_array;
//달팽이

public class DalpeangIExample2 {
	public static void main(String[] args) {	
		int i, j, n=0, row=0, col=-1,t=5,sw=1;
		int[][] arr1 = new int[5][5];
		while(true) {
			for(i=0; i<t; i++) {
				n=n+1;
				col+=sw; //행 변화, 열 고정
				arr1[row][col]=n;	
			}
			t--;
			if(t<0)break;
			
			for(j=0; j<t; j++) {
				n=n+1;
				row+=sw; //열 고정,행 변화
				arr1[row][col]=n;	
			}
			sw=-sw;
			
			/*for(i=0; i<t; i++) {
				n=n+1;
				col+=sw;
				arr1[row][col]=n;	
			}
			t--;
			for(i=0; i<t; i++) {
				n=n+1;
				row+=sw;
				arr1[row][col]=n;	
			}
			sw=-sw;*/
		}
		System.out.println();

		for(i=0; i<arr1.length; i++) {//행
			for(int k=0; k<arr1[i].length; k++) { //해당 행의 열.
				System.out.printf("%4d",arr1[i][k]);
			}
			System.out.println();
		}
	} 
}

