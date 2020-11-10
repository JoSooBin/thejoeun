package sec06.exam05_array_in_array;
//모래시계
public class ArrayInArray7_7Example05 {
	public static void main(String[] args) {	
		
		int[][] arr1 = new int[7][7];
		int mid=arr1.length/2;
		int n=0, start, end;
		
		for(int i=0; i<arr1.length; i++) {
			if(i<mid) {
				start=i;
				end=arr1.length-1-i;
			}else {
				start=arr1.length-1-i;
				end=i;
			}
			for(int k=start; k<=end; k++) { 
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



