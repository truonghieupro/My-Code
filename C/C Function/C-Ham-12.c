/*Viết hàm đệ quy tìm số Fibonacci thứ n, biết 2 số đầu tiên của dãy là 1 và 1.
Đầu vào: Vị trí n
Đầu ra: In ra màn hình nội dung: "Số Fibonacci thứ [n] la [giatri]"*/
#include<stdio.h>
int Fibon(int n)
{
	if (n == 1 || n == 2) return 1;
	else return Fibon(n - 1) + Fibon(n - 2);
}
void main()
{
	int n = 7;
	printf("So Fibonaci thu \[%d\] la \[%d\]", n, Fibon(n));
}