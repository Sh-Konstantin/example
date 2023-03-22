package com.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner scanner = new Scanner (System.in, "cp866");
        String name = scanner.nextLine();

        System.out.println("Hello," + name + "!");
        System.out.print(String.format("Привет, %s!", name));

        scanner.close();
    }
}
