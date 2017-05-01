import java.math.BigInteger;

public class Factorial {

    static public BigInteger factorial(int n){
        BigInteger inputNum=BigInteger.valueOf(n);
        if (n==0)
            return BigInteger.ONE;
        else
            return inputNum.multiply(factorial(n-1));
    }

    static public BigInteger nFactorial(int n){
        BigInteger result=BigInteger.ONE;
        if (n==0)
            return BigInteger.ONE;
        else {
            for (int i=1;i<=n;i++)
                result = result.multiply(new BigInteger(i+""));
            return result;
        }
    }
}
