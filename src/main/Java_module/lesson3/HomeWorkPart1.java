package main.Java_module.lesson3;

import java.util.Scanner;

public class HomeWorkPart1 {
    /*Написать программу для вывода времени года по номеру месяца. Должно быть 2 варианта
   реализации:
    */
    //swich
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        in.close();
        switch (month) {
            case 12, 1, 2:
                System.out.println("Это месяц зимы ");
                break;
            case 3, 4, 5:
                System.out.println("Это месяц весны");
                break;
            case 6, 7, 8:
                System.out.println("Это месяц лета ");
                break;
            case 9, 10, 11:
                System.out.println("Это месяц осени ");
                break;
            default:
                System.out.println("Не является номером месяца");
        }
// if else
        if (month >= 1 && month < 3 || month == 12) {
            System.out.println("Это месяц зимы");
        } else if (month >= 3 && month < 6) {
            System.out.println("Это месяц весны");
        } else if (month >= 6 && month < 9) {
            System.out.println("Это месяц лета");
        } else if (month >= 9 && month < 12) {
            System.out.println("Это месяц весны");
        } else {
            System.out.println("Не является номером месяца");
        }
    /*
Напишите программу, которая будет принимать на вход число (можно задать явно в коде) и на выход будет выводить сообщение о четности числа.
 */
        int num = 5;
        if (num % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
        //Задание 3. Для числа t (температура на улице) вывести:
        int t = 19;
        if (t > 15 ) {
            System.out.println ( "Тепло");
        } else if (t <= 15 && t >-5) {
            System.out.println( "Нормально");
        } else if (t<= -5 ) {
            System.out.println( "Холодно");
        }
        // Задание 4. По введенному номеру определить цвет радуги
        int rainbow = 1;
        switch (rainbow){
            case 1 :
                System.out.println("красный");
                break;
            case 2 :
                System.out.println("оранжевый");
                break;
            case 3 :
                System.out.println("желтый");
                break;
            case 4 :
                System.out.println("зеленый");
                break;
            case 5 :
                System.out.println("голубой");
                break;
            case 6 :
                System.out.println("синий");
                break;
            case 7 :
                System.out.println("фиолетовый");
                break;
            default:
                System.out.println(" не является цветом радуги ");
            }

    }
}

