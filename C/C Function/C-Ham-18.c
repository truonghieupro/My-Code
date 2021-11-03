/*Viết hàm thực hiện các công việc sau:
- Tìm và trả về giá trị nhỏ nhất của ba số nguyên.
- Kiểm tra số nguyên đó có phải một số trong dãy Fibonacci hay không?
- Chuyển số đó từ hệ thập phân sang hệ nhị phân, kết quả nhị phân lưu trong một mảng (Tham khảo bảng mã nhị phân)
- Tìm phần tử xuất hiện nhiều nhất trong mảng vừa tạo.
Đầu vào: Các tham số cần thiết
Đầu ra: Kết quả theo yêu cầu*/

#include<stdio.h>	
#include<math.h>								
int MinBaSoNguyen(int a, int b, int c)
{
	int min = a;
	if (b < min) min = b;
	if (c < min) min = c;
	return min;
}
int Fibo(int n)
{
	if (n == 0 || n == 1) return 1;
	return Fibo(n - 1) + Fibo(n - 2);
}
bool KiemTraFibo(int n)
{
	if (n < 1) return false;
	for (int i = 1; Fibo(i) <= n; i++)
		if (Fibo(i) == n) return true;
	return false;
}
void ChuyenHeSo(int h[], int& n, int so)
{
	int x = so;
	for (int i = 0; pow(2, i - 1) <= so; i++)
	{
		h[i] = x % 2; x /= 2; n = i;
	}
	for (int i = 0; i < n / 2; i++)
	{
		int g = h[i];
		h[i] = h[n - i - 1];
		h[n - i - 1] = g;
	}
}
void XuatMang(int h[], int n)
{
	for (int i = 0; i < n; i++) printf("%d ", h[i]); printf("\n");
}
int TimHienNhieu(int h[], int n)
{
	int dem1 = 0, dem = 0;
	for (int i = 0; i < n; i++)
	{
		if (h[i] == 0) dem++;
		else dem1++;
	}
	if (dem > dem1) return 0;
	else if (dem < dem1) return 1;
	else return -1;
}
void main()
{
	int a = 10, b = 8, c = 15;
	int min = MinBaSoNguyen(a, b, c);
	printf("So be nhat la %d\n", min);
	if (KiemTraFibo(min)) printf("Yes\n");
	else printf("No\n");
	int h[30], n, so = min;
	ChuyenHeSo(h, n, so);
	XuatMang(h, n);
	int ptu = TimHienNhieu(h, n);
	if (ptu == -1) printf("xuat hien nhu nhau");
	else printf("phan tu xuat hien nhieu nhat la %d", ptu);
}


