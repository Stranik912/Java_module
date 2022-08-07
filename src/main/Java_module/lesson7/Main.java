package main.Java_module.lesson7;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(89762233334L, "model1", 121122);
        int[] numbers = new int[] {8787878, 98998};
        phone1.receiveCall("Вася");
        phone1.getNumber(phone1.number);
        phone1.receiveCall("Ваня", 898323233);
        phone1.sendMessage(numbers);

    }
}
