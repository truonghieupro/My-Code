/*Cho mảng số thực a có nhiều hơn 2 phần tử. Hãy viết hàm liệt kê tất cả các cặp giá trị (a, b) trong mảng thỏa điều kiện a <= b
Đầu vào: Mảng a
Đầu ra: Các cặp giá trị a,b
Chú ý: Đặt tên hàm theo quy tắc đặt tên. Chia nhỏ bài toán để viết thành các hàm riêng*/
#include<stdio.h>
void XetGiaTri(int n, double a[])
{
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = 0; j < n; j++)
		{
			if (a[i] <= a[j])
			{
				printf("\(%.1lf, %.1lf\);", a[i], a[j]);
			}
		}
	}
}
void main()
{
	double a[] = { 2,5,1,2,3 };
	int n = 5;
	XetGiaTri(n, a);
}