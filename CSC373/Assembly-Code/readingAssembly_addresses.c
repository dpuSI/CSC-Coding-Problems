#include <stdio.h>

int f1 (char* s) {
    int i = 0;
    while (s[i] != '\0') {
        i++;
    }
    return i;
}

void f2 (int x, int* xPtr) {
    *xPtr = x;
}

char* f3 (int* xPtr, char* s) {
    int i = 0;
    for (; i < *xPtr; i++) {
        s[i] = '*';
    }
    return s;
}

int main () {
    char buffer[9];
    printf( "Enter your first name: ");
    gets(buffer);

    int x = f1 (buffer);
    int y = 0;
    int* ptr = &y;
    f2 (x, ptr);
    char str[] = "gladiator";
    char* s = f3 (ptr, str);
    printf("%s\n", s);
}