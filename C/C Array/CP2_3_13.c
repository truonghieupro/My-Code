/*Cho một mảng số nguyên gồm n phần tử. In ra màn hình nhưng phần tử có giá trị là 2^k (với k chính là vị trí của phần tử đó trong mảng).
Sau đó tính trung bình cộng của những số đã tìm được ở dạng số thực
Đầu vào: Một mảng số nguyên và số phần tử của nó
Đầu ra: Những phần tử có dạng 2^k và trung bình cộng những số đã tìm được theo mẫu:
Nhung phan tu co dang 2^k la [ ...] va trung binh cong cua cac so do la [TBC] */
#include<stdio.h>
#include<math.h>
void main()
{
	int n, tong = 0, dem = 0, a[10];
	double tbc;
	do
	{
		printf("nhap n>0 : ");
		scanf_s("%d", &n);
		if (n <= 0)
		{
			printf("\nnhap lai n\n");
		}
	} while (n <= 0);
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap a[%d]= ", i);
		scanf_s("%d", &a[i]);
	}
	printf("\nnhung phan tu co dang 2\^k la \[ ");
	for (int i = 0; i < n; i++)
	{
		if (pow(2, i) == a[i])
		{
			printf("%d ", a[i]);
			dem++;
			tong += a[i];
		}
	}
	printf("\] va trung binh cong cua cac so do la \[ %1.lf \]", tong * 1.0 / dem);
}