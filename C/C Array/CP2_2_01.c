#include<stdio.h>
void main()
{
	int n, arr[100];
	printf("nhap n= ");
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap arr[%d]=", i);
		scanf_s("%d", &arr[i]);
	}
	for (int i = 0; i < n; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			if (arr[i] > arr[j])
			{
				int k = arr[i];
				arr[i] = arr[j];
				arr[j] = k;
			}
		}
	}
	for (int i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
}
