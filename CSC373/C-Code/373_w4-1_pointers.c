#include <stdio.h>

int main () {

//show pointers
char c = 'a';
char *charPtr = &c;

//print both
printf("%c = %c?\n", c, *charPtr);

//what does this change?
*charPtr = '(';
printf("%c = %c?\n", c, *charPtr);

//what about this                    //segmentation fault
//charPtr = 'z';
//printf("%c = %c?\n", c, *charPtr);

//pointers in scanf
int x;

//printf("Put int into x: ");      //segmentation fault
//scanf("%d", x);

printf("\nPut int into &x: ");
scanf("%d", &x);

//printf("\nPut int into *x: ");   //compiler error
//scanf("%d", *x);

int array[4] = {0,2,4,6};

//printf("\nPut int into array[2]: ");  //segmentation fault
//scanf("%d", array[2]);

printf("\nPut int into &array[2]: ");
scanf("%d", &array[2]);

//printf("\nPut int into *array[2]: ");  //compiler error
//scanf("%d", *array[2]);

printf("\nPut int into (array+2) ");
scanf("%d", (array+2));

//printf("\nPut int into *(array+2) ");  //segmentation fault                     
//scanf("%d", *(array+2));

//printf("\nPut int into &(array+2) ");  //compiler error                      
//scanf("%d", &(array+2));
}
