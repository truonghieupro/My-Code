/*Cho mảng số nguyên a gồm n phần tử. Viết hàm bỏ qua tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử. Kết quả lưu ra một mảng mới rồi in mảng mới ra để kiểm tra
Đầu vào: Mảng a gồm n phần tử
Đầu ra: In ra màn hình mảng b chứa các phần tử không trùng nhau*/
#include<stdio.h>
void Nhap(int a[], int N) {
    int i;
    for (i = 0; i < N; i++) {
        printf("Nhap so thu %d =  ", i);
        scanf_s("%d", &a[i]);
    }
}
void Xuat(int a[], int N) {
    int i;
    for (i = 0; i < N; i++)
        printf("%d ", a[i]);
    printf("\n");
}
void Sapxep(int a[], int N) {
    int i, j, t;
    for (i = 0; i < N - 1; i++)
        for (j = i + 1; j < N; j++)
            if (a[i] > a[j]) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
}
void Xoatrung(int a[], int* N) {
    int i, j, k;
    for (i = 0; i < *N - 1; i++) {
        j = i + 1;
        while (j < *N)
            if (a[i] == a[j]) {
                for (k = j; k < *N - 1; k++) a[k] = a[k + 1];
                *N = *N - 1;
            }
            else j = j + 1;
    }
}
void main() {
    int a[50], N;
    printf("Nhap so phan tu = "); scanf_s("%d", &N);
    Nhap(a, N);
    printf("Mang vua nhap:\n");
    Xuat(a, N);
    Xoatrung(a, &N);
    printf("Mang sau khi xoa phan tu trung nhau:\n");
    Xuat(a, N);
    Sapxep(a, N);
    printf("Mang sau khi sap xep\n");
    Xuat(a, N);
}