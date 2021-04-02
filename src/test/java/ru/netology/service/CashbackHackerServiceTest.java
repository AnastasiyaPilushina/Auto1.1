package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerServiceTest {

    @Test
    public void shouldReturn100IfAmountLowerThan1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIfAmountGreaterThan1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}

