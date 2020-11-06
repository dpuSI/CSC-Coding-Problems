int f1 (int* a, int len, int toFind) {
    int i = 0;
    for (; i < len; i++) {
        if (a[i] == toFind) {
            return 1;
        }
    }
    return 0;
}

void f2 (char* src, char* dest) {
    int i = 0;
    while (src[i] != '\0') {
        dest[i] = src[i];
        i++;
    }
    dest[i] = '\0';
}
