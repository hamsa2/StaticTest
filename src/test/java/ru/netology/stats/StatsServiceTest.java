package ru.netology.stats;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.AssertJUnit.assertEquals;

public class StatsServiceTest {

    @Test
    public void shouldFindDownAverage() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 24, 19, 20, 7, 14, 14, 18};

        long expectedDown = 5;
        long actualDown = service.monthCountLowerAverageSale(month);

        assertEquals(expectedDown, actualDown);

    }

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageSales(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        assertEquals(expected, actual);

    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSalesMonth(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAboveAverage() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 24, 19, 20, 7, 14, 14, 18};

        long expectedDown = 5;
        long actualDown = service.monthCountAboveAverageSale(month);

        assertEquals(expectedDown, actualDown);

    }
}
