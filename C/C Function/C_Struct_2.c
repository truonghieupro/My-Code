/*Định nghĩa struct Sach bao gồm:
  - Tiêu đề (mảng ký tự)
  - Tác giả (mảng ký tự)
  - Giá bán (số nguyên)
  - Nội dung (mảng ký tự)
Viết hàm nhập vào và xuất ra một Sach*/
#include<stdio.h>
struct sach
{
	char tieude[50];
	char tacgia[50];
	int giaban;
	char noidung[50];
};
void nhap(sach& s)
{
	char g[2];
	printf("nhap tieu de: ");
	gets_s(s.tieude);
	printf("nhap tac gia: ");
	gets_s(s.tacgia);
	printf("nhap gia ban: ");
	scanf_s("%d", &s.giaban);
	gets_s(g);
	printf("nhap noi dung: ");
	gets_s(s.noidung);
}
void xuat(sach s)
{
	printf("%s\n%s\n%d\n%s", s.tieude, s.tacgia, s.giaban, s.noidung);
}
void main()
{
	sach s;
	nhap(s);
	xuat(s);
}