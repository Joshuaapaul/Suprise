package com.Surprise;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs{
    public void findPairs(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int arraySize = sc.nextInt();
        System.out.println("Enter the Elements Of Array : ");
        int arr[] = new int[arraySize];
        for(int m=0;m<arraySize;m++){
            arr[m]=sc.nextInt();
        }
        System.out.println("Enter the Number to Divide : ");
        int k = sc.nextInt();


        for(int i=0;i<arraySize;i++){
            for(int j=i+1;j<arraySize;j++){
                if((arr[i]+arr[j])%k==0 && arr[i]<arr[j]){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        new Pairs().findPairs();
    }
}
