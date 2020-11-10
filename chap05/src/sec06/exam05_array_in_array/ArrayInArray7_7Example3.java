package sec06.exam05_array_in_array;
//마름모
public class ArrayInArray7_7Example3 {
	public static void main(String[] args) {	
		
		int[][] arr1 = new int[7][7];
		int mid=arr1.length/2;
		int n=0, start=mid, end=mid;
		
		for(int i=0; i<arr1.length; i++) {
			for(int k=start; k<=end; k++) { 
					n=n+1;
					//arr1[k][i]=n;	//나비모양
					arr1[i][k]=n;	
				}
			if(i<mid) {
				start--;
				end++;
			}else {
				start++;
				end--;
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


