#include<stdio.h>
void main()
{
	int soPhutGoi;
	double d = 0;
	printf("so Phut Goi: ");
	scanf_s("%d", &soPhutGoi);
	if (soPhutGoi < 0)
	{
		printf("so phut ko hop le");
	}
	else if (soPhutGoi <= 50)
	{
		d = 25000 + 600 * soPhutGoi * 0.1;
	}
	else if (soPhutGoi <= 200)
	{
		d = (50 * 600 + 400 * (soPhutGoi - 50)) * 0.1 + 25000; // 50 phut dau*600, 51 den phut thu 200 tinh 400
	}
	else
	{
		d = (50 * 600 + 400 * 150 + 200 * (soPhutGoi - 200)) * 0.1 + 25000; // 50 phut dau*600, 51 den phut thu 200 tinh 400,sau phut 200 tinh 200
	}
	printf("gia tien cuoc dien thoai la: %.1lf", d);
}