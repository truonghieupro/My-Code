#include<stdio.h>
void main()
{
	int motso;
	printf("nhap vao mot so hai chu so: ");
	scanf_s("%d", &motso);
	if (motso > 9 && motso <= 99)
	{
		int hangchuc = motso / 10;
		switch (hangchuc)
		{
		case 1:
			printf("muoi");
			break;
		case 2:
			printf("hai muoi");
			break;
		case 3:
			printf("ba muoi");
			break;
		case 4:
			printf("bon muoi");
			break;
		case 5:
			printf("nam muoi");
			break;
		case 6:
			printf("sau muoi");
			break;
		case 7:
			printf("bay muoi");
			break;
		case 8:
			printf("tam muoi");
			break;
		case 9:
			printf("chin muoi");
			break;
		}
		int hangdonvi = motso % 10;
		switch (hangdonvi)
		{
		case 0:
			printf("");
			break;
		case 1:
			printf(" mot");
			break;
		case 2:
			printf(" hai");
			break;
		case 3:
			printf(" ba");
			break;
		case 4:
			printf(" bon");
			break;
		case 5:
			printf(" lam");
			break;
		case 6:
			printf(" sau");
			break;
		case 7:
			printf(" bay");
			break;
		case 8:
			printf(" tam");
			break;
		case 9:
			printf(" chin");
			break;
		}
	}
	else
	{
		printf("ko phai so co hai chu so");
	}

}