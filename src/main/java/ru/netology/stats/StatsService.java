
package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        int sum = 0;
        //int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            sum += sale;
        }
        return sum;

    }

    public long averageSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public long maxSalesMonth(long[] sales) {
        int indexOfMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[indexOfMax]) {
                indexOfMax = i;
            }

        }
        return indexOfMax + 1;
    }

    public long minSalesMonth(long[] sales) {
        int indexOfMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin + 1;
    }

    public long monthCountLowerAverageSale(long[] sales) {
        int sum = 0;
        int monthCount = 0;

        for (long sale : sales) {
            sum += sale;
        }
        int averageSum = sum/ sales.length;
        for (long sale : sales) {
            if (sale < averageSum) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public long monthCountAboveAverageSale(long[] sales) {
        int sum = 0;
        int monthCount = 0;

        for (long sale : sales) {
            sum += sale;
        }
        int averageSum = sum/ sales.length;
        for (long sale : sales) {
            if (sale > averageSum) {
                monthCount++;
            }
        }
        return monthCount;
    }


}