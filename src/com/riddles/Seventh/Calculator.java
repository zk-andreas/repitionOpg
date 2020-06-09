package com.riddles.Seventh;

public class Calculator {

    public void runCalc(int a, int b){
        if(a<50 && b<50 && a> 0 && b> 0){
            System.out.printf("Addition: %d+%d=%d%n",a,b,a+b);
            System.out.printf("Subtract: %d-%d=%d%n",a,b,a-b);
            System.out.printf("Multiply: %d*%d=%d%n",a,b,(a*b));
            System.out.printf("Division: %d/%d=%2f%n",a,b,(a/(float)b));
        }
    }
}
