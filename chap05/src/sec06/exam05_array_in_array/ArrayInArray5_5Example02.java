package sec06.exam05_array_in_array;
//�����ﰢ�� 1234��

public class ArrayInArray5_5Example02 {
	public static void main(String[] args) {	
		int n=0;
		int[][] arr1 = new int[5][5];
		
		for(int i=0;i<arr1.length;i++) {
			for(int k=0; k<arr1.length-i ; k++) { //4������
	//		for(int k=i; k<arr1[i].length; k++) { //3������
	//		for(int k=arr1.length-i-1; k<arr1.length; k++) { //2������
	//		for(int k=0; k<=i; k++) { //1������
					n=n+1;
					arr1[i][k]=n;	
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

