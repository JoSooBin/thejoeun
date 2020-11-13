package sec06.exam03_array_length;

import java.util.Scanner;

public class Sekcha {

	public static void main(String[] args) {
		int i, j, k, rank, input, flag, key, temp, sw;
		int low, high, mid;
		final int NUM =10;
		int[] arr2 ={ 30, 60, 40, 70, 50,100, 20, 90,10, 80 };
		int[][] arr1 = new int[2][NUM];
		//int[][] arr1 = {{30, 60, 40, 70, 50,100, 20, 90,10, 80},{1,1,1,1,1,1,1,1,1}} 이차원 배열 생성법
		
		for (i = 0; i < arr2.length; i++) {
			arr1[0][i] = arr2[i];
			arr1[1][i] = 1;
		}
		
		System.out.printf("\n");
		System.out.printf("----초기자료 출력-------\n");
		for (j = 0; j < 2; j++) {
			for (i = 0; i < NUM; i++) {
				System.out.printf("%4d", arr1[j][i]);
			}
			System.out.printf("\n");
		}
		// 석차 구하기
		for (i = 0; i < NUM-1; i++) {
			j = i ; 
			while ( j <= NUM-2 ) {
				j++;
				if (arr1[0][i] < arr1[0][j]) {
					arr1[1][i] = arr1[1][i] + 1;
				}
				else if (arr1[0][i] > arr1[0][j]) {
					arr1[1][j] = arr1[1][j] + 1;
				}
				
			}
		}
		System.out.printf("----석차 자료 출력-------\n");
		for (j = 0; j < 2; j++) {
			for (i = 0; i < NUM; i++) {
				System.out.printf("%4d", arr1[j][i]);
			}
			System.out.printf("\n");
		}
		while (true) {
			System.out.printf("검색자료 입력 : 단_0_입력:종료 : ");
			Scanner scanner = new Scanner(System.in);
			int input1=scanner.nextInt();
			if (input1 == 0)break;
		// 선형 검색(순차 검색)
			flag = 0;
			for (i = 0; i < NUM; i++) {
				if (arr1[0][i] == input1) {
					System.out.printf("--------- 검색 자료 출력----------\n");
					System.out.printf("cnt=%3d , arr1[0][%d]=%4d \n", i + 1, i, arr1[0][i]);
					System.out.printf("cnt=%3d , ,arr1[1][%d]=%6d \n", j + 1, i, arr1[1][j]);
					System.out.printf("--------- ---------------------------\n");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.printf("해당 자료가 없습니다. \n");
			}
		}
	// 버블정렬
	 	for (i = 0; i < NUM-1; i++) {
			sw = 0;
			for (j = 0; j < NUM - 1-i; j++) {
				if (arr1[0][j] > arr1[0][j+1]) {
					for (k = 0; k < 2; k++) {
						temp = arr1[k][j];
						arr1[k][j] = arr1[k][j+1];
						arr1[k][j+1] = temp;
						sw = 1;
					}
				}
			}
			if (sw == 0)break;
		}

	 	System.out.printf("----정렬 자료 출력-------\n");
		for (j = 0; j < 2; j++) {
			for (i = 0; i < NUM; i++) {
				System.out.printf("%4d", arr1[j][i]);
			}
			System.out.printf("\n");
		}

	/*
		// 삽입 정렬
//		for (i = 0; i < NUM - 1; i++) {  // 선택, 버블
		for (i = 1; i < NUM; i++) {
			key = arr1[i];
			for (j = i - 1; j >= 0; j--) {
				if (arr1[j] > key) {
					arr1[j + 1] = arr1[j];
					arr1[j] = key;
				}
				else {
					break;
				}
			}
//			arr1[j + 1] = key;
		}
	*/
		while (true) {
			System.out.printf("검색자료 입력 : 단_0_입력이면 종료 : ");
			Scanner scanner = new Scanner(System.in);
			int input2=scanner.nextInt();
			if (input2 == 0)break;
			// 이분검색
			low = 0; 
			high = NUM - 1;
			while (true) {
				if (low > high) {
					System.out.printf("해당 자료가 없습니다.");
					break;
				}
				else {
					mid = (low + high) / 2;
					if (arr1[0][mid] == input2) {
						System.out.printf("--------- 검색 자료 출력----------\n");
						System.out.printf("arr1[0][%d]=%4d \n", mid, arr1[0][mid]);
						System.out.printf("arr1[1][%d]=%4d \n", mid, arr1[1][mid]);
						System.out.printf("----------------------------------\n");
						break;
					}
					else if (arr1[0][mid] > input2) {
						high = mid - 1;
					}
					else {
						low = mid + 1;
					}
				}
			}
		}
		System.out.printf("수고^^ \n");

	}

}

