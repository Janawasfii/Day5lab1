package com.company;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
//EX1
// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//two numbers , takes two numbers as input
       /* System.out.print("Input first number:");
        int number1=scan.nextInt();
        System.out.print("Input second second number:");
        int number2=scan.nextInt();
        System.out.println(number1 + " + " + number2 + " = " +(number1+number2));
        System.out.println(number1 + " - " + number2 + " = " +(number1-number2));
        System.out.println(number1 + " x " + number2 + " = " +(number1*number2));
        System.out.println(number1 + " / " + number2 + " = " +(number1/number2));
        System.out.println(number1 + " mod " + number2 + " = " +(number1%number2));*/

//EX2
// Write a Java program that takes a number as input and prints its multiplication table up to 10.
// Test Data:
        /*System.out.print("Input a number:");
        int number=scan.nextInt();
        for(int i=1; i<=10;i++){
            int result=0;
            result= i*number;

            System.out.println(number+ " x " + i + " = " +result);;
        }*/
//EX3
// Write a Java program to print the area and perimeter of a circle
         /*System.out.println("Radius:");
         double raduis=scan.nextDouble();
         double  area = Math.PI * raduis * raduis;
         double perimeter = 2 * Math.PI * raduis;
         System.out.println("Perimeter is: "+ perimeter);
         System.out.println("Area is:"+ area);*/


//EX4
//Java program to find out the average of a set of integers
        /*int count, sum = 0;
        double avg;
        System.out.println("Enter the count of numbers: ");
        count = scan.nextInt();
        for (int i = 1; i <= count; i++) {
        System.out.println("Enter an integer: ");
        int number = scan.nextInt();
        sum += number;}
        avg = (double) sum / count;
        System.out.println("The average is:"+avg);*/
//EX5
// Write a Java program that accepts three integers as input, adds the first two integers
//together, and then determines whether the sum is equal to the third integer.
/*int firNum, secNum,thirNum,total;
        System.out.print("Input the first number: ");
        firNum = scan.nextInt();
        System.out.print("Input the second number: ");
        secNum = scan.nextInt();
        System.out.print("Input the third number: ");
        thirNum = scan.nextInt();
        total= firNum+ secNum;
        boolean isEqualtoSum = total == thirNum;
        System.out.println("The result is:" +isEqualtoSum);*/


//EX6
//Write a Java program to reverse a word
       /* System.out.print("Input a word:");
        String word =scan.nextLine();
        String word2=" ";
        for(int i=word.length()-1; i>=0; i--){
            word2= word2+word.charAt(i);
        }System.out.print("Reverse word: "+word2);*/
//EX7
// Java program to check whether the given number is even or odd
       /* System.out.println("Enter a number:");
        int num= scan.nextInt();
        if(num%2==0){
            System.out.println("The number is Even");}
        else{
            System.out.println("The number is Odd");
        }*/
//EX8
// Java program to convert the temperature in Centigrade to Fahrenheit
        /*System.out.println("Enter temperature in Centigrade:");
        double centi= scan.nextDouble();
        double fahr =(centi*9.0/5.0)+32.0;
        System.out.println("Temperature in Fahrenheit is:"+fahr);*/
//EX9
//Write a Java program that takes a string and a number from the user,then prints the
//character in the given index.
        /*System.out.print("Input a string: ");
        String str = scan.nextLine();
        System.out.print("Input a number: ");
        int ind;
        do {
           while (!scan.hasNextInt()) {
           System.out.println("Input a string:");
           scan.next();
            }
           ind = scan.nextInt();
           } while (ind < 0 || ind >= str.length());
           char character = str.charAt(ind);
            System.out.println(character);*/

//EX10
        /*System.out.print("Width:");
        double width = scan.nextDouble();
        System.out.print("Height: ");
        double height = scan.nextDouble();
        double area = height * width;
        double perimeter = 2 * (height + width);
        System.out.printf("Area is: %.2f\n"+ width+"*"+ height, area);
        System.out.printf("Perimeter is: %.2f\n"+"2("+width+"*"+height+")" ,perimeter);*/
//EX11
       /*System.out.print("Input first integer: ");
        int n1 = scan.nextInt();
        System.out.print("Input second integer: ");
        int n2 = scan.nextInt();
        if (n1 != n2) {
            System.out.println(n1 + " != " + n2);
        }
        if (n1 < n2) {
            System.out.println(n1 + " < " + n2);
        } if(n1<=n2) {
            System.out.println(n1 + " <= " + n2);
        }*/
 //EX12
        /*int totalSec;
        do {
        System.out.print("Input seconds: ");
        totalSec = scan.nextInt();
        } while (totalSec <= 0);
        int hours = totalSec / 3600;
        int remSeconds = totalSec % 3600;
        int min = remSeconds / 60;
        int sec = remSeconds % 60;
        System.out.printf("%d:%02d:%02d\n", hours, min, sec);*/

//EX13
        /*int num1, num2, num3, num4;
        System.out.print("Input first number: ");
        num1 = scan.nextInt();
        System.out.print("Input second number: ");
        num2 = scan.nextInt();
        System.out.print("Input third number: ");
        num3 = scan.nextInt();
        System.out.print("Input fourth number: ");
        num4 = scan.nextInt();
        boolean allEqual = (num1 == num2) && (num2 == num3) && (num3 == num4);
        if (allEqual) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal!");
        }*/
//EX14
        /*System.out.println("Input a number:");
        int num = scan.nextInt();
        if (num>0){
            System.out.println("Number is positive");}
        if(num<0)
            { System.out.println("Number is negative");
        }
        else if(num==0){
                System.out.println("Number is zero");}*/
//EX15
       /* int zeroCount= 0;
        int positiveCount= 0;
        int negativeCount= 0;
        do{
            int num = scan.nextInt();
            if(num==-1){
            break;}
            if(num==0){
            zeroCount++;}
            else if (num>0){
            positiveCount++;}
            else if (num<=-2){
            negativeCount++;}}
        while(true);
        System.out.println(positiveCount+" positives");
        System.out.println( zeroCount+" zero");
        System.out.println(negativeCount+ " negatives");*/

//EX16

       /* System.out.print("The input: ");
        int number = scan.nextInt();
        int rev = 0;
        while (number != 0) {
        int digit = number % 10;
        rev = rev * 10 + digit;
        number /= 10;}
        System.out.println("The output: " + rev);*/
//EX17
       /*int number, largest, smallest;
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        largest = number;
        smallest = number;
        int count = 1;
        while (count < number) {
        System.out.print("Enter the number: ");
        int numb = scan.nextInt();
        if (numb < smallest) {
        smallest = numb;}
        if (numb > largest) {
        largest = numb;}
        count++;}
        System.out.println("The large number: " + largest);
        System.out.println("The small number: " + smallest);*/

//EX18
        /*int coun = 0;
        char charT;
        System.out.print("Enter String: ");
        String input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
        charT = input.charAt(i);
        charT = Character.toLowerCase(charT);
        if (charT == 'a') {
        coun++;
        }}System.out.println("Number of a's: " + coun);*/


            }}

     



















