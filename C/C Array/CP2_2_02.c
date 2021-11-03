/*Cho 1 mảng số nguyên N phần tử. In ra tổng bình phương của phần tử bé nhất và lớn nhất trong mảng.
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: In ra số lớn nhất và bé nhất trong mảng và tính tổng bình phương của chúng*/
#include<stdio.h>
#include<math.h>
void main()
{
	int n = 5, tong = 0, arr[] = { 1,4,3,7,5 }, min = arr[0], max = arr[0];
	for (int i = 0; i < n; i++)
	{
		if (arr[i] < min)
		{
			min = arr[i];
		}
		if (arr[i] > max)
		{
			max = arr[i];
		}
	}
	tong = pow(max, 2) + pow(min, 2);
	printf("so lon nhat trong mang la %d so nho nhat trong mang la %d tong binh phuong cua chung la %d", max, min, tong);
}
