import java.util.List;

public class TinhToan {
    public int tinhTong(int a, int b) {
        return a + b;
    }

    public int tinhHieu(int a, int b) {
        return a - b;
    }

    public int tinhTich(int a, int b) {
        return a * b;
    }

    public double tinhThuong(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không Chia Cho 0");
        }
        return (double) a / b;
    }
    public static double tinhTrungBinhCong(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty.");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }

    public static int timViTri(List<Integer> numbers, int value) {
        if (numbers == null) {
            throw new IllegalArgumentException("List null.");
        }
        return numbers.indexOf(value);
    }

    public static int tinhTongNSoNguyen(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("list null");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int tinhTongNSoLe(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("List null.");
        }
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}
