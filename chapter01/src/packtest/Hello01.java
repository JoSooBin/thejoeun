package packtest;

public class Hello01 {

	public static void main(String[] args) {
		System.out.printf("Hello,\t \"j\"ava1 \n");//ū ����ǥ ��������ǥ �츮��
		System.out.printf("c\\workex Hello, \'j\'ava1 \n");
		System.out.printf("Hello, java1 \n");
		System.out.printf("Hello, java1 \n");
		
		System.out.printf("Hello, java2 ");
		System.out.println("Hello, java3 ");
		System.out.print("Hello, java4 "); //printf,println,print�� ����
		System.out.print("------------------------------ ");
		
		/*int num = 65;
		System.out.printf("10����=%d, 16����=%#X, ����=%c \n", num,num,num);
		num = num+1; //num++;, ++num;, num+=1; �� ����
		System.out.printf("10����=%d, 16����=%#X, ����=%c \n", num,num,num);
		System.out.printf("10����=%d, 16����=%#X, ����=%c \n", 97,97,97);
		System.out.printf("10����=%d, 16����=%#X, ����=%c \n", 49,49,49);
		System.out.printf("-----------------------------------------");
		
		int num1 = 3, b;
		b=++num1 + ++num1 + ++num1; 
		System.out.print("\nnum1��"+num1+"\nb��"+b);*/
		
		int num1 = 3, c;
		c=++num1; //c=num1+1; c=num1;
		System.out.printf("c= %d, num1=%d \n",c, num1);
		System.out.printf("-----------------------------------------");
		
		int num2 = 3, d;
		d=num2++; //d=num2; num2=num2+1;
		System.out.printf("\nd= %d, num2=%d \n", d, num2);
		
	}

}
