package com.bl.day6;
import java.util.Scanner;
public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for PerfectNumber : ");
        long data = sc.nextLong();
        long sum = 0;

        for(int i=1; i<=data/2; i++){
            if(data%i == 0){
                sum = sum + i;
            }
        }

        if(sum == data){
            System.out.println(data + " is perfect number");
        }else {
            System.out.println(data + " not perfect number");
        }
    }
}
