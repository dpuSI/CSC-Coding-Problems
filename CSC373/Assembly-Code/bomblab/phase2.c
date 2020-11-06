#include <stdio.h> 
int main() 
{ 
  int num1;
  int num2;
  int num3;
  scanf("%d", &num1);
  scanf("%d",&num2);
  scanf("%d", &num3);
  phase_2(num1,num2,num3);

}
int phase_2(int num1, int num2, int num3){
  if(num2 != (num1*4))
    explode_bomb();

  if(num3 != (num2*4)){
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
