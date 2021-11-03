/*Cho sẵn mảng số nguyên N phần tử. Hãy in tất cả những phần tử ở vị trí chẵn và lẻ trong mảng.

Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Tất cả những phần tử ở vị trí chẵn, tất cả những phần tử ở vị trí lẻ trong mảng theo mẫu:
 Cac phan tu o vi tri chan la: [So o vi tri chan]
 Cac phan tu o vi tri le la: [So o vi tri le]*/
#include<stdio.h>
void main()
{
    int n = 11, arr[] = { 1,2,3,4,5,6,7,8,9,10,11 };

    printf("Cac phan tu o vi tri chan la: [");
    for (int i = 0; i < n; i += 2)
    {
        printf("%d ", arr[i]);
    }
    printf("]");
    printf("\nCac phan tu o vi tri le la: [");
    for (int i = 1; i < n; i += 2)
    {
        printf("%d ", arr[i]);
    }
    printf("]");
}