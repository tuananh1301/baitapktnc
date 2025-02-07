import java.util.List;

public class baiTap {
    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isInteger(Object input) {
        return input instanceof Integer;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero is not allowed.");
        return a / b;
    }

    public double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("List is empty or null.");
        }
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
