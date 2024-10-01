package ru.netology.Task7Maven.services;

import java.util.Arrays;

import static java.lang.Long.sum;

public class StatsService {
    public long sumOffAllSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i]; //сумма всех продаж
        }
        return sumSales;
    }

    public long averageSalesPerMonth(long[] sales) {
        int k = sales.length; // количество месяцев
        long average = sumOffAllSales(sales) / k; // средняя сумма продаж среди всех месяцев
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int numberMonthsOfSalesBelowAverage(long[] sales) {
        int numberMonth = 0; // количество месяцев с продажами ниже среднего
        int k = sales.length; // количество месяцев
        long average = sumOffAllSales(sales) / k; // средняя сумма продаж среди всех месяцев
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) { // значит, в рассматриваемом i-м месяце продаж меньше
                numberMonth = numberMonth + 1; // увеличим количество месяцев на 1
            }
        }
        return numberMonth;
    }

    public int numberMonthsOfSalesAboveAverage(long[] sales) {
        int numberMonth = 0; // количество месяцев с продажами выше среднего
        int k = sales.length; // количество месяцев
        long average = sumOffAllSales(sales) / k; // средняя сумма продаж среди всех месяцев
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) { // значит, в рассматриваемом i-м месяце продаж больше
                numberMonth = numberMonth + 1; // увеличим количество месяцев на 1
            }
        }
        return numberMonth;
    }

}
