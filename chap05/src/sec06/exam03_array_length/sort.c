//  ����, ��������, �����˻�, �̺а˻�

#include <stdio.h>
#define NUM 10
int main() {
	int i, j, k, rank, input, flag, key, temp, sw;
	int low, high, mid;
	int arr1[2][NUM] = { 30, 60, 40, 70, 50,100, 20, 90,10, 80 };
	
	for (i = 0; i < NUM; i++) {
		arr1[1][i] = 1;
	}
	printf("\n");
	printf("----�ʱ��ڷ� ���-------\n");
	for (j = 0; j < 2; j++) {
		for (i = 0; i < NUM; i++) {
			printf("%4d", arr1[j][i]);
		}
		printf("\n");
	}
	// ���� ���ϱ�
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
	printf("----���� �ڷ� ���-------\n");
	for (j = 0; j < 2; j++) {
		for (i = 0; i < NUM; i++) {
			printf("%4d", arr1[j][i]);
		}
		printf("\n");
	}
	while (1) {
		printf("�˻��ڷ� �Է� : ��_0_�Է�:���� : ");
		scanf_s("%d", &input);
		if (input == 0)break;
	// ���� �˻�(���� �˻�)
		flag = 0;
		for (i = 0; i < NUM; i++) {
			if (arr1[0][i] == input) {
				printf("--------- �˻� �ڷ� ���----------\n");
				printf("cnt=%3d , arr1[0][%d]=%4d \n", i + 1, i, arr1[0][i]);
				printf("cnt=%3d , ,arr1[1][%d]=%4d \n", i + 1, i, arr1[1][i]);
				printf("--------- ---------------------------\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			printf("�ش� �ڷᰡ �����ϴ�. \n");
		}
	}
// ��������
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

	printf("----���� �ڷ� ���-------\n");
	for (j = 0; j < 2; j++) {
		for (i = 0; i < NUM; i++) {
			printf("%4d", arr1[j][i]);
		}
		printf("\n");
	}

/*
	// ���� ����
//	for (i = 0; i < NUM - 1; i++) {  // ����, ����
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
//		arr1[j + 1] = key;
	}
*/
	while (1) {
		printf("�˻��ڷ� �Է� : ��_0_�Է�:���� : ");
		scanf_s("%d", &input);
		if (input == 0)break;
		// �̺а˻�
		low = 0, high = NUM - 1;
		while (1) {
			if (low > high) {
				printf("�ش� �ڷᰡ �����ϴ�.");
				break;
			}
			else {
				mid = (low + high) / 2;
				if (arr1[mid] == input) {
					printf("--------- �˻� �ڷ� ���----------\n");
					printf("arr1[0][%d]=%4d \n", mid, arr1[0][mid]);
					printf("arr1[1][%d]=%4d \n", mid, arr1[1][mid]);
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
	printf("����^^ \n");

	return 0;
}
