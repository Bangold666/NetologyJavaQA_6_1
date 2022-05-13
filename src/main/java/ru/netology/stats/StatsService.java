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
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
            averageMouth = sum / sales.length;
        }
        return (averageMouth);
    }

    public int minSales(long[] sales) {

        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale < sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
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
        int averageSales = 0;
        int sum = 0;

        for (long sale : sales) {
            sum += sale;
            averageSales = sum / sales.length;
        }

        for (long sale : sales)
            if (sale > averageSales) {
                aboveAverageSalesMonth += 1;
            }
        return aboveAverageSalesMonth;
    }

    public int underAverage(long[] sales) {
        int underAverageSalesMonth = 0;
        int averageSales = 0;
        int sum = 0;

        for (long sale : sales) {
            sum += sale;
            averageSales = sum / sales.length;
        }

        for (long sale : sales)
            if (sale < averageSales) {
                underAverageSalesMonth += 1;
            }
        return underAverageSalesMonth;
    }
}
