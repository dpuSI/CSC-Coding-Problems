/******************************************************************************
 *  @author: Elona Selenica
 *  Question:
 *  Write a program in C to add numbers using call by reference.
 ******************************************************************************/
#include <stdio.h>
int addTwoNumbers(int *, int *);
 
int main()
{
   int firstNum, secondNum, sum; 
   printf(" Input the first number : ");
   scanf("%ld", &firstNum);
   printf(" Input the second  number : ");
   scanf("%ld", &sno);   
   sum = addTwoNumbers(&firstNum, &secondNum);
   printf(" The sum of %ld and %ld  is %ld\n\n", firstNum, secondNum, sum);
   return 0;
}
int addTwoNumbers(int *n1, int *n2) 
{
   return *n1 + *n2;
}
