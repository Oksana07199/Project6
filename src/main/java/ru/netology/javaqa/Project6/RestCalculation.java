package ru.netology.javaqa.Project6;

public class RestCalculation {
    public int calcRest(int income, int expenses, int threshold) {

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету


        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;

                count++;

            } else {
                money += income;
                money -= expenses;
            }
        }
        return count;
    }
}


