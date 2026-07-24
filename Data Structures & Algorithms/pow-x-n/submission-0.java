class Solution {



    double fun(double x, int n) {
        if(n==0)
        return 1;

        if(n%2 != 0) {
            return x * fun(x,n-1);
        }

        return fun(x*x,n/2);


    }

    public double myPow(double x, int n) {
        if(n<0)
        x=1/x;
        return fun(x,Math.abs(n));
    }
}
