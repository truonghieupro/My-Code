#include<stdio.h>
void main()
{
	int a;
	printf("nhap vao so nam: ");
	scanf_s("%d", &a);

	if (a >= 1000 && a <= 2020)
	{
		if (a % 4 == 0 && a % 100 != 0)
			printf("nam %d la nam nhuan", a);
		else if (a % 400 == 0)
			printf("nam %d la nam nhuan", a);
		else
			printf("nam %d ko nhuan", a);
	}
	else
		printf("khong tinh duoc");
}