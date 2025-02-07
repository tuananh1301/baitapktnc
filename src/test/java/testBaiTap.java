import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testBaiTap {
    baiTap bt = new baiTap();
    @Test
    public void testMultiplication() {
        Assertions.assertEquals(0, bt.multiply(0, 5));
        Assertions.assertEquals(25, bt.multiply(5, 5));
        Assertions.assertEquals(-25, bt.multiply(-5, 5));
        Assertions.assertEquals(0, bt.multiply(0, 0));
        Assertions.assertEquals(100, bt.multiply(10, 10));
        Assertions.assertEquals(-100, bt.multiply(-10, 10));
        Assertions.assertEquals(1, bt.multiply(1, 1));
        Assertions.assertEquals(-1, bt.multiply(-1, 1));
        Assertions.assertEquals(Integer.MAX_VALUE, bt.multiply(1, Integer.MAX_VALUE));
        Assertions.assertEquals(Integer.MIN_VALUE, bt.multiply(-1, Integer.MIN_VALUE));
    }

    @Test
    public void testIsInteger() {
        Assertions.assertTrue(bt.isInteger(5));
        Assertions.assertTrue(bt.isInteger(-5));
        Assertions.assertFalse(bt.isInteger("hello"));
        Assertions.assertFalse(bt.isInteger(5.5));
        Assertions.assertFalse(bt.isInteger(null));
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(2, bt.divide(10, 5));
        Assertions.assertEquals(-2, bt.divide(-10, 5));
        Assertions.assertEquals(0, bt.divide(0, 5));
        Assertions.assertEquals(1, bt.divide(5, 5));
        Assertions.assertEquals(-1, bt.divide(-5, 5));
        Assertions.assertEquals(0, bt.divide(1, 10));
        Assertions.assertEquals(100, bt.divide(1000, 10));
        Assertions.assertEquals(-100, bt.divide(-1000, 10));
        Assertions.assertThrows(ArithmeticException.class, () -> bt.divide(10, 0));
        Assertions.assertThrows(ArithmeticException.class, () -> bt.divide(0, 0));
    }

    @Test
    public void testCalculateAverage() {
        Assertions.assertEquals(3.0, bt.calculateAverage(List.of(1, 2, 3, 4, 5)));
        Assertions.assertEquals(10.0, bt.calculateAverage(List.of(10, 10, 10, 10)));
        Assertions.assertEquals(-3.0, bt.calculateAverage(List.of(-1, -2, -3, -4, -5)));
        Assertions.assertThrows(ArithmeticException.class, () -> bt.calculateAverage(List.of()));
        Assertions.assertThrows(ArithmeticException.class, () -> bt.calculateAverage(null));
    }
}
