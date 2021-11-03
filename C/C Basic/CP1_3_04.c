#include<stdio.h>
void main()
{
	int a;
	scanf_s("%d", &a);
	switch (a)
	{
	case 2:
		printf("thu hai");
		break;
	case 3:
		printf("thu ba");
		break;
	case 4:
		printf("thu tu");
		break;
	case 5:
		printf("thu nam");
		break;
	case 6:
		printf("thu sau");
		break;
	case 7:
		printf("thu bay");
		break;
	case 8:
		printf("chu nhat");
		break;
	default:
		printf("ko phai thu trong tuan");
		break;
	}

}