#include<stdio.h>
struct Sach
{
	char tieude[100];
	char tacgia[100];
	int  giaban;
	char noidung[100];
};
void Nhap(Sach& s)
{
	char e[100];
	printf("nhap tieu de ");
	gets_s(s.tieude);
	printf("nhap tac gia ");
	gets_s(s.tacgia);
	printf("nhap gia ban ");
	scanf_s("%d", &s.giaban);
	gets_s(e);
	printf("nhap noi dung ");
	gets_s(s.noidung);
}
void Xuat(Sach s)
{
	printf("%s\n%s\n%d\n%s", s.tieude, s.tacgia, s.giaban, s.noidung);
}
void NhapMangSach(Sach a[], int n)
{
	for (int i = 0; i < n; i++)
	{
		Nhap(a[i]);
	}
}
void XuatMangSach(Sach a[], int n, int x)
{
	for (int i = 0; i < n; i++)
	{
		if (a[i].giaban > x) { Xuat(a[i]); }
	}
}
void main()
{
	Sach a[100]; int n = 3, x = 1000;
	NhapMangSach(a, n);
	XuatMangSach(a, n, x);
}