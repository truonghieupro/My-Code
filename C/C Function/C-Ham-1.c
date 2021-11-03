/*Cho 2 số thực a, b. Viết hàm để tính tích 2 số thực
Đầu vào: Các số a, b
Đầu ra: Kết quả tích a, b*/

#include<stdio.h>
double TinhTich(double a, double b)
{
	double Tich = a * b;
	return Tich;
}
void main()
{
	double a = 7, b = 2;
	printf("%.0lf", TinhTich(a, b));
}
