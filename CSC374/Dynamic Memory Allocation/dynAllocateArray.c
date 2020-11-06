/******************************************************************************
 *  @author: Elona Selenica
 *  Question:
 *  Write a program that allocates a number of bytes. That number should be
 *  set as a macro. Make sure you catch for error
 ******************************************************************************/
#define NUMBER_OF_ELEMENTS 20

int main(){
    int *parr = malloc(NUMBER_OF_ELEMENTS * sizeof(int));

    if (parr == NULL) /* Memory allocation fails */
    {
        printf("Couldn't allocate memory");
    }
    else  /* Memory allocation successful */
    {
        memset(parr, 0, NUMBER_OF_ELEMENTS * sizeof(parr[0]));

        printf("Memory allocation successful");
    }
}
