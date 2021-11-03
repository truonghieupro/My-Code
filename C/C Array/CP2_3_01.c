/*Cho mảng số nguyên N phần tử. Tính tổng các số hoàn hảo trong mảng.
Biết rằng số hoàn hảo là số có tổng các ước bé hơn nó thì bằng nó.
Đầu vào: Một mảng các số nguyên và số phần tử của mảng đó
Đầu ra: Hiển thị các phần tử là số hạnh phúc và tính tổng các số đó theo mẫu sau*/
#include<stdio.h>
void main()
{
	int n = 6, tong = 0, tong1 = 0, arr[] = { 1,2,6,3,4,28 };
	printf("cac so hoan hao la : ");
	for (int i = 0; i < n; i++)
	{
		tong = 0;
		for (int j = 1; j <= arr[i] / 2; j++)
		{
			if (arr[i] % j == 0)
			{
				tong += j;
			}
			if (tong == arr[i])
			{
				printf("%d ", arr[i]);
				tong1 += arr[i];
			}
		}
	}
	printf("\ntong cac so hoan hao tim duoc la: %d", tong1);
}