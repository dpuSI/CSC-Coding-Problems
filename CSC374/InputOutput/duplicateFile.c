/******************************************************************************
 *  @author: Elona Selenica - help from Prof Joe lectures
 *  Question:
 *  Write a program to duplicate a file 
 ******************************************************************************/
#include <stdio.h>
#include <stdlib.h>
int main()
{
 FILE *original,*copy;
 int c;
 original=fopen("random.c","r");
 copy=fopen("random.bak","w");
 if( !original || !copy)
 {
    puts("File error!");
    exit(1);
 }
 while((c=fgetc(original)) != EOF)
    fputc(c,copy);
 puts("File duplicated");
 return(0);
}
