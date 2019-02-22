package com.LickingHeights;

public class Main {

    public static void main(String[] args) {

        printHelloWorld();
        printHello("Universe");
        System.out.println(multiply(2,4));
        System.out.println(divideDouble(5.25,3.09));
        System.out.println(maxNumber(5,9));
        System.out.println(wordSwitch("Hello","World"));
    }

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static void printHello(String noun){
        System.out.println("Hello "+noun);

    }
    public static int multiply(int firstNumber, int secondNumber){
        int answer = firstNumber*secondNumber;
        return answer;
    }
    public static double divideDouble(double firstNumber, double secondNumber){
        double answer = firstNumber/secondNumber;
        return answer;
    }
    public static double maxNumber(double firstNumber, double secondNumber){
        if(firstNumber>secondNumber){
            return firstNumber;
        }
        else{
            return secondNumber;
        }
    }
    public static String wordSwitch(String firstWord, String secondWord){
        String secondFirst = secondWord+" "+firstWord;
        return secondFirst;
    }
}
