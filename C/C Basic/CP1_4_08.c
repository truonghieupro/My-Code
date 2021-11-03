//Cho một số a, hãy in từng chữ số của số đó trên từng dòng, rồi cuối cùng in tổng các chữ số của số đó
#include<stdio.h>
void main()
{
	int a, tong = 0;
	printf("nhap vao mot so: ");
	scanf_s("%d", &a);
	while (a > 0)
	{
		printf("%d\n", a % 10); // 2 4 5
		tong += a % 10; //2+4+5
		a /= 10; //5
	}
	printf("tong la %d", tong);
}