package com.LickingHeights;

public class Main {

    public static void main(String[] args) {

        printHelloWorld();
        printHello("Universe");
        multiply(2,4);
        System.out.println(divideDouble(5.25,3.09));
    }

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static void printHello(String noun){
        System.out.println("Hello "+noun);
    }
    public static void multiply(int firstNumber, int secondNumber){
        System.out.println(firstNumber*secondNumber);
    }
    public static double divideDouble(double firstNumber, double secondNumber){
        double answer = firstNumber/secondNumber;
        return answer;
    }
}
