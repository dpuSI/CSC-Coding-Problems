#include <stdio.h>
#include <stdlib.h>

int main() 
{ 
  char input[100]; 
  scanf ("%[^\n]%*c", input);
  phase_1(input);
}
int phase_1(char[] input){ 
 if(strcmp(input, "I love SI!") != 0){
    explode_bomb();
  } else {
    printf("%s", "DEFUSED\n");
  }
}

void explode_bomb()
{
  puts("BOOM!!!!!");
  puts("You blew up the bomb.");
  exit(1);
}
