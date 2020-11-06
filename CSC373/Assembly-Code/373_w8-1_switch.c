#include <stdio.h>

int f	(int *iArr, int len)
{
	int i;
	int x;
	for (i=0; i<len; i++)
	{
	x = iArr[i];
	x = x*x;
	  printf("%d ", x);
	}
	printf("\n");
	return len;
}

int f2 (int x, int y)
{
	int a = (y % 4) + 1;
	int temp = 0;
	switch (a)
	{
	  case 1:
		temp =  x + y;
		break;
	  case 2:
		temp =  x - y;
		break;
	  case 3:
		temp =  x * y;
		break;
	  case 4:
		temp =  x / y;
		break;
	}
	return temp; 
}
int	main		()
{
	int x = f2 (18, 7);
	printf ("%d\n", x);
	int Arr[6] = {1, 2, 3, 4, 5, 6};
	f (Arr, 6);
	return;
}
