package sec06.exam05_array_in_array;
import java.util.Scanner;
//로또
//6개번호 생성
//랜덤으로 넣되 앞에나온 숫자가 나오면 안됨. 숫자 범위1~45를 벗어나도 안됨.
//내가 입력한 숫자도 중복되면 안됨
//6개가 다 맞으면 1등. 5개가 맞고 보너스점수가 맞으면 2등. 4개맞으면 3등, 3개맞으면 2등

public class LottoExam01 {
	public static void main(String[] args) {
		int[] num = new int[6]; //사용자 번호 저장
		int[] lotto = new int[6]; //로또 랜덤번호 저장
		int i, j;
		int bonus = 0;
		//사용자 입력번호 저장
		for(i=0; i<6; i++) 
		{
			System.out.printf(" %2d번째 번호를 입력하세요(1~45) :  ",i +1);
			Scanner scanner =new Scanner(System.in);
			num[i]=scanner.nextInt();
			
			if(num[i]<1 || num[i]>45) 
			{
				System.out.println("번호는 1부터 45까지만 입력해야합니다");
				i--;
				continue;
			}
			 //중복번호 체크
			if(i>0) 
			{
				for(j=0; j<i; j++) 
				{
					if(num[i]==num[j]) 
					{
						System.out.println("번호는 중복되어서는 안됩니다.");
						i--;
						//continue;
						break;			//continue;랑 결과는 똑같음
					}
				}
			}
		}
		
		System.out.println("--------응모하신 번호 출력--------");
		for(i=0; i<6; i++) {
			System.out.printf(" %2d ",num[i]);
		}
		 
		//당첨번호 저장
			for (i = 0; i<6; i++) 
			{
				lotto[i] = (int)(Math.random()*45)+1;
				 //중복번호 체크
				if(i>0) 
				{
					for(j=0; j<i; j++) 
					{
						if(lotto[i]==lotto[j]) 
						{
							System.out.println("번호는 중복되어서는 안됩니다.");
							i--;
							//continue;
							break;			//continue;랑 결과는 똑같음
						}
					}
				}
			}
		
		//보너스번호 만드는 문장(변수). 
				//기존 배열과 변수와 비교해서 중복체크
				//랜덤으로 나온 번호와 중복 체크. 내 번호와 비교
		for(i=0; i<1; i++) 
		{
			bonus = (int)(Math.random()*45)+1;
			for(j=0; j<6; j++) 
			{
				if(bonus==lotto[j]) 
				{
					System.out.println("번호는 중복되어서는 안됩니다.");
					i--;
					//continue;
					break;			//continue;랑 결과는 똑같음
				}
			}
		}
			
			System.out.printf("\n------보너스 번호 출력 : %2d ------\n", bonus);
	
			System.out.println("--------로또 랜덤 번호출력--------");
			for(i=0; i<6; i++) {
				System.out.printf(" %2d ",lotto[i]);
			}
			
		//맞춘 갯수
			int count =0;
			for (i = 0; i<6; i++) 
			{
				for (j = 0; j<6; j++) 
				{
					if(num[i] == lotto[j]) {
						count++;
						}
				}
			}
		
		//보너스 번호 검사
			int b_count=0;
			for(i=0;i<6;i++) {
				if(num[i]==bonus)
					b_count = 1;
			}
			
			if(count ==6) {
				System.out.println("<<1등에 당첨되셨습니다>>");
			}else  if(count ==5 && b_count == 1 ) {
				System.out.println("<<2등에 당첨되셨습니다>>");
			}else if(count ==5) {
				System.out.println("<<3등에 당첨되셨습니다>>");
			}else if(count ==4) {
				System.out.println("<<4등에 당첨되셨습니다>>");
			}else if(count ==3) {
				System.out.println("<<5등에 당첨되셨습니다>>");
			}else {
				System.out.printf("\n<<다음기회에>>");
			}
		}
	}


