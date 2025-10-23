package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1IfAmountIs999() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 999;

        int actual = cashback.remain(amount);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999IfAmountIs1001() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1001;

        int actual = cashback.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

}