package com.Surprise;

import java.util.Scanner;

public class Fourte {
    public void FindAnswer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Answer : ");
        int answer = sc.nextInt();
        System.out.println("Enter the Size of Array : ");
        int arraySize = sc.nextInt();
        System.out.println("Enter the Numbers to perform operations : ");
        int arr[] = new int[arraySize];
        for(int m=0;m<arraySize;m++){
            arr[m]=sc.nextInt();
        }

        int[] operators = {'(','+','-','*','%',')'};
    }

    public static void main(String[] args) {

    }
}
