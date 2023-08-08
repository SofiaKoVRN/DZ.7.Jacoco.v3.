package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {   // вывести максим значение из массива доходов
        long currentMax = incomes[0]; // текущее Макс значение
        for (long income : incomes) {  // доход и доходы
            if (currentMax < income) { // текущее макс знач меньше дохода
                currentMax = income;  // текущее макс значение равно доходу
            }
        }
        return currentMax;
    }
}