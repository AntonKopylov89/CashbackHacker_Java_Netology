package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

    public class CashbackHackServiceTest {

        @Test
        public void shouldRemain100() {
            CashbackHackService service = new CashbackHackService();
            int amount = 900;
            int expected = 100;
            int actual = service.remain(amount);

            assertEquals(actual, expected);
        }

        @Test
        public void shouldRemain0() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int expected = 0;
            int actual = service.remain(amount);

            assertEquals(actual, expected);
        }

        @org.junit.jupiter.api.Test
        public void shouldRemain100API() {
            CashbackHackService service = new CashbackHackService();
            int amount = 900;
            int expected = 100;
            int actual = service.remain(amount);

            assertEquals(actual, expected);
        }

        @org.junit.jupiter.api.Test
        public void shouldRemain0API() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int expected = 0;
            int actual = service.remain(amount);

            assertEquals(actual, expected);
        }
    }
