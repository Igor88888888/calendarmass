package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void minSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMin = 9;
        long actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);

    }

    @Test

    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);


    }

    @Test

    public void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);


    }

    @Test

    public void midSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMid = 15;
        long actualMid = service.midSales(sales);

        Assertions.assertEquals(expectedMid, actualMid);
    }

    @Test

    public void countUpToMidSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedUpToMid = 5;
        long actualUpToMid = service.countUpToMidSales(sales);

        Assertions.assertEquals(expectedUpToMid, actualUpToMid);

    }

    @Test

    public void countDownToMidSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDownToMid = 5;
        long actualDownToMid = service.countDownToMidSales(sales);

        Assertions.assertEquals(expectedDownToMid, actualDownToMid);
    }
}
