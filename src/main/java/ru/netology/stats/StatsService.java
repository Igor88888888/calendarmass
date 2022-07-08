package ru.netology.stats;

public class StatsService {

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

    public int maxSales(long[] sales) {
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

    public long sumSales(long[] sales) {

        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public long midSales(long[] sales) {

        long midSales = 0;
        long averagePrice = 0;

        for (int i = 0; i < sales.length; i++) {
            midSales = midSales + sales[i];
        }
        return averagePrice = midSales / sales.length;
    }

    public long countUpToMidSales(long[] sales) {

        long monthSales = 0;//продажи в мес
        long averagePrice = 0;//средние продажи в мес
        long upMidMonth = 0;//месяц где  продажи больше среднего

        for (int i = 0; i < sales.length; i++) {
            monthSales = monthSales + sales[i];
            averagePrice = monthSales / sales.length;
        }

        for (long t : sales) {
            if (t > averagePrice) {
                upMidMonth = upMidMonth + 1;
            }

        }
        return upMidMonth;

    }

    public long countDownToMidSales(long[] sales) {

        long monthSales = 0;//продажи в мес
        long averagePrice = 0;//средние продажи в мес
        long downMidMonth = 0;//месяц где  продажи больше среднего

        for (int i = 0; i < sales.length; i++) {
            monthSales = monthSales + sales[i];
            averagePrice = monthSales / sales.length;
        }

        for (long t : sales) {
            if (t < averagePrice) {
                downMidMonth = downMidMonth + 1;
            }

        }
        return downMidMonth;

    }


}

