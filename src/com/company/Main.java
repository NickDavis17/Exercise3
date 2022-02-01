package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double fahrenheit = userInput();
        double celsius = convert(fahrenheit);
        display(celsius);
        while(fahrenheit > -460){
            fahrenheit = userInput();
            celsius = convert(fahrenheit);
            display(celsius);

        }

        System.exit(0);


    }
    static double userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a temperature in Fahrenheit:");
        double fahr = input.nextInt();
        return fahr;

    }
    static double convert(double a){
        double cel = ((a-32)*(5.0/9.0));
        return cel;
    }
    static void display(double a){
        System.out.println("It is " + a + " degrees celsius");
    }

}
