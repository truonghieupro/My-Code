/*Cho mảng các ký tự c gồm các ký tự Chữ và Số . Hãy phân tích và xây dựng các hàm để chương trình tính tổng các số được hình thành trong mảng.
Đầu vào: Mảng ký tự c
Đầu ra:
Nếu trong mảng c không có ký tự là số thì in ra màn hình nội dung: "Khong co ky tu so trong mang"
Nếu có thì tính tổng các số được hình thành trong mảng trên rồi in ra màn hình*/
#include<stdio.h>
int LaChuSo(char kt) {
	return kt >= '0' && kt <= '9';
}
int GhepSo(int so, char c) {
	return so * 10 + c - '0';
}
int DemKiTu(char a[]) {
	int n = 0;
	for (int i = 0; a[i] != '\0'; i++) {
		n++;
	}
	return n;
}
int TinhTong(char a[]) {
	int tong = 0, n = DemKiTu(a), so = 0;
	for (int i = 0; i <= n; i++) {
		if (LaChuSo(a[i]))
		{
			so = GhepSo(so, a[i]);
		}
		else
		{
			tong += so;
			so = 0;
		}
	}
	return tong;
}
void main()
{
	char a[] = { "1 ab 120 c 3 5 ef 4" };
	printf("Tong Cac So La %d", TinhTong(a));
}