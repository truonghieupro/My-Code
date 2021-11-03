/*Cho mảng 1 chiều n số nguyên được gán giá trị tùy ý. Hãy viết hàm tìm số nguyên tố nhỏ nhất lớn hơn mọi giá trị có trong mảng
Đầu vào: Mảng a gồm n phần tử
Đầu ra: In ra màn hình nội dung: "So nguyen to nho nhat lon hon moi gia tri trong mang la [songuyento]"
Chú ý: Đặt tên hàm theo quy tắc đặt tên. Chia nhỏ bài toán để viết thành các hàm riêng (Hàm kiểm tra số nguyên tố, tìm giá trị lớn nhất.....)*/
#include<stdio.h>
int TimMaxTrongMang(int n, int a[]) {
	int max = a[0];
	for (int i = 0; i < n; i++) {
		if (a[i] > max)	max = a[i];
	} return max;
}
int TimSoNguyenTo(int m) {
	if (m < 2) return 0;
	for (int i = 2; i <= m / 2; i++) {
		if (m % i == 0) return 0;
	} return 1;
}
int TimSoNguyenToNhoNhat(int n, int a[]) {
	for (int i = (TimMaxTrongMang(n, a) + 1); i > 0; i++)
		if (TimSoNguyenTo(i) == 1) return i;
}
void main()
{
	int n = 5, a[] = { 4,7,11,3,23 };
	printf("So Nguyen To Can Tim La %d", TimSoNguyenToNhoNhat(n, a));
}