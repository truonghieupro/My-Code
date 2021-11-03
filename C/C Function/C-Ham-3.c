/*Cho số nguyên dương n. Viết hàm kiểm tra số đó có phải là số chính phương không?
Số chính phương là bình phương của một số tự nhiên. Ví dụ: 4,9 là số chính phương (4=2^2, 9=3^2)
Đầu vào: Số nguyên dương n
Đầu ra: Đúng hoặc sai*/
#include<stdio.h>
#include<math.h>
int TraVeSoChinhPhuong(int n)
{
	if ((int)sqrt((double)n) == sqrt((double)n))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
void main()
{
	int n = 9;
	if (TraVeSoChinhPhuong(n) == 1)
	{
		printf("Đung");
	}
	else
	{
		printf("Sai");
	}
}