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
void Hien(SoPhuc p)
{
	printf("z=%d+%di", p.thuc, p.ao);
}
void main()
{
	SoPhuc p;
	NhapSoPhuc(p);
	Hien(p);
}