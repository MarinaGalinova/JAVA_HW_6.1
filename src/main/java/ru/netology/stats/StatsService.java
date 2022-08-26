package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;

    }

    public long averageSales(long[] sales) {
        long averagesum = 0;
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            month = month + 1;

        }

        long sum = sumSales(sales);
        averagesum = sum / month;
        //сумму всех продаж взять в предыдущем методе
        return averagesum;

    }

    public int maxSales(long[] sales) {  //ищем последний месяц в массиве с максимальными продажами
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1; //+1 потому что в массиве нумерация позиций с нуля, а месяцы с 1
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;

    }
    public long lowerAverage (long[] sales) {
        long averageSales = averageSales(sales);
        int month = 0;

        for (long sale: sales) {
            if (sale < averageSales) {
            month = month + 1;}
        }
        return month;

    }

    public long upperAverage (long[] sales) {
        long averageSales = averageSales(sales);
        int month = 0;

        for (long sale: sales) {
            if (sale > averageSales) {
                month = month + 1;}
        }
        return month;

    }
}

//  //////   Сумму всех продаж
//  //////   Среднюю сумму продаж в месяц
//  /////    Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
//  /////    Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
//        Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
//        Кол-во месяцев, в которых продажи были выше среднего Среднюю сумму продаж в месяц
