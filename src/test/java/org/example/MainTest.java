package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MainTest {
    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testInvalidIO() {
        Calculator calculator = new Calculator();
        char result = calculator.invalidIO('a', 'b');
        assertEquals('I',result);
    }
}