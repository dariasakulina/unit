package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainForAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 700;
        int expected = 300;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainForAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1250;
        int expected = 750;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainForAmountEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainForAmountZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}