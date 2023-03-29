package org.example;

public class Main {
    public static void main(String[] args) {

        int balance = 145;
        int deposit = 4700;
        int bonus;
        System.out.println("Ваш счет: " + balance + " rub");
        System.out.println("Вы пополнили счет на: " + deposit + " rub");
        
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп


        if (deposit > 999) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int account = deposit + balance + bonus;
        System.out.println("Ваш бонус: " + bonus + " rub");
        System.out.println("Итоговый счет: " + account + " rub");

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }

}