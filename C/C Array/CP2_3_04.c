/*Cho một mảng số nguyên n phần tử. Tìm tất cả các số chính phương trong mảng
Đầu vào: Một mảng số nguyên gồm n phần tử.
Đầu ra: Hiển thị tất cả các số chính phương trong mảng*/
#include<stdio.h>
#include<math.h>

void main()
{
	int n = 6, arr[] = { 1,3,4,9,6,16 };
	printf("cac so chinh phuong trong mang la: ");
	for (int i = 0; i < n; i++)
	{
		if (pow(sqrt(arr[i]), 2) == arr[i])
		{
			printf("%d ", arr[i]);
		}
	}
}