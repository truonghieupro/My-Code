/*Cho sẵn mảng số thực N phần tử. Xem xem mảng có phải là mảng tăng, giảm hay hỗn độn.
Biết rằng mảng tăng/giảm là mảng mà các phần tử đã sắp xếp theo thứ tự tăng/giảm.
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Hiển thị mảng đó là mảng tăng hay giảm hay hỗn độn*/
#include<stdio.h>
void main()
{
	int n, dem1 = 0, dem2 = 0, arr[10];
	printf("nhap n= ");
	scanf_s("%lf", &n);

	for (int i = 0; i < n; i++)
	{
		printf("\nnhap arr[%d]=", i);
		scanf_s("%lf", &arr[i]);
	}
	for (int i = 0; i < n - 1; i++)
	{
		if (arr[i + 1] > arr[i])
		{
			dem1++;
		}
		else
		{
			dem2++;
		}
	}
	if (dem1 == n - 1)
	{
		printf("\nday la mang tang");
	}
	else if (dem2 == n - 1)
	{
		printf("\nday la mang giam");
	}
	else
	{
		printf("\nday la mang hon don");
	}
}