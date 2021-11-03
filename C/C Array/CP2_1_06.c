/*Cho một mảng số nguyên gồm n phần tử. Thay thế các phần tử trong mảng bằng số đối của nó.

Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Một mảng mới sao cho các phần tử là đối số của mảng cũ*/
#include<stdio.h>
void main()
{
	int n = 5, i = 0, arr[] = { -1,2,-3,4,-5 };
	for (int i = 0; i < n; i++)
	{
		arr[i] *= (-1);
		printf("%d ", arr[i]);
	}
}
