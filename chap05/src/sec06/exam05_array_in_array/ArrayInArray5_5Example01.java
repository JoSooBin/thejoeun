package sec06.exam05_array_in_array;
//정사각형 만들기
public class ArrayInArray5_5Example01 {
	public static void main(String[] args) {	
		int[][] arr1 = new int[5][5];
		
		int m1=0, n=0;
		int[][] arr2 = new int[5][5];
		for(int i=1; i<arr1.length; i++) {
			for(int k=0; k<arr2[i].length; k++) {
				n=n+1;
				arr1[i][k]=n;		
				//arr1[k][i]=m1;
			}
		}
		System.out.println();

		for(int i=0; i<arr1.length; i++) {
			for(int k=0; k<arr1[i].length; k++) {
				System.out.printf("%4d",arr1[i][k]);
			}
			System.out.println();
		}
	} 
}

