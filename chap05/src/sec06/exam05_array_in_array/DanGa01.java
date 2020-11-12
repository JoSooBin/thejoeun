package sec06.exam05_array_in_array;
//단가 300, 400, 500품목
//총금액 5000원. 적어도 1개 이상 구입
public class DanGa01 {
	public static void main(String[] args) {	
		int a=300, b=400, c=500, i, j, k, num=5000/300, cnt=0, hap=0;
		
			for(i=1; i<=17; i ++){ 
				
				for(j=1; j<=13; j++) {
					
					for(k=1; k<=10; k++){
						
						hap=a*i+b*j+c*k;
						
							if(hap == 5000){ 
								System.out.printf("300원짜리 %2d개, 400원짜리 %2d개, 500원짜리 %2d개. 합계 = %d \n",i,j,k,hap);
							}
					}
				}
			}
		} 
	}

