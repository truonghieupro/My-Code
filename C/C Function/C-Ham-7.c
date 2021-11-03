/*Cho mảng a gồm n số nguyên được gán giá trị tùy ý. Viết hàm đưa ra vị trí đầu tiên của phần tử x trong mảng a
Đầu vào: Mảng a gồm n phần tử, phần tử x
Đầu ra:
Nếu không có phần tử x trong mảng thì in ra màn hình nội dung: "Khong tim thay phan tu x trong mang"
Nếu tìm thấy x thì in ra màn hình nội dung: "Phan tu [x] xuat hien dau tien o vi tri [vitri]"*/
#include<stdio.h>
int DuaRaViTriX(int n, int x, int a[])
{
	int dem = -1;
	for (int i = 0; i < n; i++)
	{
		if (a[i] == x)
		{
			return dem = i;
			break;
		}
	}
	return dem;
}
void main()
{
	int n = 5, x = 4;
	int a[] = { 1,2,3,4,5 };
	if (DuaRaViTriX(n, x, a) == -1)
	{
		printf("Khong Tim Thay Phan Tu %d Trong Mang", x);
	}
	else
	{
		printf("Phan Tu \[%d\] xuat hien dau tien o vi tri \[%d\] ", x, DuaRaViTriX(n, x, a));
	}
}
