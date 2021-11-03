/*Cho 1 mảng số nguyên có n phần tử. In ra màn hình số chính phương đầu tiên và vị trí của nó trong mảng.
Đầu vào: Mảng arr và số phần tử n
Đầu ra:
Nếu số n nhỏ hơn 0 hoặc nếu mảng không có số chính phương nào thì: hiển thị ra nội dung "Khong co so chinh phuong nao trong mang"
Nếu mảng có tồn tại số chính phương thì:
Hiển thị số chính phương đầu tiên trong mảng và vị trí của nó theo mẫu:
"So chinh phuong dau tien trong mang la [số chính phương] nam o vi tri so [vi tri] trong mang"*/
#include<stdio.h>
#include<math.h>
void main()
{
	int n, arr[10];
	do
	{
		printf("nhap n>0 :");
		scanf_s("%d", &n);
		if (n <= 0)
		{
			printf("\nkhong co so chinh phuong nao trong mang\n");
		}
	} while (n <= 0);
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap a[%d]= ", i);
		scanf_s("%d", &arr[i]);
	}
	for (int i = 0; i < n; i++)
	{
		if (pow(sqrt(arr[i]), 2) == arr[i])
		{
			printf("\nSo chinh phuong dau tien trong mang la \[ %d \] nam o vi tri so \[ %d \] trong mang", arr[i], i);
			break;
		}
	}
}