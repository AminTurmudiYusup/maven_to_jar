package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert Your Full Name");
        String name=scanner.nextLine();
        System.out.println("Hello "+StringUtils.substringBefore(name," "));
        //1. I create program to insert full name
        //2. and print only first name
        //3. to substring i using Apache stringutils
    }
}
