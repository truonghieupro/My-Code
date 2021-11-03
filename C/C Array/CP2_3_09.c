/*Nhập từ bàn phím 1 mảng số nguyên có n  phần tử sau đó xuất ra màn hình mảng đó và mảng ngược của nó.
Với 1< n <100 thì hiển thị lại mảng đó. Nếu vi phạm, in ra Khong Hop Le và yêu cầu nhập lại cho đến khi nào thỏa mãn.
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Nếu 1<n<100, hiển thị lại mảng. Ngược lại, yêu cầu nhập lại đến khi nào thỏa mãn */
#include<stdio.h>
void main()
{
	int n, a[100];
	do
	{
		printf("nhap 1<n<100: ");
		scanf_s("%d", &n);
		if (n <= 1 || n >= 100)
		{
			printf("nhap lai n\n");
		}
	} while (n <= 1 || n >= 100);
	for (int i = 0; i < n; i++)
	{
		printf("nhap a[%d]= ", i);
		scanf_s("%d", &a[i]);
	}
	for (int i = 0; i < n; i++)
	{
		printf("%d ", a[i]);
	}
	printf("\n");
	for (int i = n - 1; i >= 0; i--)
	{
		printf("%d ", a[i]);
	}
}


