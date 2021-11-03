/*Ta định nghĩa 1 mảng có tính chất lẻ, khi tổng của 2 phần tử liên tiếp luôn là lẻ.
Cho 1 mảng a bất kì không quá 50 phần tử và kiểm tra mảng có tính chất lẻ hay không. Nếu có in ra YES, ngược lại in ra NO
Đầu vào: Một mảng số nguyên và số phần tử không quá 50
Đầu ra:
Nếu quá 50 phần tử, in ra Khong Hop Le
Ngược lại,
Nếu đó là mảng có tính chất lẻ => Hiển thị YES
Nếu đó không là mảng có tính chất lẻ => Hiển thị NO */
#include<stdio.h>
void main()
{
	int dem = 0, n, a[50];
	do
	{
		printf("nhap n<=50 : ");
		scanf_s("%d", &n);
		if (n > 50)
		{
			printf("\nKhong Hop Le\n");
		}
	} while (n > 50);
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap a[%d]= ", i);
		scanf_s("%d", &a[i]);
	}
	for (int i = 0; i < n; i++)
	{
		if ((a[i] += a[i + 1]) % 2 == 0)
		{
			dem++;
		}
	}
	if (dem == 0)
	{
		printf("\nYES");
	}
	else
	{
		printf("\nNO");
	}
}
