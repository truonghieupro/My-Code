#include<stdio.h>
void main()
{
	int n;
	printf("nhap vao mot so: ");
	scanf_s("%d", &n);

	for (int i = 0; i < n; i++)
	{
		printf("*");
	}
}