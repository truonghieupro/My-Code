/*Cho một mảng số nguyên gồm n phần tử. Tính tỉ lệ xuất hiện của các phần tử lẻ trong mảng và in những phần tử đó ra.

Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: In ra tỉ lệ xuất hiện của các phần tử lẻ trong mảng (thể hiện bằng dấu % và lấy sau dấu , 2 chữ số)  và hiển thị những phần tử đó trên màn hình*/

#include<stdio.h>
void main()
{
	int n = 7, biendem = 0, arr[] = { 1,2,3,4,5,6,7 };
	for (int i = 0; i < n; i++)
	{
		if (arr[i] % 2 != 0)
		{
			biendem++;
		}
	}
	printf("ti le %d/%d = %.2lf%%", biendem, n, ((1.0 * (biendem * 100)) / n));
}