/*Viết hàm tính giai thừa của một số (không dùng đệ quy) và hàm tính tổng sau:
S = 1/1! + 1/2! + 1/3! + … + 1/n!
Đầu vào: Số nguyên dương n cho trước
Đầu ra: In ra màn hình nội dung: "Tong S la [S]"*/
#include<stdio.h>
int TinhGiaiThuaCuaSoN(int n)
{
	int giaithua = 1;
	for (int i = 1; i <= n; i++)
	{
		giaithua *= i;
	}
	return giaithua;
}
double TinhTongNghichDaoGiaiThua(int n)
{
	double tong = 0;
	for (int j = 1; j <= n; j++)
	{
		tong += 1.0 / TinhGiaiThuaCuaSoN(j);
	}
	return tong;
}
void main()
{
	int n = 5;
	printf("%lf", TinhTongNghichDaoGiaiThua(n));
}