int f1 () {
  int x = 15;
  int y = 12;
  y = y + 4;
  if (y > x) {
    x += x;
  }
  return x;
}

int main () {
  f1();
}
