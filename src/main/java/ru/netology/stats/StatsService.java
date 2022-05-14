package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {

        int sum = 0;

        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(long[] sales) {

        int averageMouth = 0;

        averageMouth = sumSales(sales) / sales.length;
        return (averageMouth);
    }

    public int minSales(long[] sales) {

        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale < sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {

        int maxMouth = 0;
        int mouth = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMouth]) {
                maxMouth = mouth;
            }
            mouth = mouth + 1;
        }
        return maxMouth + 1;
    }

    public int aboveAverage(long[] sales) {
        int aboveAverageSalesMonth = 0;

        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                aboveAverageSalesMonth += 1;
            }
        }
        return aboveAverageSalesMonth;
    }

    public int underAverage(long[] sales) {
        int underAverageSalesMonth = 0;

        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                underAverageSalesMonth += 1;
            }
        }
        return underAverageSalesMonth;
    }
}
