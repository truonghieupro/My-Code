#include<stdio.h>
struct SanPham
{
	char ten[50];
	char loai[50];
	int gia;
	char ghichu[50];
};
void Nhap(SanPham& x)
{
	char g[10];
	printf("nhap ten sp: ");
	gets_s(x.ten);
	printf("nhap loai sp: ");
	gets_s(x.loai);
	printf("nhap gia: ");
	scanf_s("%d", &x.gia);
	gets_s(g);
	printf("nhap ghi chu: ");
	gets_s(x.ghichu);
}
void Xuat(SanPham x)
{
	printf("%s\n%s\n%d\n%s\n", x.ten, x.loai, x.gia, x.ghichu);
}
void NhapDaySP(SanPham a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		Nhap(a[i]);
	}
}
void SapXepDay(SanPham a[], int n)
{
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = 1; j < n; j++)
		{
			if (a[i].gia > a[j].gia)
			{
				SanPham g = a[i];
				a[i] = a[j];
				a[j] = g;
			}
		}
	}
}
void XuatDaySP(SanPham a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		Xuat(a[i]);
	}
}
void main()
{
	SanPham a[100]; int n = 3;
	NhapDaySP(a, n);
	SapXepDay(a, n);
	XuatDaySP(a, n);
}