import java.math.BigInteger;

public class Fibonacci {

    static public BigInteger fibonacci(int n){
        BigInteger result;
        if (n==0)
            return BigInteger.ZERO;
        else if (n==1)
            return BigInteger.ONE;
        else
            return result=(fibonacci(n-1).add(fibonacci(n-2)));
    }

    static public BigInteger nFibonacci(int n){
        if (n<=1)
            return BigInteger.valueOf(n);
        else {
            BigInteger first=BigInteger.ONE,second=BigInteger.ONE;

            for (int i=2;i<n;i++){
                BigInteger temp=first;
                first=first.add(second);
                second=temp;
            }
            return first;
        }
    }
}
