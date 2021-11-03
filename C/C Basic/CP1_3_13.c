#include<stdio.h>
void main()
{
	double doanhThu = 0, tienhoahong = 0;
	printf("nhap doanh thu: ");
	scanf_s("%lf", &doanhThu);
	int a = 1, b = 2, c = 4;
	int d = a < b ? c : (a + b);
	printf("%d", d);
	tienhoahong = (doanhThu <= 100000000) ? (doanhThu * 0.05) : (doanhThu <= 300000000) ? (doanhThu * 0.1) : (doanhThu * 0.2);
	printf("hoa hong nhan duoc la: %lf", tienhoahong);

}