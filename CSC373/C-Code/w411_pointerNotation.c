#include <stdio.h>

int main () {
	char textCPtr[5] = {'b','c','d','\n','\0'};
	printf("%c\n", *textCPtr);
	(*textCPtr)++;
	printf("%c\n", *textCPtr);
}
