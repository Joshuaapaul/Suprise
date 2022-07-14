package com.Surprise;

import java.util.Scanner;

public class FibonacciPrime {
    public void findFibonacciPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Fibonacci Prime : ");
        int n = sc.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        int count =0;

        while (count<n){
            n3 = n1+n2;
            int flag=0;
            for(int i=2;i<n3/2;i++){
                if(n3%i ==0){
                    flag=1;
                }
            }
            if(flag==0 && n3>1){
                System.out.println(n3+" ");
                count++;
            }
            n1=n2;
            n2=n3;
        }
        sc.close();
    }

    public static void main(String[] args) {
        new FibonacciPrime().findFibonacciPrime();
    }
}
