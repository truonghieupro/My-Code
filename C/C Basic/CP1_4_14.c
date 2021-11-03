// Bài toán tính tổng nghịch đảo số nguyên tố
#include<stdio.h>
void main()
{
	int n = 10;
	double tong = 0;
	for (int i = 2; i <= n; i++) // 2 3 4 5 6
	{
		int biendem = 0; // 0 0 0 0 0
		for (int j = 2; j <= i / 2; j++) // 2 2 2 2 2 
		{
			if (i % j == 0)
			{
				biendem++; // 1 1
				break;
			}
		}
		if (biendem == 0)
		{
			tong += 1.0 / i; // 1.0/2+1.0/3+1.0/5
		}
	}
	printf("tong nghich dao cua cac so nguyen to la: %lf", tong);
}