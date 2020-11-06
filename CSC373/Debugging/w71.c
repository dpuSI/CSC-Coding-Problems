#include <stdlib.h>

int function2 () {
	int* a = (int*)malloc(4);
        free(a);
}

int main () {
	int x = 32;
	int y = 7;
	y *= 4;
	if (y > x) {
		function2();
	}
	return 0;
}
