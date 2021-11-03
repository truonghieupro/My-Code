#include<stdio.h>
void NhapMang(int n, int a[])
{
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap a[%d]=", i);
		scanf_s("%d", &a[i]);
	}
}
void LietKeGiaTri(int n, int a[])
{
	for (int i = 1; i < n - 1; i++)
	{
		if (a[i] % 2 == 0 && (a[i - 1] % 2 == 0 || a[i + 1] % 2 == 0)) printf("(%d,%d)", a[i], a[i + 1]);
	}
}
void main()
{
	int n = 5, a[10];
	NhapMang(n, a);
	LietKeGiaTri(n, a);
}