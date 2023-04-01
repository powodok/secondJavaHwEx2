package org.example;

public class Main {
    public static void main(String[] args) {

        int balance = 145;
        int deposit = 4700;
        int bonus;
        System.out.println("Ваш счет: " + balance + " rub");
        System.out.println("Вы пополнили счет на: " + deposit + " rub");

        if (deposit > 999) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int account = deposit + balance + bonus;
        System.out.println("Ваш бонус: " + bonus + " rub");
        System.out.println("Итоговый счет: " + account + " rub");
    }

}