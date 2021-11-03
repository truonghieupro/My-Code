/*Cho một mảng số nguyên gồm n phần tử. Tìm số chẵn ở vị trí lẻ cuối cùng của mảng

Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Các số chẵn ở vị trí lẻ cuối cùng trong mảng theo mẫu: So [So tim duoc] la so chan o vi tri [Vi tri] la vi tri le cuoi cung cua mang*/

#include<stdio.h>
void main()
{
	int n = 6, arr[] = { 1,2,3,4,5,6 };
	for (int i = n - 1; i >= 0; i--)
	{
		if (arr[i] % 2 == 0 && i % 2 != 0)
		{
			printf("\nSo %d la so chan o vi tri %d la vi tri le cuoi cung cua mang ", arr[i], i);
			break;
		}
	}
}