/******************************************************************************
 *  @author: Elona Selenica
 *  Question:
 *  Create a macro to multiply 7+8 and 9+4
 ******************************************************************************/
#include <stdio.h>
#define MULTIPLY(a, b) (a)*(b)
int main()
{
    printf("%d", MULTIPLY(7+8, 9+4));
    return 0;
}
