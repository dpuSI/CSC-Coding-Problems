#include <stdio.h>

int main()
{
  int num1;
  int num2;
  scanf("%d", &num1);
  scanf("%d", &num2);
  phase_3(num1,num2);
}
int phase_3(int num1, int num2){
  int x;
    if(num1 == 0){
      x = 54;
    }
    else if(num1 == 1){
      x = 702;
    }
    else if(num1 == 2){
      x = 443;
    }
    else if(num1 == 3){
      x = 167;
    }
    else{
      explode_bomb();
    }
    
    if(x != num2){
      explode_bomb();
    }else {
      printf("DEFUSED\n");
    }
}

void explode_bomb()
{
  puts("BOOM!!!!!");
  puts("You blew up the bomb.");
  exit(1);
}
