package main.Java_module.lesson6;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1L, 0);
        CreditCard card2 = new CreditCard(2L, 0);
        CreditCard card3 = new CreditCard(3L, 150);
        card1.toDeposit();
        card1.checkingAccountBalance();
        card2.toDeposit();
        card2.checkingAccountBalance();
        card3.withdraw();
        card1.checkingAccountBalance();
    }
}
