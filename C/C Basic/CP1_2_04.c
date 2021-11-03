#include<math.h>
#include<stdio.h>

void main()
{
	int a = 1, b = 2;
	printf("nhap a:");
	scanf_s("%d", &a);
	printf("nhap b:");
	scanf_s("%d", &b);
	double ketqua = sqrt(a * 1.0 / b); //  la ket qua căn bậc hai của thương a và b
	printf("ket qua cua phep tinh la %.4lf", ketqua);

}