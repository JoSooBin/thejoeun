

//  석차, 삽입정렬, 선형검색, 이분검색
/*
#include <stdio.h>
#define NUM 10
int main() {
	int i, j,  rank, input, flag, key;
	int low, high, mid;
	int arr1[NUM] = { 30, 60, 40, 70, 50,100, 20, 90,10, 80 };
	printf("----초기자료 출력-------\n");
	for (i = 0; i < NUM; i++) {
		printf("%4d", arr1[i]);
	}
	printf("\n");
	while (1) {
		printf("검색자료 입력 : 단_0_입력:종료 : ");
		scanf_s("%d", &input);
		if (input == 0)break;
	// 선형 검색(순차 검색)
		flag = 0;
		for (i = 0; i < NUM; i++) {
			if (arr1[i] == input) {
				printf("--------- 검색 자료 출력----------\n");
				printf("cnt=%3d , arr1[%d]=%4d \n", i + 1, i, arr1[i]);
				printf("--------- ---------------------------\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			printf("해당 자료가 없습니다. \n");
		}
	}
	
	// 석차 구하기
	for (i = 0; i < NUM; i++) {
		rank = 1;
		for (j = 0; j < NUM; j++) {
			if (arr1[i] < arr1[j]) {
				rank = rank + 1;
			}
		}
		printf("arr1[%d]=%4d, rank=%3d \n", i, arr1[i], rank);
	}
	// 삽입 정렬
//	for (i = 0; i < NUM - 1; i++) {  // 선택, 버블
	for (i = 1; i < NUM; i++) {
		key = arr1[i];
		for (j = i - 1; j >= 0; j--) {
			if (arr1[j] > key) {
				arr1[j + 1] = arr1[j];
			}
			else {
				break;
			}
		}
		arr1[j + 1] = key;
	}

	printf("----정렬자료 출력-------\n");
	for (j = 0; j < NUM; j++) {
		printf("%4d", arr1[j]);
	}
	printf("\n");

	while (1) {
		printf("검색자료 입력 : 단_0_입력:종료 : ");
		scanf_s("%d", &input);
		if (input == 0)break;
		// 이분검색
		low = 0, high = NUM - 1;
		while (1) {
			if (low > high) {
				printf("해당 자료가 없습니다.");
				break;
			}
			else {
				mid = (low + high) / 2;
				if (arr1[mid] == input) {
					printf("--------- 검색 자료 출력----------\n");
					printf("arr1[%d]=%4d \n", mid, arr1[mid]);
					printf("----------------------------------\n");
					break;
				}
				else if (arr1[mid] > input) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
		}
	}
	printf("수고^^ \n");
	system("pause");
	return 0;
}
*/
// 석차, 버블정렬, 이분검색
/*
#include <stdio.h>
#define NUM 10
int main() {
	int i, j, k, cnt, temp, rank, sw, input;
	int low = 0, high = NUM - 1, mid;
	int arr1[NUM] = { 30, 60, 40, 70, 50,100, 20, 90,10, 80 };
	printf("----초기자료 출력-------\n");
	for (j = 0; j < NUM; j++) {
		printf("%4d", arr1[j]);
	}
	printf("\n");
	printf("검색자료 입력 : ");
	scanf_s("%d", &input);

	// 선형 검색(순차 검색)
	for (i = 0; i < NUM; i++) {
		if (arr1[i] == input) {
			printf("--------- 검색 자료 출력----------\n");
			printf("cnt=%3d , arr1[%d]=%4d \n", i+1, i, arr1[i]);
			printf("--------- ---------------------------\n");
			break;
		}
	}
	// 석차 구하기
	for (i = 0; i < NUM; i++) {
		rank = 1;
		for (j = 0; j < NUM; j++) {
			if (arr1[i] < arr1[j]) {
				rank = rank + 1;
			}
		}
		printf("arr1[%d]=%4d, rank=%3d \n", i, arr1[i], rank);
	}
	// 버블 정렬
	for (i = 0; i < NUM - 1; i++) {
		sw = 0;
		for (j =0; j < NUM-i-1; j++) {
			if (arr1[j] > arr1[j+1]) {
				temp = arr1[j];
				arr1[j] = arr1[j+1];
				arr1[j+1] = temp;
				sw = 1;
			}
		}
		if (sw == 0)break;
	}

	printf("----정렬자료 출력-------\n");
	for (j = 0; j < NUM; j++) {
		printf("%4d", arr1[j]);
	}
	printf("\n");

	printf("검색자료 입력 : ");
	scanf_s("%d", &input);
	
	// 이분검색 
	while (1) {
		if (low > high) {
			printf("해당 자료가 없습니다.");
			break;
		}
		else {
			mid = (low + high) / 2;
			if (arr1[mid] == input) {
				printf("--------- 검색 자료 출력----------\n");
				printf("arr1[%d]=%4d \n", mid, arr1[mid]);
				printf("----------------------------------\n");
				break;
			}
			else if (arr1[mid] > input) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
	}
	   	  
	system("pause");
	return 0;
}