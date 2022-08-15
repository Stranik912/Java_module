package main.Java_module.lesson3;

import java.util.Scanner;

public class HomeWorkPart2 {
    public static void main(String[] args) {
        // Задание 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99
        for (int i = 1; i<100; i++ )  {
            if (i % 2 != 0) {
                System.out.print( i + " ");
            }
        }
        System.out.println(" ");

        // Задание 2. При помощи цикла for вывести на экран числа от 15 до 1
        for (int i = 15; i>=1; i-- )  {
            System.out.print( i + " ");
        }
        System.out.println(" ");
        //Задание 3. Напишите программу, где пользователь вводит любое целое положительное число -N. Программа суммирует все числа от 1 до N.
        System.out.println("Введите положительное число ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int total = 0;
        int i = 1;
        if (a > 0) {
            while (i <= a) {
                total = i + total ;
            i++;}
            System.out.println(" Сумма чисел равна " + total);
        } else {
            System.out.println("Введеное число не является положительным");}
        // Задание 4. Напишите программу, которая будет выводить на экран последовательность
        int endtOfSequence = 0;

        while (endtOfSequence < 98) {
            endtOfSequence = 7 + endtOfSequence ;
            System.out.print (" " + endtOfSequence);}
        System.out.println(" ");

        // Задание 5. Вывести 10 первых чисел последовательности 0, -5, -10,-15
        int c = 0;
        int d = 1;
        while (d <= 10) {
            c = c - 5;
            System.out.print(c + " ");
            d++;}
        System.out.println(" ");
        // Задание 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
        int counter = 10;
        int result = 1;
        while (counter <= 20) {
            result = counter * counter ;
            System.out.print( result + " ");
            counter++;}
    }

}