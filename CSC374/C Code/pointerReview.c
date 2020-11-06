/******************************************************************************
 *  @author: Elona Selenica - help from Geeks for Geeks
 *  Question: What is printed?
 *  p = 2383619684 (address)
 *  *p = 10
 *  &p = 2383619688 (address)
 *  *&p = 2383619684 (address)   
 ******************************************************************************/
#include <stdio.h>
int main()
{
    int a = 10;
    int *p;
    p = &a;
    printf("p = %u\n", p);
    printf("*p = %d\n", *p);
    printf("&p = %u\n", &p);
    printf("*&p = %u\n", *&p);
    return 0;
}
