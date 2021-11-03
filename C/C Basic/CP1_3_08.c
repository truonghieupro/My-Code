#include<stdio.h>
void main()
{
	int a;
	printf("nhap vao mot so: ");
	scanf_s("%d", &a);
	{
		if (a == 0)
		{
			printf("Khong");
		}
		switch (a)
		{
		case 1:
			printf("mot");
			break;
		case 2:
			printf("hai");
			break;
		case 3:
			printf("ba");
			break;
		case 4:
			printf("bon");
			break;
		case 5:
			printf("nam");
			break;
		case 6:
			printf("sau");
			break;
		case 7:
			printf("bay");
			break;
		case 8:
			printf("tam");
			break;
		case 9:
			printf("chin");
			break;
		}
	}
}