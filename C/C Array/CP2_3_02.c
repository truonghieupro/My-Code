/*Cho một mảng số nguyên gồm n phần tử. Tính trung bình cộng các số chẵn ở vị trí lẻ
Đầu vào: Thực hiện khai báo và khởi tạo giá trị cho mảng số nguyên gồm n phần tử.
Đầu ra: Hiển thị các số chẵn ở vị trí lẻ và tính trung bình cộng các số đó */

#include<stdio.h>
void main()
{
	int n = 6, arr[] = { 1,2,3,4,5,6 };
	int dem = 0, tong = 0;
	printf("cac so chan o vi tri le la: ");
	for (int i = 1; i < n; i += 2)
	{
		if (arr[i] % 2 == 0)
		{
			printf("%d ", arr[i]);
			dem++;
			tong += arr[i];
		}
	}
	printf("\ntrung binh cong cac so la: %.1lf", (tong * 1.0) / dem);
}