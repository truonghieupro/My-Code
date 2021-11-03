/*Khai báo mảng ký tự gồm n phần tử. Hiển thị dạng đảo ngược của mảng ký tự vừa khai báo

Đầu vào: Một mảng kí tự
Đầu ra: Mảng đảo ngược của mảng kí tự đó*/

#include<stdio.h>
void main()
{
	int arr[] = { 'H','e','l','l','o' };
	for (int i = 4; i >= 0; i--)
	{
		printf("%c ", arr[i]);
	}
}