/*Cho một mảng số nguyên gồm n phần tử. Hiển thị lại mảng dưới dạng các phần tử là bội của 3 thì in ra "Fizz",
là bội của 5 thì in ra "Buzz", còn lại hiển trị các phần tử của mảng đó
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: - Nếu tất cả các phần tử đó đều chia hết cho 3*/
#include<stdio.h>
void main()
{
	int n = 4, dem1 = 0, dem2 = 0, arr[] = { 5,20,10,15 };
	for (int i = 0; i < n; i++)
	{
		if (arr[i] % 3 == 0)
		{
			dem1++;
		}
		if (arr[i] % 5 == 0)
		{
			dem2++;
		}
	}
	if (dem1 == n)
	{
		printf("Fizz");
	}
	else if (dem2 == n)
	{
		printf("Buzz");
	}
	else
	{
		for (int i = 0; i < n; i++)
		{
			printf("%d ", arr[i]);
		}
	}
}