/**
 * Use a while loop to iterate to the bottom of the stack and find its
 * minimum value using a for loop.
 *
 * @author Mikala Metzger
 *
 * @param stack The stack to iterate through.
 *
 * @return int Minimum of the stack.
 */
public static int getMin (Stack<Integer> stack) {

  if (stack == null) {        // if stack is invalid
    return Integer.MAX_VALUE; // return maximum integer
  }

  int min = stack.pop();  // set minimum to top value of stack

  for(Integer val=stack.pop(); !stack.isEmpty(); val=stack.pop()){ // pop off a value
                                                                   // if stack isn't empty
                                                                   // pop off value
    if(val < min) { // if value less than the minimum
      min = val;    // set new minimum
    }
  }

  return min; // return the minimum
}


/**
 * Use a while loop to iterate to the bottom of the stack and find its
 * minimum value using a while loop.
 *
 * @author Mikala Metzger
 *
 * @param stack The stack to iterate through.
 *
 * @return int Minimum of the stack.
 */
public static int getMin (Stack<Integer> stack) {

  if (stack == null) {        // if stack is invalid
    return Integer.MAX_VALUE; // return maximum integer
  }

  int min = stack.pop();  // set minimum to top value of stack

  while(!stack.isEmpty()){      // if stack isn't empty

    Integer val = stack.pop();  // pop off a value
    if(val < min) { // if value less than the minimum
      min = val;    // set new minimum
    }
  }

  return min; // return the minimum
}
