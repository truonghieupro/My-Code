#include<stdio.h>
void main()
{
	int a = 1, dem = 0;
	printf("nhap mot so: ");
	scanf_s("%d", &a);
	for (int i = a; i != 0; i = i / 10)
	{
		dem++;
	}
	printf("so %d co %d chu so", a, dem);
}