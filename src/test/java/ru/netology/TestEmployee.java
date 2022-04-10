package ru.netology;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestEmployee {
    public Employee sut;

    @BeforeEach
    public void init() {
        sut = new Employee(1, "John", "Smith", "USA", 25);
    }

    @Test
    public void testSetCountry() {
        //given
        String country = "Canada", expected = "Canada";
        //when
        sut.setCountry(country);
        String result = sut.country;
        //then
        assertEquals(result, expected);
    }

}
