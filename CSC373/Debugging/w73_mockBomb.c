#include <stdio.h>
#include <stdlib.h>

void explode_bomb() {
  printf("BOOM! Your bomb exploded! :(\n");
  exit(1);
}

void phase_1 (int key, char input) {
  input += 2;
  if (key+'a' != input) {
//    printf("%c\n", key+'a');
    explode_bomb();
  }
  return;
}

void phase_2 (int key, int input1, int input2) {
  int x = 1;
  for (; x < 3; x *= 2) {
    if (key*x != input1 && key*x != input2) {
//      printf("%d\n", key*x);
      explode_bomb();
    }
  }
  return;
}

void phase_3 (int key, char* input, char* s) {
  int i;
  int j = 0;
  int max = key*2;
  for (i=key-1; i < max; i++) {
    if (input[j] != s[i]) {
//      printf("bomd %d: %c, you %d: %c\n",i,  s[i], j, input[j]);
      explode_bomb();
    }
    j++;
  }
  return;
}

int main () {
  int key = 6;
  printf("Your unique number is %d.\n", key);

  printf("Enter the answer for phase_1: ");
  char phaseOneInput;
  scanf("%c", &phaseOneInput);
  phase_1(key, phaseOneInput);
  printf("Successfully completed phase_1\n");

  printf("Enter the answer for phase_2: ");
  int phaseTwoInput1;
  int phaseTwoInput2;
  scanf("%d %d", &phaseTwoInput1, &phaseTwoInput2);
  phase_2(key, phaseTwoInput1, phaseTwoInput2);
  printf("Successfully completed phase_2\n");

  printf("Enter the answer for phase_3: ");
  char phaseThreeInput[64];
  char s[] = "BombLabsMakeStudentsScared";
  scanf("%s", &phaseThreeInput);
  phase_3(key, phaseThreeInput, s);
  printf("Successfully completed phase_3\n");

  exit(0);
}
