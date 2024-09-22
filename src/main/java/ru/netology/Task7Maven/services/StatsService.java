package ru.netology.Task7Maven.services;

public class StatsService {
    public int sumOffAllSales(int[] sales) {
        int sumSales = 0; // сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i]; // сумма всех продаж среди просмотренных месяцев
        }
        return sumSales;
    }

    public int averageSalesPerMonth(int[] sales) {
        int average = 0; // средняя сумма продаж в месяц

        for (int i = 0; i < sales.length; i++) {
            average = average + sales[i]; // сумма всех продаж среди просмотренных месяцев
        }
        int k = sales.length; // количество месяцев
        average = average / k; // средняя сумма продаж среди всех месяцев
        return average;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int numberMonthsOfSalesBelowAverage(int[] sales, int average) {
        int numberMonth = 0; // количество месяцев с продажами ниже среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) { // значит, в рассматриваемом i-м месяце продаж меньше
                numberMonth = numberMonth + 1; // увеличим количество месяцев на 1
            }
        }

        return numberMonth;

    }

    public int numberMonthsOfSalesAboveAverage(int[] sales, int average) {
        int numberMonth = 0; // количество месяцев с продажами выше среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) { // значит, в рассматриваемом i-м месяце продаж больше
                numberMonth = numberMonth + 1; // увеличим количество месяцев на 1
            }
        }

        return numberMonth;

    }

}
