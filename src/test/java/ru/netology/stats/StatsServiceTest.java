package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSum() {

        StatsService servicesum = new StatsService();
        {
            long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

            long expectedSum = 180;
            long actualSum = servicesum.sumSales(allSales);
            Assertions.assertEquals(expectedSum, actualSum);
        }

    }

    @Test
    public void shouldFindAverageSum() {

        StatsService averageSales = new StatsService();
        {
            long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

            long expectedAverageSum = 15;
            long actualAverageSum = averageSales.averageSales(allSales);
            Assertions.assertEquals(expectedAverageSum, actualAverageSum);
        }

    }


    @Test
    public void shouldFindMaxMonth() {

        StatsService maxMonth = new StatsService();
        {
            long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

            long expectedMaxMonth = 8;
            long actualMaxMonth = maxMonth.maxSales(allSales);
            Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
        }

    }

    @Test
    public void shouldFindMinMonth() {

        StatsService minMonth = new StatsService();
        {
            long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

            long expectedMinMonth = 9;
            long actualMinMonth = minMonth.minSales(allSales);
            Assertions.assertEquals(expectedMinMonth, actualMinMonth);
        }

    }

    @Test
    public void shouldFindAmountMonthBelowAverage() {

        StatsService amountMonthBelow = new StatsService();
        {
            long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

            long expectedMonthBelow = 5;
            long actualMonthBelow = amountMonthBelow.lowerAverage(allSales);
            Assertions.assertEquals(expectedMonthBelow, actualMonthBelow);
        }

    }
    @Test
    public void shouldFindAmountMonthAboveAverage() {

        StatsService amountMonthAbove = new StatsService();
        {
            long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

            long expectedMonthAbove = 5;
            long actualMonthAbove = amountMonthAbove.upperAverage(allSales);
            Assertions.assertEquals(expectedMonthAbove, actualMonthAbove);
        }

    }


}
