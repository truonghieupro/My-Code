﻿/*
Cần có tổng 200000 đồng từ 3 loại giấy bạc 1000 đồng, 2000 đồng, 5000 đồng.
Lập chương trình để tìm ra và đếm tất cả các phương án có thể

Bài tập này thực chất là giải hệ pt:
 x * 1000 + y * 2000 + z * 5000 = 200.000
200 * 1000 = 200000 => x thuộc [0, 200]
100 * 2000 = 200000 => y thuộc [0, 100]
40 * 5000 = 200000 => z thuộc [0, 40]
*/

#include<stdio.h>
void main()
{
	int i, j, k, biendem = 0;
	for (i = 0; i <= 200; i++)
	{
		for (j = 0; j <= 100; j++)
		{
			for (k = 0; k <= 40; k++)
			{
				if (i * 1000 + j * 2000 + k * 5000 == 200000)
				{
					printf("\n%d to 1000(VND) - %d to 2000(VND) - %d to 5000(VND) ", i, j, k);
					biendem++;
				}
			}
		}
	}
	printf("co %d phuong an co the", biendem);
}