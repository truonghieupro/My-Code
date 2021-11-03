/*Cho một cặp số nguyên dương a và b, kiểm tra xem:
- Hiển thị các bội số của 5 trong khoảng [a, b]
- In ra các số nguyên tố trong khoảng từ (a, b)
- Cặp số đó có phải là số nguyên tố cùng nhau hay không?
- Cặp số đó có phải số bạn bè hay không? (Một cặp số nguyên dương được gọi là số bạn bè nếu tổng các ước số của số này bằng chính số kia). 
  Nếu phải thì xuất 'YES', ngược lại là 'NO'.*/

#include<stdio.h>
#include<math.h>

void main()
{
	int a, b, m, n;
	do {
		printf("nhap vao so a >0: ");
		scanf_s("%d", &a);
		if (a <= 0) {
			printf("Nhap lai!");
		}
	} while (a <= 0);
	do {
		printf("nhap vao so b >0: ");
		scanf_s("%d", &b);
		if (b <= 0) {
			printf("Nhap lai!");
		}
	} while (b <= 0);
	m = a, n = b;
	if (a > b)
	{
		int c = a;
		a = b;
		b = c;
	}
	printf("\ncac boi so cua 5 trong khoang tu %d den %d la ", a, b);
	for (int i = a; i <= b; i++)
	{
		if (i % 5 == 0)
		{
			printf("%d ", i);
		}
	}
	printf("\ncac so nguyen to trong khoang tu %d den %d la ", a, b);
	for (int j = a; j <= b; j++) // 4
	{
		int biendem = 0;
		for (int k = 2; k <= j / 2; k++) // 
		{
			if (j % k == 0) //  
			{
				biendem++; // 1
				break;
			}
		}
		if (biendem == 0)
		{
			printf("%d ", j);
		}
	}
	if (a > 0 || b > 0)
	{
		if (a == b)
		{
			b = a;
		}
		else
		{
			while (a != b)
			{
				a > b ? a -= b : b -= a;
			}
		}
	}
	if (a == 1)
	{
		printf("\n%d va %d la cap so nguyen to cung nhau", m, n);
	}
	int tonguoca = 0, tonguocb = 0;
	for (int i = 1; i <= m; i++) //6 
	{
		if (a % i == 0)
		{
			tonguoca += i;
		}
	}
	for (int i = 1; i <= n; i++) //6 
	{
		if (b % i == 0)
		{
			tonguocb += i;
		}
	}
	if (tonguoca == n || tonguocb == m)
	{
		printf("\nYES");
	}
	else
	{
		printf("\nNO");
	}
}
