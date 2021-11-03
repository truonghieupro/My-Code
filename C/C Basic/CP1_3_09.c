#include<stdio.h>
void main()
{
	int a = 1, b = 2;
	char c = '+';
	scanf_s("%c", &c,1);
	switch (c)
	{
	case '+':
		printf("ket qua la %d", a + b);
		break;
	case '-':
		printf("ket qua la %d", a - b);
		break;
	case '*':
		printf("ket qua la %d", a * b);
		break;
	case '/':
		printf("ket qua la %d", a / b);
		break;
	default:
		printf("ko phai phep tinh toan");
		break;
	}
}