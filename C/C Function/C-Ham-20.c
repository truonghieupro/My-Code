/*Cho 1 mảng số nguyên n phần tử. Viết hàm nhập mảng, sắp xếp các phần tử trong mảng theo thứ tự tăng dần rồi in kết quả của mảng vừa sắp xếp ra màn hình
Đầu vào: Mảng a gồm n phần tử
Đầu ra: Mảng a đã được sắp xếp*/

#include<stdio.h>
void NhapMang(int a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		printf("a[%d] = ", i);
		scanf_s("%d", &a[i]);
	}
}
void XuatMang(int a[], int n)
{
	printf("cac phan tu cua mang la: ");
	for (int i = 0; i < n; i++)
		printf("%d ", a[i]);
	printf("\n");
}
void SapXepMang(int a[], int n)
{
	for (int i = 0; i < n - 1; i++)
		for (int j = i + 1; j < n; j++)
			if (a[j] < a[i])
			{
				int k = a[i];
				a[i] = a[j];
				a[j] = k;
			}
}
void main()
{
	int a[10], n = 10;
	NhapMang(a, n);
	XuatMang(a, n);
	SapXepMang(a, n);
	XuatMang(a, n);
}