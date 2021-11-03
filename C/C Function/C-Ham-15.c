/* Cho mảng số thực có nhiều hơn 2 giá trị và các giá trị trong mảng không trùng nhau. Hãy viết hàm tìm 2 giá trị gần nhau nhất trong mảng (Xét 2 giá trị gần nhau là hiệu của 2 giá trị)
Đầu vào: Mảng a
Đầu ra: Cặp giá trị thỏa mãn đề bài*/
#include<stdio.h>
#include<math.h>
void NhapMang(int n, double a[])
{
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap a[%d]= ", i);
		scanf_s("%lf", &a[i]);
	}
}
double HieuHaiSoThuc(double a, double b)
{
	if (a > b) return a - b;
	return b - a;
}
void LietKe(double a[], int n)
{
	double so1 = a[0], so2 = a[1];
	double MinHieu = HieuHaiSoThuc(so1, so2);
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			if (MinHieu > HieuHaiSoThuc(a[j], a[i]))
			{
				so1 = a[i];
				so2 = a[j];
				MinHieu = HieuHaiSoThuc(so1, so2);
			}
		}
	}
	printf("\nHai gia tri gan nhau nhat trong mang la %.1lf %.1lf", so1, so2);
}
void main()
{
	int n = 5;
	double a[5];
	NhapMang(n, a);
	LietKe(a, n);
}