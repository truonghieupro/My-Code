#include<stdio.h>
void main()
{
	int a = 5, b = 5, c = 5;
	if (a < b + c && b < a + c && c < a + b)
	{
		if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b)
			printf("la tam giac vuong");
		else if (a == b && b == c) // a==b==c ko dc
			printf("la tam giac deu");
		else if (a == b || b == c || c == a)
			printf("la tam giac can");
		else
			printf("la tam giac thuong");
	}
	else
	{
		printf("ko la tam giac ");
	}
}