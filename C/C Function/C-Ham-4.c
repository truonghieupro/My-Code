/*Viết hàm in bảng cửu chương ra ngoài màn hình
Đầu vào: Các tham số nếu có
Đầu ra: 9 bảng cửu chương
Chú ý: Đặt tên hàm theo quy tắc đặt tên*/
#include<stdio.h>
void InBangThuN(int n)
{
	for (int i = 1; i <= 10; i++)
	{
		printf("%d*%d=%d\n", n, i, n * i);
	}
}
void InTatCaBang()
{
	for (int n = 1; n <= 9; n++)
	{
		InBangThuN(n);
		printf("\n");
	}
}
void main()
{
	InTatCaBang();
}
