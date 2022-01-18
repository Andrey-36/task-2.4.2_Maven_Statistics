package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAverageAmount(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int calculateMaxMonthSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculatSalesBelowAverage(int[] sales) {
        int month = 0;
        int averageSales = calculateAverageAmount(sales);
        for (int sale : sales) {
            if (sale < averageSales) month = month + 1;
        }
        return month;
    }

    public int calculateSalesAboveAverage(int[] sales) {
        int month = 0;
        int averageSales = calculateAverageAmount(sales);
        for (int sale : sales) {
            if (sale > averageSales) month++;
        }
        return month;
    }
}
