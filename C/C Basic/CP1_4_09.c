#include<stdio.h>
#include<math.h>

void main()
{
	int a = 7, b = 4, UCLN = 0;
	{
		if (a == 0 || b == 0)
		{
			if (b > 0)
			{
				printf("UCLN la %d ", b);
			}
			else
			{
				printf("UCLN la %d ", a);
			}
		}
		else
		{
			if (a == b)
			{
				printf("UCLN la %d", a);
			}
			else
			{
				while (a != b)
				{
					//if (a >b)
					//{
					// a -= b; // a=a-b
					//}
					//else
					//{
					   // b -= a; // b=b-a
					//}
					a > b ? a -= b : b -= a;
				}
				UCLN = a;
				printf("UCLN la %d", UCLN);
			}
		}
	}
}