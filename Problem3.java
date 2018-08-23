public class Solution {

    public static void main(String[] args) {
        long n = 1000;
        System.out.println(LPF(n));
        
    }
    
     public static long LPF(long n) {
        long i = 3;

        while (n%2==0) {
            n /= 2;
        }

        if (n==1) {
            return 2;
        }
        
        while (i<=Math.sqrt(n)) {
            if (n%i ==0) {
                n /= i;
                i=3;
            } else {
                i+= 2;
            }
           
        }

        if (n>2) {
            return n;
        }

        return i;
    }
}

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of a given number N?
*/

/*
-While N is even, divide it by two. This tells me that 2 has to be one of the factors. If it's not even, then nothing happens.
-If N ends up becoming 1 after constantly dividing by 2, then that means N was in fact even, and the largest prime facotr is 2
-Now that N can't be divided by 2 anymore, we will try to divide it by a bigger number. Starting with 3 up to the square root of N (incrementing by 2), check if N is divisible bt this number
-If N is divisible by this number, divide N by the number and run loop again starting with 3. We are slowly dividing N by the smallest possible prime numbers
-At the end, if N is still greater than 2, that means N is a prime number. In that case, return N
-Else, we have found our biggest prime factor
*/