// ve tam giac vuong can *
#include<stdio.h>
void main()
{
    int n, i, j;
    printf("nhap vao mot so: ");
    scanf_s("%d", &n);
    printf("Ve tam giac sao vuong can:\n");
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= i; j++)
        {
            printf("* ");
        }
        printf("\n");
    }
}