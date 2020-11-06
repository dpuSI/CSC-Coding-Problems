/**
 * Compare the difference between pass by value vs pass by reference.
 *
 * @author Polina Petrakova
 */
 
// Value
public static void main(String[] args){
  int x = 6;
  f(x);
  print(x); //PRINT 2:
}
public static void f(int y){
  y = 8;
   print(y); //PRINT 1:
}

// Reference
public static void main(String[] args){
  double[] x = {1.5,2.7,3.9};
  f(x);
  print(x[0]); //PRINT 2:
}
public static void f(double[] y){
   y[0] = 0;
   print(y[0]); //PRINT 1:

// Value
public static void main(String[] args){
  Int[] x = {1,2,3};
  f(x[0]);
  print(x[0]); //PRINT 2:
}
public static int f(int y){
   y = 0;
   print(y); //PRINT 1:
