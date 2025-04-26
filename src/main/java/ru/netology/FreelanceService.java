package ru.netology;

public class FreelanceService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        System.out.println("Начало эмуляции:");
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                // Отдых
                System.out.printf("Месяц %2d. Денег %,d. Буду отдыхать. ", month, money);
                money -= expenses;
                System.out.printf("Потратил -%,d, затем ещё -%,d%n", expenses, money / 3);
                money /= 3;
                count++;
            } else {
                // Работа
                System.out.printf("Месяц %2d. Денег %,d. Придётся работать. ", month, money);
                money += income;
                System.out.printf("Заработал +%,d, потратил -%,d%n", income, expenses);
                money -= expenses;
            }
        }
        System.out.println("Итого месяцев отдыха: " + count);
        System.out.println();

        return count;
    }
}