#include<stdio.h>
void main()
{
	int motso, biendem = 0;
	printf("nhap vao mot so: ");
	scanf_s("%d", &motso);
	if (motso == 1)
	{
		printf("ko la so nguyen to");
	}
	else
	{
		for (int i = 2; i <= motso / 2; i++)
		{
			if (motso%i==0)
			{ 
				biendem++;
				break;
			}
		}
		if (biendem == 0)
		{
			printf("la so nguyen to");
		}
		else
		{
			printf("ko la so nguyen to");
		}

	}
}