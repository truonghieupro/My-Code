#include<stdio.h>
void main()
{
	char a = 'N';
	if (a > 64 && a < 91 || a>96 && a < 123)
	{
		if (a > 64 && a < 91)
		{
			printf("day la chu hoa ");
			switch (a)
			{
			case 65: case 69:case 73: case 79: case 89:
				printf("day la nguyen am");
				break;
			default:
				printf("day la phu am");
				break;
			}
		}
		else
		{
			printf("day la chu thuong ");
			switch (a)
			{
			case 97: case 101:case 105: case 111: case 121:
				printf("day la nguyen am");
				break;
			default:
				printf("day la phu am");
			}
		}

	}
	else
	{
		printf("day ko phai la chu");
	}
}