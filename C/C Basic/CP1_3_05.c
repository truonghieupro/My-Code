#include<math.h>
#include<stdio.h>

void main()
{
	double a = 0, b = 2, c = 1;
	if (a == 0)
	{
		if (b == 0)
		{
			if (c == 0)
			{
				printf("pt vo so nghiem");
			}
			else
			{
				printf("pt vo nghiem");
			}
		}
		else
		{
			printf("pt co nghiem %.1lf", -c / b);
		}
	}
	else
	{
		double delta = b * b - 4 * a * c;
		if (delta > 0)
		{
			printf("pt co hai nghiem phan biet la %.1lf va %.1lf", (-b + sqrt(delta)) / (2 * a), (-b - sqrt(delta)) / (2 * a));
		}
		else if (delta == 0)
		{
			printf("pt co nghiem kep %.1lf", -b / (2 * a));
		}
		else
			printf("pt vo nghiem");
	}

}