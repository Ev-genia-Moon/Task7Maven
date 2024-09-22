package ru.netology.Task7Maven.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StatsServiceTest {

    @Test
    void shouldSumAllSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;

        //  вызываем целевой метод:
        int sumAllSales = service.sumOffAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, sumAllSales);
    }

    @Test
    void shouldAverageAllSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;

        //  вызываем целевой метод:
        int averageSales = service.averageSalesPerMonth(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, averageSales);
    }

    @Test
    void shouldNumberMonthMaxSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;

        //  вызываем целевой метод:
        int maximumSales = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, maximumSales);
    }

    @Test
    void shouldNumberMonthMinSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;

        //  вызываем целевой метод:
        int minimumSales = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, minimumSales);
    }

    @Test
    void shouldNumberMonthBelowAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;

        //  вызываем целевой метод:
        int averageSales = service.averageSalesPerMonth(sales);
        int numberBelowAverage = service.numberMonthsOfSalesBelowAverage(sales, averageSales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, numberBelowAverage);
    }

    @Test
    void shouldCalculateForincome10000() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;

        //  вызываем целевой метод:
        int averageSales = service.averageSalesPerMonth(sales);
        int numberAboveAverage = service.numberMonthsOfSalesAboveAverage(sales, averageSales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, numberAboveAverage);
    }

}
