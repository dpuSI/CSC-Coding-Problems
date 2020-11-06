#include <stdio.h>
#include <stdlib.h>

int x;

void	phase_x		()
{
	char buffer[32];
	int num;
	
	printf ("Your hint is %d\n", x);
	//fflush(stdout);
	scanf("%d", &num);

	int i;
	int a = 1;
	int b = 0;
	int temp;

	for (i = 1; i < x; i++)
	{
		temp = a;
		a = a + b;
		b = temp;
	}
	if (a == num) return;
	printf("BOOM!!\n");
	return;
}

int	main		()
{
	x = (rand()%10) + 1;
	phase_x();
}
