/*Viết hàm tìm ước chung lớn nhất của 2 số a, b cho trước
Đầu vào: 2 số a,b
Đầu ra: Ước chung lớn nhất của a, b*/
#include<stdio.h>
int TimUCLN(int a, int b)
{
	if (a == 0 || b == 0)
	{
		if (b > 0) return b;
		else return a;
	}
	else
	{
		if (a == b) return a;
		else
			while (a != b) a > b ? a -= b : b -= a;
		return a;
	}
}
void main()
{
	int a = 81, b = 27;
	printf("UCLN cua %d va %d la %d", a, b, TimUCLN(a, b));
}

