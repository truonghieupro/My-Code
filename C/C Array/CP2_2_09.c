/*Cho sẵn mảng số nguyên N phần tử. In ra màn hình những số có toàn chữ số chẵn
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Kiểm tra xem các chữ số trong số đó có phải là số chẵn hay không. Thực hiện in các số đó ra ngoài màn hình*/
#include<stdio.h>
void main()
{
	int n = 6, du = 0, dem = 0, arr[] = { 123,246,345,468,456,567 };
	printf("cac so toan chu so chan la: ");
	for (int i = 0; i < n; i++)
	{
		dem = 0;
		for (int j = arr[i]; j > 0; j /= 10)
		{
			du = j % 10;
			if (du % 2 != 0)
			{
				dem++;
				break;
			}
		}
		if (dem == 0)
		{
			printf(" %d", arr[i]);
		}
	}
}