#include<stdio.h>
void main()
{
	int thang;
	printf("nhap vao thang: ");
	scanf_s("%d", &thang);
	switch (thang)
	{
	case 1:case 2: case 3:
		printf("thuoc quy mot");
		break;
	case 6:case 4: case 5:
		printf("thuoc quy hai");
		break;
	case 7:case 8: case 9:
		printf("thuoc quy ba");
		break;
	case 10:case 11: case 12:
		printf("thuoc quy bon");
		break;
	default:
		printf("ko hop le");
		break;
	}
}