#include<stdio.h>
void main()
{
	int a = 6, b = 8, ucln = 0, bcnn = 0;
	int tich = a * b;
	if (a == 0 || b == 0)
	{
		if (b > 0)
		{
			ucln = b;
		}
		else
		{
			ucln = a;
		}
	}
	else
	{
		if (a == b)
		{
			ucln = a;
		}
		else
		{
			while (a != b)
			{
				a > b ? a -= b : b -= a;
			}
			ucln = a;
		}
	}
	bcnn = tich / ucln;
	printf("bcnn la %d", bcnn);
}