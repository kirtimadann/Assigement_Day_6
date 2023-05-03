package com.bl.day6;
import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit :");
        int N = sc.nextInt();
        int temp = 2;
        int num1 = 0, num2 = 1, num3 = 0;

        System.out.print(num1+" ");
        while(N != temp){
            num3 = num1 + num2;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;
            temp++;
        }
        System.out.println();
    }
    }

