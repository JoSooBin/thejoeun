package sec06.exam05_array_in_array;
//모래시계
public class ArrayInArray7_7Example04 {
	public static void main(String[] args) {	
		
		int[][] arr1 = new int[7][7];
		int n=0, start=0, end=arr1.length-1;
		int mid=arr1.length/2;
		
		for(int i=0;i<arr1.length;i++) {
			for(int k=start; k<=end; k++) { 
					n=n+1;
					arr1[i][k]=n;	
				}
			if(i<mid) {
				start++;
				end--;
			}else {
				start--;
				end++;
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

