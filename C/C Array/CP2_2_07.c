/*Cho một mảng số nguyên gồm n phần tử. Sắp xếp các phần tử lẻ theo thứ tự tăng dần, các phần tử còn lại giữ nguyên vị trí
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Một mảng mới với các phần tử đã được sắp xếp theo yêu cầu: phần tử lẻ tăng dần, các phần tử còn lại giữ nguyên*/
#include<stdio.h>
void main()
{
	int n = 9, temp, arr[] = { 2,1,5,6,3,9,8,10,7 };
	for (int i = 0; i < n; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] > arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	for (int i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
}