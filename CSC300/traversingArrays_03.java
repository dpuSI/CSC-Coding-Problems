// Polina

/*
Write a function that sums up all of the odd elements in the array.
*/

public static int sumOdd(int [] a) {

int sum=0;

for (int i=0; i<a.length; i++) {

    if (a[i] % 2 !=0) {
        sum += a[i];
        //sum = sum a[i];
    }

}

System.out.println ("The sum of all odd elements in the array is: " + sum);
