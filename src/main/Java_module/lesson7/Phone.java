package main.Java_module.lesson7;

import java.util.Arrays;

public class Phone {
    long number;
    String model;
    int weight;

    void receiveCall (String callerName) {
        System.out.println( "Звонит " + callerName );
    }

    long getNumber (long number){
        System.out.println( "номер вернулся");
        return number;
    }

     void receiveCall (String callerName, int  number) {
        System.out.println( "Звонит " + callerName );
        System.out.println(number);
    }
    Phone (long number, String model){
        this.number = number;
        this.model = model;
    }
    Phone (long number, String model, int weight){
        this (number, model);
        this.weight = weight;
    }
    Phone () {
    }
    void sendMessage (int... numbers ) {
         System.out.println(Arrays.toString(numbers));
    }
}
