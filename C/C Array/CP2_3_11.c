/*Cho 1 mảng số nguyên có số phần tử không nhỏ hơn 3. Hãy in ra màn hình vị trí của phần tử mà tại đó có 2 phần tử lân cận sao cho tích 2 phần tử đó bằng phần tử ở giữa. Nếu không có số nào thỏa mãn in ra -1
Đầu vào: Thực hiện nhập từng phần tử trong mảng từ bàn phím
Đầu ra: Hiển thị vị trí của phần tử thỏa mãn yêu cầu đề bài*/
#include<stdio.h>
void main()
{
	int n, dem = 0, a[100];
	do
	{
		printf("nhap n>=3 :");
		scanf_s("%d", &n);
		if (n < 3)
		{
			printf("\nnhap lai n");
		}
	} while (n < 3);
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap a[%d]", i);
		scanf_s("%d", &a[i]);
	}
	printf("\ncac vi tri ma tai do cac phan tu thoa man de bai la: ");
	for (int i = 1; i < n; i++)
	{
		if ((a[i - 1] *= a[i + 1]) == a[i])
		{
			dem++;
			printf("%d ", i);
		}
	}
	if (dem == 0)
	{
		printf("\n-1");
	}
}