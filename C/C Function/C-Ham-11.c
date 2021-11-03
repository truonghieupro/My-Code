/*Cho 1 mảng a gồm n phần tử với các phần tử được nhập từ bàn phím. Viết hàm tìm ước chung lớn nhất của tất cả phần tử trong mảng a
Đầu vào: Mảng a gồm n phần tử
Đầu ra: In ra màn hình nội dung: "Uoc chung lon nhat cua tat ca phan tu trong mang la [ucln]"*/
#include<stdio.h>
int TimUCLN2so(int a, int b)
{
	if (a == 0 || b == 0)
	{
		if (b > 0) return b;
		else return a;
	}
	else
	{
		if (a == b) return a;
		else
			while (a != b) a > b ? a -= b : b -= a;
		return a;
	}
}
int TimUCLNtrongMang(int n, int a[])
{
	int ucln = a[0];
	for (int i = 0; i < n; i++)
	{
		ucln = TimUCLN2so(ucln, a[i]);
	}
	return ucln;
}
void main()
{
	int n = 5, a[] = { 27,6,18,81,15 };
	printf("Uoc chung lon nhat cua tat ca phan tu trong mang la %d", TimUCLNtrongMang(n, a));
}