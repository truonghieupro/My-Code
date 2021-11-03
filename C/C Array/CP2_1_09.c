/*Cho 1 mảng số nguyên có n phần tử . Hãy tính tổng các số chia hết cho 3 hoặc 5

Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Hiển thị các số chia hết cho 3 hoặc chia hết cho 5 ra màn hình và tính tổng các số đó*/
#include<stdio.h>
void main()
{
	int n = 6, tong = 0, arr[] = { 1,2,3,4,5,15 };
	printf("cac so chia het cho 3 hoac 5 la: ");
	for (int i = 0; i < n; i++)
	{
		if (arr[i] % 3 == 0 || arr[i] % 5 == 0)
		{
			printf("%d ", arr[i]);
			tong += arr[i];
		}
	}
	printf("\n\=> tong cac so do la: %d", tong);
}