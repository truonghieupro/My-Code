#include<stdio.h>
struct SoPhuc
{
	int thuc;
	int ao;
};
void NhapSoPhuc(SoPhuc& p)
{
	printf("nhap phan thuc ");
	scanf_s("%d", &p.thuc);
	printf("nhap phan ao ");
	scanf_s("%d", &p.ao);
}
void NhapMangSoPhuc(SoPhuc a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		NhapSoPhuc(a[i]);
	}
}
void Xuat(SoPhuc p)
{
	printf("%d+%di\n", p.thuc, p.ao);
}
void XuatMotMangSoPhuc(SoPhuc a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		if (a[i].ao > 999) { Xuat(a[i]); }
	}
}
void main(SoPhuc p)
{
	SoPhuc a[50];
	int n = 3;
	NhapMangSoPhuc(a, n);
	XuatMotMangSoPhuc(a, n);
}