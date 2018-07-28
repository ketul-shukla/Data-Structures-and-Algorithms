package general;

import java.util.Scanner;

public class Fibonacci {

    public int calculateFibo(int number){
        int a = 0, b = 1, c=0 ;
        for(int i=1; i<number; i++){
            c = a+b;
            a=b;
            b=c;
            System.out.println(i + ":" + c);
        }
        return c;
    }

    public static void main(String[] args){
        Fibonacci fib = new Fibonacci();

        Scanner scan = new Scanner(System.in);
        int dataNumber = scan.nextInt();

        System.out.println(fib.calculateFibo(dataNumber));

    }
}
