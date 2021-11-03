/*Cho một mảng số nguyên n phần tử. Kiểm tra xem mảng có phải mảng đối xứng hay không?
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra : Kiểm tra xem mảng đó có phải mảng đối xứng không? Nếu có in ra "La mang doi xung", ngược lại in ra "Khong la mang doi xung"*/

#include<stdio.h>
void main()
{
	int n, dem = 0, arr[10];
	printf("nhap n= ");
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap arr[%d]", i);
		scanf_s("%d", &arr[i]);
	}
	for (int i = 0; i <= n / 2; i++)
	{
		dem = 0;
		if (arr[i] != (arr[n - i - 1]))
		{
			dem++;
		}
	}
	if (dem == 0)
	{
		printf("\nla mang doi xung");
	}
	else
	{
		printf("\nla mang khong doi xung");
	}
}