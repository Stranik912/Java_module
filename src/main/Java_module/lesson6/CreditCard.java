package main.Java_module.lesson6;

import java.util.Scanner;

class CreditCard {
    long bankAccount;
    int amountOnAccount;

     int toDeposit() {
        System.out.println( "Введите сумму, которую хотите положить на счет карты");
        Scanner  in = new Scanner(System.in);
        int depositAmount = in.nextInt();
        this.amountOnAccount = amountOnAccount + depositAmount;
        return amountOnAccount;
    }
     int withdraw() {
        System.out.println( "Введите сумму, которую хотите снять с счета карты");
        Scanner  in = new Scanner(System.in);
        int withdrawalAmount = in.nextInt();
        this.amountOnAccount = amountOnAccount - withdrawalAmount;
        return amountOnAccount;
    }
     void checkingAccountBalance() {
        System.out.println( "Сумма на вашем счету " + amountOnAccount);
    }
    CreditCard(long bankAccount, int amountOnAccount) {
        this.bankAccount = bankAccount;
        this.amountOnAccount = amountOnAccount;
    }
}

