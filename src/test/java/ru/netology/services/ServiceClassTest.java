package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceClassTest {

    @Test
    public void TestHoliday() {
        ServiceClass service = new ServiceClass();

        int expected = 3;
        int count = service.calculate(10_000, 3_000,20_000);

        Assertions.assertEquals(expected, count);

    }

    @Test
    public void TestHolidayOne() {
        ServiceClass service = new ServiceClass();

        int expected = 4;
        int count = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, count);
    }

}
