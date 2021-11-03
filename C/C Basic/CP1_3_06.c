#include<stdio.h>
void main()
{
	int a = 10;
	scanf_s("%d", &a);
	if (1 < a < 100)
	{
		if (a % 3 == 0 && a % 5 == 0)
			printf("chia het cho ca ba va nam");
		else if (a % 3 == 0)
			printf("chia het cho ba");
		else if (a % 5 == 0)
			printf("chia het cho nam");
	}
	else
	{
		printf("Khong thoa man gia tri dau vao");
	}
}