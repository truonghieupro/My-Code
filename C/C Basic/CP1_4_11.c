// Hãy in tất cả các giờ phút giây trong ngày. Bắt đầu từ 0:0:0 đến 23:59:59.
#include<stdio.h>
void main()
{
	for (int gio = 0; gio <= 23; gio++)
	{
		for (int phut = 0; phut <= 59; phut++)
		{
			for (int giay = 0; giay <= 59; giay++)
			{
				printf("%d:%d:%d\n", gio, phut, giay);
			}
		}
	}
}