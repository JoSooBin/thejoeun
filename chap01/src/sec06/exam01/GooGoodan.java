package sec06.exam01;
//¦���ܴ� 1���� Ȧ������ 9���� ����ϴ� ������. if�� ���� for�� ��ø���� ǥ��
public class GooGoodan {

	public static void main(String[] args) {
		int dan = 0;
		int times = 0;
		int value = 0;
		int st =1;
		int end = 9;
		int sw =1, temp;
		for(dan = 2; dan<=9; dan++) {
				for(times = st; times != end+sw; times=times+sw) { 
					//for(times = end; times != 1+(-sw); times=times+(-sw)) { //�׳� ������ ������ ǥ���ϱ����� ǥ����. �� ���� ����� �´°�.
						value = dan*times;
						System.out.println(dan + "X" +times + "=" + value);
					}
				System.out.printf("====="+dan+"������=====\n");
				temp = st;
				st = end;
				end=temp;
				sw = sw*(-1);
					
		//	}
		}
	}
}

