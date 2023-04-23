package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ServiceClassTest {

    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    @CsvFileSource(files="src/test/resources/data.csv")
    public void TestHoliday(int expected, int income, int expenses, int threshold) {
        ServiceClass service = new ServiceClass();

        //int expected = 3;
        int count = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, count);

    }

//    @Test
//    public void TestHolidayOne() {
//        ServiceClass service = new ServiceClass();
//
//        int expected = 4;
//        int count = service.calculate(10_000, 3_000, 20_000);
//
//        Assertions.assertEquals(expected, count);
//    }
//
}
