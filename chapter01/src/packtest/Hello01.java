package packtest;

public class Hello01 {

	public static void main(String[] args) {
		System.out.printf("Hello,\t \"j\"ava1 \n");//큰 따움표 작은따움표 살리기
		System.out.printf("c\\workex Hello, \'j\'ava1 \n");
		System.out.printf("Hello, java1 \n");
		System.out.printf("Hello, java1 \n");
		
		System.out.printf("Hello, java2 ");
		System.out.println("Hello, java3 ");
		System.out.print("Hello, java4 "); //printf,println,print의 차이
		System.out.print("------------------------------ ");
		
		/*int num = 65;
		System.out.printf("10진수=%d, 16진수=%#X, 문자=%c \n", num,num,num);
		num = num+1; //num++;, ++num;, num+=1; 다 동일
		System.out.printf("10진수=%d, 16진수=%#X, 문자=%c \n", num,num,num);
		System.out.printf("10진수=%d, 16진수=%#X, 문자=%c \n", 97,97,97);
		System.out.printf("10진수=%d, 16진수=%#X, 문자=%c \n", 49,49,49);
		System.out.printf("-----------------------------------------");
		
		int num1 = 3, b;
		b=++num1 + ++num1 + ++num1; 
		System.out.print("\nnum1은"+num1+"\nb는"+b);*/
		
		int num1 = 3, c;
		c=++num1; //c=num1+1; c=num1;
		System.out.printf("c= %d, num1=%d \n",c, num1);
		System.out.printf("-----------------------------------------");
		
		int num2 = 3, d;
		d=num2++; //d=num2; num2=num2+1;
		System.out.printf("\nd= %d, num2=%d \n", d, num2);
		
	}

}
