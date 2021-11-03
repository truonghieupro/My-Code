/*Cho sẵn mảng số nguyên N phần tử. In ra số lần xuất hiện của 1 số bất kì được nhập từ bàn phím.
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: In ra số lần xuất hiện của từng phần tử trong mảng*/
#include<stdio.h>
void main()
{
	int motso = 0, n = 9, dem = 0, arr[] = { 1,2,3,2,3,4,3,4,5 };
	printf("nhap mot so: ");
	scanf_s("%d", &motso);
	for (int i = 0; i < n; i++)
	{
		if (arr[i] == motso)
		{
			dem++;
		}
	}
	printf("so %d xuat hien %d lan", motso, dem);
}