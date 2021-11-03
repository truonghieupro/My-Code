/*Cho một mảng số nguyên gồm n phần tử. Sắp xếp các phần tử chẵn tăng dần, phần tử lẻ giảm dần
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Một mảng mới với các phần tử đã được sắp xếp theo yêu cầu: phần tử chẵn tăng, phần tử lẻ giảm*/

#include<stdio.h>
void main()
{
	int n = 7, temp, temp1, arr[] = { 4,3,5,1,6,8,2 };
	for (int i = 0; i < n; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			if (arr[i] % 2 != 0)
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] > arr[j])
			{
				temp1 = arr[i];
				arr[i] = arr[j];
				arr[j] = temp1;
			}
			if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] < arr[j])
			{
				temp1 = arr[i];
				arr[i] = arr[j];
				arr[j] = temp1;
			}
		}
	}
	for (int i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
}