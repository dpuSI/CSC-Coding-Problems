 /******************************************************************************
 *  @author: Geeks for Geeks - used by Elona Selenica
 *  Question:
 *  Upper case each letter in a string you take as an input. Use a char *
 ******************************************************************************/
#include<stdio.h>

void upper_string(char *string)
{
  while(*string)
  {
      if ( *string >= 'a' && *string <= 'z' )
      {
         *string = *string - 32;
      }
      string++;
  }
}

int main()
{
  char string[100];
  printf("Enter a string to convert it into upper case\n");
  gets(string);
  upper_string(string);
  printf("Entered string in upper case is \"%s\"\n", string);
  return 0;
}
