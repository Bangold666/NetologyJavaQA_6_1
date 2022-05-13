package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test

    public void testSalesSum() {
        StatsService manager = new StatsService();

        long[] sales = {12, 3, 22, 37, 8, 10, 13, 11, 21, 30, 14, 15};

        long actual = manager.sumSales(sales);
        long expected = 196;

        Assertions.assertEquals(expected, actual);
        System.out.println(" Сумма продаж = " + actual);
    }

    @Test

    public void testAverageSales() {
        StatsService manager = new StatsService();

        long[] sales = {12, 3, 22, 37, 8, 10, 13, 11, 21, 30, 14, 15};

        long actual = manager.averageSales(sales);
        long expected = 16;

        Assertions.assertEquals(expected, actual);
        System.out.println(" Среднее арефметическое = " + actual);
    }

    @Test

    public void testMaxSales() {
        StatsService manager = new StatsService();

        long[] sales = {12, 3, 22, 37, 8, 10, 13, 11, 21, 30, 14, 15};

        long actual = manager.maxSales(sales);
        long expected = 4;

        Assertions.assertEquals(expected, actual);
        System.out.println(" Месяц с пиковыми продажами = " + actual);
    }

    @Test

    public void testMinSales() {
        StatsService manager = new StatsService();

        long[] sales = {12, 3, 22, 37, 8, 10, 13, 11, 21, 30, 14, 15};

        long actual = manager.minSales(sales);
        long expected = 2;

        Assertions.assertEquals(expected, actual);
        System.out.println(" Месяц с минимальными продажами = " + actual);
    }

    @Test

    public void testAboveAverageSales() {
        StatsService manager = new StatsService();

        long[] sales = {12, 3, 22, 37, 8, 10, 13, 11, 21, 30, 14, 15};

        long actual = manager.aboveAverage(sales);
        long expected = 4;

        Assertions.assertEquals(expected, actual);
        System.out.println(" Кол-во месяцев с продажами выше среднего  = " + actual);
    }

    @Test

    public void testUnderAverageSales() {
        StatsService manager = new StatsService();

        long[] sales = {12, 3, 22, 37, 8, 10, 13, 11, 21, 30, 14, 15};

        long actual = manager.underAverage(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
        System.out.println(" Кол-во месяцев с продажами ниже среднего  = " + actual);
    }
}
