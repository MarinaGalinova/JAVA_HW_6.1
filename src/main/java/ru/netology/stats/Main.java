package ru.netology.stats;

import java.util.Arrays;

public class Main {
    //long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public static void main(String[] sales) {
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService servicesum = new StatsService();
        {
            long sum = servicesum.sumSales(allSales);
            System.out.println("Сумма всех продаж за месяц " + sum);
        }

        StatsService serviceAverageSum = new StatsService();
        {
            long sum = serviceAverageSum.averageSales(allSales);
            System.out.println("Средние продажи в месяц " + sum);
        }

        StatsService serviceMaxSales = new StatsService();
        {
            long sum = serviceMaxSales.maxSales(allSales);
            System.out.println("Последний месяц, в котором были максимальные продажи  " + sum);
        }

        StatsService serviceMinSales = new StatsService();
        {
            long sum = serviceMinSales.minSales(allSales);
            System.out.println("Последний месяц, в котором были минимальные продажи  " + sum);
        }

        StatsService serviceLowerAverage = new StatsService();
        {
            long sum = serviceLowerAverage.lowerAverage(allSales);
            System.out.println("Количество месяцев, в которых были продажи ниже среднего  " + sum);
        }

        StatsService serviceUpperAverage = new StatsService();
        {
            long sum = serviceUpperAverage.upperAverage(allSales);
            System.out.println("Количество месяцев, в которых были продажи выше среднего  " + sum);
        }

    }

}