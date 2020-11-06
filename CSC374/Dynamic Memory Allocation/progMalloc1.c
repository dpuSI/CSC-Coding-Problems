/******************************************************************************
 *  @author: David Anderson
 *  Question:
 *  Would this code work?
 *  Solution:
 *  No it would not! Notice you are trying to use a pointer on the heap after
 *  you gave it back. You don't own it after you've given it back to the memory
 *  system.
 ******************************************************************************/
int* pInt = (int*)malloc(sizeof(int)); 
*pInt  = 8; 
free(pInt ); 
(*pInt )++; 
return(EXIT_SUCCESS); 