import ru.netology.Task7Maven.services.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        System.out.println(Arrays.toString(sales));

        int sumAllSales = service.sumOffAllSales(sales);
        System.out.println("Сумма всех пордаж: " + sumAllSales);

        int averageSales = service.averageSalesPerMonth(sales);
        System.out.println("Средняя сумма продаж в месяц: " + averageSales);

        int maximumSales = service.maxSales(sales);
        System.out.println("Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму: " + maximumSales);

        int minimumSales = service.minSales(sales);
        System.out.println("Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму: " + minimumSales);

        int numberBelowAverage = service.numberMonthsOfSalesBelowAverage(sales, averageSales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + numberBelowAverage);

        int numberAboveAverage = service.numberMonthsOfSalesAboveAverage(sales, averageSales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + numberAboveAverage);

    }
}
