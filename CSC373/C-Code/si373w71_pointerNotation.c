int f(int* a, int len) {
    int sum = 0;
    int i = len;
    i--;
    while (i >= 0) {
        sum += *(a+i);
        i--;
    }
    return sum;
}