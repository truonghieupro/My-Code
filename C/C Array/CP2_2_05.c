/*Cho một mảng ký tự gồm n phần tử. Tính số lần xuất hiện của ký tự bất kì

Đầu vào: 1 mảng kí tự n phần tử và  1 kí tự bất kì
Đầu ra: Số lần xuất hiện của kí tự đó trong mảng*/
#include<stdio.h>
void main()
{
	int n = 37, dem = 0;
	char arr[] = ".Dua tay day nao, mai ben nhau ban nho.", kitu = ' ';
	printf("nhap mot ki tu: ");
	scanf_s("%c", &kitu);
	for (int i = 0; i < n; i++)
	{
		if (arr[i] == kitu)
		{
			dem++;
		}
	}
	printf("ki tu %c xuat hien %d lan", kitu, dem);
}