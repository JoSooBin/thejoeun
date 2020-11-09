package sec04.exam03_compare;
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "½Å¹ÎÃ¶";
		String strVar2 = "½Å¹ÎÃ¶";
		String strVar3 = new String("½Å¹ÎÃ¶"); //»õ·Î¿î °ø°£ÀÇ ½Å¹ÎÃ¶ »ý¼º

		System.out.println( strVar1 == strVar2); //°°Àº°ø°£ °°Àº ½Å¹ÎÃ¶ °¡¸£Å´
		System.out.println( strVar1 == strVar3); 
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
	}
}
