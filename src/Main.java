import java.io.File;
import java.io.IOException;

public class Main {
    static int[] thousand=new int[1000];

    public static void main(String[] args) throws IOException{
        java.io.PrintWriter output=new java.io.PrintWriter(new File("results.txt"));
        int[] list={0,5,10,15,20,25,30,35,40,45,50,55,60,65,70,80,90,100,110,120};
        String[] stringList={"potato","anna","moon","computer","hannah","monday","kayak","monsoon","civic","level",
                "yesterday","elle","quarrel","madam","suspicious","noon","radar","dedicated","garage","stats"};
        int[] test={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        fillThousand();
        long startTime,stopTime,elapsedTime;

        //Recursive factorial
        for (int i:list){
            startTime=System.nanoTime();
            Factorial.factorial(i);
            stopTime=System.nanoTime();
            elapsedTime=stopTime-startTime;
            output.println("Recursive factorial "+i+" Value\nStartTime = " + startTime + " StopTime = " + stopTime
                    + " ElapsedTime = " + elapsedTime+"\n");
        }

       //Nonrecursive factorial
        for (int i:list){
            startTime=System.nanoTime();
            Factorial.nFactorial(i);
            stopTime=System.nanoTime();
            elapsedTime=stopTime-startTime;
            output.println("Non-recursive factorial "+i+" Value\nStartTime = " + startTime + " StopTime = " + stopTime
                    + " ElapsedTime = " + elapsedTime+"\n");
        }


       /* //Recursive fibonacci
        for (int i:list){
            startTime=System.nanoTime();
            System.out.println(Fibonacci.fibonacci(i));
            stopTime=System.nanoTime();
            elapsedTime=stopTime-startTime;
            output.println("Recursive Fibonacci "+i+" Value\nStartTime = " + startTime + " StopTime = " + stopTime
                    + " ElapsedTime = " + elapsedTime);

        }*/


        //Nonrecursive fibonacci
        for (int i:list){
            startTime=System.nanoTime();
            System.out.println(Fibonacci.nFibonacci(i));
            stopTime=System.nanoTime();
            elapsedTime=stopTime-startTime;
            output.println("Non-recursive Fibonacci "+i+" Value\nStartTime = " + startTime + " StopTime = " + stopTime
                    + " ElapsedTime = " + elapsedTime+"\n");

        }


        //Recursive palindrome
        for (String s:stringList){
            startTime=System.nanoTime();
            isPalindrome.isPalindrome(s);
            stopTime=System.nanoTime();
            elapsedTime=stopTime-startTime;
            output.println("Recursive palindrome "+s+" Value\nStartTime = " + startTime + " StopTime = " + stopTime
                    + " ElapsedTime = " + elapsedTime+"\n");
        }


        //Nonrecursive palindrome
        for (String s:stringList){
            startTime=System.nanoTime();
            isPalindrome.nIsPalindrome(s);
            stopTime=System.nanoTime();
            elapsedTime=stopTime-startTime;
            output.println("Non-recursive palindrome "+s+" Value\nStartTime = " + startTime + " StopTime = " + stopTime
                    + " ElapsedTime = " + elapsedTime+"\n");
        }


        //Recursive binary search
        startTime=System.nanoTime();

        BinarySearch.binarySearch(thousand,1200);

        stopTime=System.nanoTime();
        elapsedTime=stopTime-startTime;
        output.println("Recursive binary search\nStartTime = " + startTime + " StopTime = " + stopTime
                + " ElapsedTime = " + elapsedTime+"\n");

        //Nonrecursive binary search
        startTime=System.nanoTime();

        BinarySearch.nBinarySearch(thousand,1200);

        stopTime=System.nanoTime();
        elapsedTime=stopTime-startTime;
        output.println("Non-recursive binary search\nStartTime = " + startTime + " StopTime = " + stopTime
                + " ElapsedTime = " + elapsedTime);


        output.close();

    }

    static public int[] fillThousand(){

        int num=0;

        for(int i=0;i<1000;i++){
            thousand[i]=num;
            num+=3;
        }return thousand;
    }
}
