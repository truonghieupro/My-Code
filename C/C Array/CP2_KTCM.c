/*Cho một mảng số nguyên có N phần tử, thực hiện các yêu cầu sau:
- In mảng vừa nhập ra màn hình
- Hiển thị các phần tử lẻ trong mảng
- Trong các phần tử lẻ vừa hiển thị, tìm các phần tử là số nguyên tố
- Tính tích các số nguyên tố ở vị trí chẵn trong mảng*/
#include<stdio.h>
void main()
{
	int n, tich = 1, a[100];
	printf("nhap n: ");
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++)
	{
		printf("nhap a[%d]= ", i);
		scanf_s("%d", &a[i]);
	}
	printf("cac phan tu cua mang la: \[ ");
	for (int i = 0; i < n; i++)
	{
		printf("%d ", a[i]);
	} printf("\]");
	printf("\nCac phan tu le trong mang do la: \[");
	for (int i = 0; i < n; i++)
	{
		if (a[i] % 2 != 0)
		{
			printf("%d ", a[i]);
		}
	} printf("\]");
	printf("\nCac phan tu le la so nguyen to trong mang do la: \[");
	for (int i = 0; i < n; i++)
	{
		int dem = 0;
		if (a[i] > 2)
		{
			for (int j = 2; j <= a[i] / 2; j++)
			{
				if (a[i] % j == 0)
				{
					dem++;
					break;
				}
			}
			if (dem == 0)
			{
				printf("%d ", a[i]);
			}
			if (dem == 0 && i % 2 == 0)
			{
				tich *= a[i];
			}
		}
	} printf("\]\n");
	printf("tich cac so nguyen to o vi tri chan trong mang la \[ %d \]", tich);
}