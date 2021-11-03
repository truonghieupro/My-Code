/*Cho số nguyên N. Viết hàm tính giai thừa sử dụng đệ quy và hàm không sử dụng đệ quy, so sánh kết quả chạy của 2 hàm
Đầu vào: Số nguyên N
Đầu ra: Kết quả của N!*/
#include<stdio.h>
int TinhGTDeQuy(int n)
{
	if (n == 1) return 1;
	return n * TinhGTDeQuy(n - 1);
}
int TinhGTKoDeQuy(int n)
{
	int gt = 1;
	for (int i = 2; i <= n; i++)
	{
		gt *= i;
	}
	return gt;
}
void main()
{
	int n = 5;
	printf("Dung De Quy %d\n", TinhGTDeQuy(n));
	printf("Ko Dung De Quy %d", TinhGTKoDeQuy(n));
}