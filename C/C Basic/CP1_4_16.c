//Viết chương trình lặp lại nhiều lần công việc nhập một số và in ra mã ASCII của số đó, khi nào nhập số 0 thì dừng
#include<stdio.h>
void main()
{
    int a;
    do
    {
        printf("nhap vao mot so: \n");
        scanf_s("%d", &a);
        printf("%c\n", (char)a);
    } while (a != 0);
}