/*Cho 1 mảng a gồm n số nguyên. Viết hàm hiển thị các số nguyên tố trong mảng a
Đầu vào: Mảng a gồm n phần tử
Đầu ra:
Nếu trong mảng a không có số nguyên tố thì in ra màn hình nội dung: "Khong co so nguyen to trong mang a"
Nếu có thì in ra màn hình nội dung: "Cac so nguyen to trong mang a la: [songuyento]"*/
#include<stdio.h>
int KiemTraSoNguyenTo(int n)
{
	int dem = 0;
	if (n <= 1)
	{
		return 0;
	}
	for (int i = 2; i <= n / 2; i++)
	{
		if (n % i == 0)
		{
			dem++;
		}
	}
	if (dem == 0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
void HienThiCacSNT(int a[], int n)
{
	int biendem = 0;
	printf("cac so nguyen to trong mang la: ");
	for (int i = 0; i < n; i++)
	{
		if (KiemTraSoNguyenTo(a[i]) == 1)
		{
			printf("%d ", a[i]);
			biendem++;
		}
	}
	if (biendem == 0)
	{
		printf("khong co so nguyen to trong mang");
	}
}
void main()
{
	int n = 5, a[] = { 1,2,3,4,5 };
	HienThiCacSNT(a, n);
}

