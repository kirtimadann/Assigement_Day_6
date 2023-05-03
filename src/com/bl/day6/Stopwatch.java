package com.bl.day6;
import java.util.Scanner;
public class Stopwatch {

    static long startWatchValue = 0;
    static long stopWatchValue = 0;
    static long startWatch(){
        startWatchValue = System.currentTimeMillis(); //CPU time (in seconds) since the stopwatch was created
        return startWatchValue;
    }

    static long stopWatch(){
        stopWatchValue = System.currentTimeMillis();
        return stopWatchValue;
    }

    static void calculateDifference(long x, long y){
        System.out.println("---------------------");
        long result = (y-x);
        System.out.println("Time difference : " + result);
        System.out.println("Converting difference value to seconds: "+(result/1000)+" sec");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int count = 0;
        long startTime = 0;
        long endTime = 0;
        while(temp != -1){
            System.out.println("1.START 2.STOP 3.EXIT");
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    count = 1;
                    startTime = startWatch();
                    System.out.println("start->" +startTime);
                    break;
                case 2:
                    if(count == 1){
                        endTime = stopWatch();
                        System.out.println("stop->" +endTime);
                        calculateDifference(startTime,endTime);}
                    else{
                        System.out.println("first start the watch");}
                    break;
                case 3:
                    temp = -1;
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}
