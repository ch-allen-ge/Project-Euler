public class Main {

    public static void main(String[] args) {

        int n = 1000;
        long total = 0;
        long a = 0;
        long b = 0;
        long d = 0;

        a=(n-1)%3;
        a=n-1-a;
        a=a/3;

        b=(n-1)%5;
        b=n-1-b;
        b=b/5;

        d=(n-1)%15;
        d=n-1-d;
        d=d/15;

        total = 3*a*(a+1)/2 + 5*b*(b+1)/2 - 15*d*(d+1)/2;

        System.out.println(total);
    }
}

/*
If we list all the natural numbers below 10 that are multiples 3 of 5 or , we get 3,5,6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below N.
*/

/*
a = numbers divisible by 3, so 3+6+9+12+15+... The mathematical formula for this sum is 3*[n(n+1)]/2. 
Same goes for b and d, which stand for the total of numbers divisible by 5 and 15, respectively.
total = sum3 + sum5 - sum15
*/