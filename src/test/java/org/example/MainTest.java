package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    @Test
    void testTriangleArea() {
        Main.Shapes.Triangle triangle = new Main.Shapes.Triangle();
        assertEquals(10.0, triangle.area(4, 5), 0.001);
    }
    @Test
    void testRectangleArea() {
        Main.Shapes.Rectangle rectangle = new Main.Shapes.Rectangle();
        assertEquals(20.0, rectangle.area(4, 5), 0.001);
    }
    @Test
    void testSquareArea() {
        Main.Shapes.Square square = new Main.Shapes.Square();
        assertEquals(16.0, square.area(4), 0.001);
    }
    @Test
    void testRhombusArea() {
        Main.Shapes.Rhombus rhombus = new Main.Shapes.Rhombus();
        assertEquals(24.0, rhombus.area(6, 8), 0.001);
    }
    @Test
    void testCurrencyConverter() {
        Main.CurrencyConverter converter = new Main.CurrencyConverter();
        assertEquals(92.0, converter.convertToEUR(100), 0.001);
        assertEquals(75.0, converter.convertToGBP(100), 0.001);
        assertEquals(13525.0, converter.convertToJPY(100), 0.001);
    }
    @Test
    void testIsPalindrome() {
        Main.StringUtils stringUtils = new Main.StringUtils();
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }
    @Test
    void testCountVowels() {
        Main.StringUtils stringUtils = new Main.StringUtils();
        assertEquals(2, stringUtils.countVowels("hello"));
    }
    @Test
    void testCountConsonants() {
        Main.StringUtils stringUtils = new Main.StringUtils();
        assertEquals(3, stringUtils.countConsonants("hello"));
    }
    @Test
    void testCountWordOccurrences() {
        Main.StringUtils stringUtils = new Main.StringUtils();
        assertEquals(2, stringUtils.countWordOccurrences("hello hello world", "hello"));
    }
    @Test
    void testLengthConverter() {
        Main.LengthConverter lengthConverter = new Main.LengthConverter();
        assertEquals(1000.0, lengthConverter.toMillimeters(1), 0.001);
        assertEquals(100.0, lengthConverter.toCentimeters(1), 0.001);
        assertEquals(10.0, lengthConverter.toDecimeters(1), 0.001);
        assertEquals(0.001, lengthConverter.toKilometers(1), 0.001);
    }
    @Test
    void testWeightConverter() {
        Main.WeightConverter weightConverter = new Main.WeightConverter();
        assertEquals(1000.0, weightConverter.toMilligrams(1), 0.001);
        assertEquals(1.0, weightConverter.toKilograms(1000), 0.001);
        assertEquals(10.0, weightConverter.toCentners(1000), 0.001);
        assertEquals(1.0, weightConverter.toTons(1000), 0.001);
    }
}