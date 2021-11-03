/*Nhập từ bàn phím 1 mảng số nguyên có n  phần tử . Với 1< n <100. Nếu vi phạm, in ra Khong Hop Le và yêu cầu nhập lại cho đến khi nào thỏa mãn.
Sau đó nhập vào 1 số nguyên bất kì và in ra vị trí đầu tiên của phần tử đó trong mảng (nếu có nhiều phần tử có giá trị bằng nhau).
Nếu không có, in ra màn hình -1
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Thực hiện kiểm tra số phần tử có hợp lệ không? Sau đó hiển thị vị trí đầu tiên của phần tử vừa nhập trong mảng. Nếu không có in ra -1*/
#include<stdio.h>
void main()
{
	int n, so, a[100];
	do
	{
		printf("nhap 1<n<100 ");
		scanf_s("%d", &n);
		if (n <= 1 || n >= 100)
		{
			printf("\nkhong hop le\nnhap lai n\n");
		}
	} while (n <= 1 || n >= 100);
	for (int i = 0; i < n; i++)
	{
		printf("nhap a[%d]= ", i);
		scanf_s("%d", &a[i]);
	}
	printf("\nnhap vao so can tim ");
	scanf_s("%d", &so);
	int dem = 0;
	for (int i = 0; i < n; i++)
	{
		if (a[i] == so)
		{
			printf("\nvi tri dau tien: %d", i);
			dem++;
			break;
		}
	}
	if (dem == 0)
	{
		printf("\n-1");
	}
}
