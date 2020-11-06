/******************************************************************************
 *  @author: David Anderson
 *  Question:
 *  Would this code work?
 *  Solution:
 *  No for the same reason as the last! You are calling free twice so on the
 *  second call you are calling free on a chunk of memory you do not own. 
 ******************************************************************************/
int* pInt = (int*)malloc(sizeof(int)); 
*pInt  = 8; 
free(pInt ); 
free(pInt ); 
return(EXIT_SUCCESS); 