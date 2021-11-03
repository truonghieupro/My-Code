#include<stdio.h>
void main()
{
	double diemToan, diemVan, diemAnh, diemtb = 0;
	printf("diemToan: ");
	scanf_s("%lf", &diemToan);
	printf("diemVan: ");
	scanf_s("%lf", &diemVan);
	printf("diemAnh: ");
	scanf_s("%lf", &diemAnh);
	diemtb = (diemToan + diemVan + diemAnh) / 3;
	if (diemtb < 5)
		printf("xep loai TB");
	else if (diemtb >= 5 && diemtb < 6)
		printf("xep loai TB kha");
	else if (diemtb >= 6 && diemtb < 7.5)
		printf("xep loai kha");
	else if (diemtb >= 7.5 && diemtb < 9)
		printf("xep loai kha gioi");
	else if (diemtb >= 9 && diemtb < 10)
		printf("xep loai gioi");
	else
		printf("ko hop le");
}