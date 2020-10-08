// Polina

public static int getMin(Stack<Integer> stack){
int min = stack.pop();
         while(!stack.isEmpty()){
             Integer val = stack.pop();
                     if(val<min)
                         min = val;
         }
        return min;
     }
