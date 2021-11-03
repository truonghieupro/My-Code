// Bài toán tính tổng nghịch đảo giai thừa
#include<stdio.h>
void main()
{
	int n = 5;
	double tong = 0;
	for (int i = 2; i <= n; i += 2)
	{
		int giaithua = 1;
		for (int j = 1; j <= i; j++)
		{
			giaithua *= j;
		}
		tong += 1.0 / giaithua;
	}
	printf("tong nghich dao cua cac giai thua la so chan la : %lf", tong);
}