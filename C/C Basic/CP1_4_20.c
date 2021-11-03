#include <stdio.h>
#include<math.h>
#include<conio.h>
void main()
{
	int N, a = 0, b = 0, c, tong = 1;
	printf("Nhap N: ");
	scanf_s("%d", &N);
	printf("day so nha: \n");
	for (int i = 1; i <= N; i++)
	{
		printf("%d - %d, ", i, i + 3);
		a = i;
		b = i + 3;
	}
	a % 2 == 0 ? c = a : c = b;
	printf("\nSo nha cua ban anh A: %d", c);
	printf("\nNha so 1 co 1 nguoi.");
	for (int i = 2; i <= N + 3; i++)
	{
		printf("\nNha so %d co %d nguoi.", i, i / 2);
		tong += i / 2;
	}
	printf("\nCo tong %d nguoi.", tong);
}
