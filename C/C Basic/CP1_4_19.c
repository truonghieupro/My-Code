/*Cho một số nguyên dương N bất kì:
- Hiển thị các số lẻ từ 1 đến N sử dụng vòng lặp for
- Tính tổng S các số lẻ đó, và in kết quả tính được ra ngoài màn hình
- In ra số S đó là số chia hết cho 3 hay không? Nếu có thì in ra kết quả phép chia lấy nguyên. Nếu không thì in ra số S đó trừ 10.*/

#include<stdio.h>
void main()
{
	int n;
	do
	{
		printf("nhap vao mot so >0: ");
		scanf_s("%d", &n);
		if (n <= 0)
		{
			printf("hay nhap lai");
		}
	} while (n <= 0);
	printf("so ban vua nhap la: %d", n);

	printf("\ncac so le tu 1 den %d la: ", n);
	int tongcacsole = 0;
	for (int i = 1; i <= n; i++)
	{
		if (i % 2 != 0)
		{
			printf("%d ", i);
			tongcacsole += i;
		}
	}
	printf("\ntong cac so le la: %d", tongcacsole);
	if (tongcacsole % 3 == 0)
	{
		printf("\n%d", tongcacsole / 3);
	}
	else
	{
		printf("\n%d", tongcacsole - 10);
	}
}
