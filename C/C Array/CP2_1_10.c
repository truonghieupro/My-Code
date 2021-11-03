/*Cho một mảng số nguyên gồm n phần tử. Hãy tìm phần tử đầu tiên chia hết cho 10. Hãy in số đó và vị trí của nó ra màn hình. Nếu không có thì in ra "Khong co so nao la boi cua 10"

Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Hiển thị phần tử đầu tiên trong mảng chia hết cho 10 và vị tri của số đó. Nếu không có số nào hiển thị "Khong co so nao la boi cua 10"*/
#include<stdio.h>
void main()
{
	int n = 10, arr[] = { 1,2,3,4,20,6,7,8,9,10 };
	for (int i = 0; i < n; i++)
	{
		if (arr[i] % 10 == 0)
		{
			printf("so dau tien trong mang la boi cua 10 la %d o vi tri thu %d", arr[i], i);
			break;
		}
	}
}


