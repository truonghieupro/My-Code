#include<stdio.h>
void main()
{
	int a, b, c;
	printf("nhap a: ");
	scanf_s("%d", &a);
	printf("nhap b: ");
	scanf_s("%d", &b);
	printf("nhap c: ");
	scanf_s("%d", &c);
	if (a + b + c == a * b * c)
	{
		printf("%d,%d,%d la so tam hoa", a, b, c);
	}
	else
		printf("%d,%d,%d ko la so tam hoa", a, b, c);
}