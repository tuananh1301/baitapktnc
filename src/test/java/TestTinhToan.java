import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTinhToan {
    TinhToan tt = new TinhToan();
    @Test
    public void testTinhTong() {
        assertEquals(15, tt.tinhTong(10, 5));
        assertEquals(0, tt.tinhTong(-5, 5));
        assertEquals(-15, tt.tinhTong(-10, -5));
        assertEquals(100, tt.tinhTong(50, 50));
        assertEquals(1, tt.tinhTong(0, 1));
    }
    @Test
    public void testTinhHieu() {
        assertEquals(-5, tt.tinhHieu(5, 10));
        assertEquals(-10, tt.tinhHieu(-5, 5));
        assertEquals(-5, tt.tinhHieu(-10, -5));
        assertEquals(0, tt.tinhHieu(50, 50));
        assertEquals(-1, tt.tinhHieu(0, 1));
    }

    @Test
    public void testTinhTich() {
        assertEquals(50, tt.tinhTich(5, 10));
        assertEquals(-25, tt.tinhTich(-5, 5));
        assertEquals(50, tt.tinhTich(-10, -5));
        assertEquals(2500, tt.tinhTich(50, 50));
        assertEquals(0, tt.tinhTich(0, 1));
    }

    @Test
    public void testTinhThuong() {
        assertEquals(0.5, tt.tinhThuong(5, 10));
        assertEquals(-1, tt.tinhThuong(-5, 5));
        assertEquals(2, tt.tinhThuong(-10, -5));
        assertEquals(1, tt.tinhThuong(50, 50));
        assertThrows(ArithmeticException.class, () -> tt.tinhThuong(1, 0));
    }
    @Test
    public void testTinhTrungBinhCong() {
        assertEquals(3.0, tt.tinhTrungBinhCong(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(0.0, tt.tinhTrungBinhCong(Arrays.asList(-1, 1)));
        assertEquals(10.0, tt.tinhTrungBinhCong(Arrays.asList(10, 10, 10)));
        assertThrows(IllegalArgumentException.class, () -> tt.tinhTrungBinhCong(Collections.emptyList()));
    }

    @Test
    public void testTimViTri() {
        assertEquals(2, tt.timViTri(Arrays.asList(1, 2, 3, 4, 5), 3));
        assertEquals(-1, tt.timViTri(Arrays.asList(1, 2, 3, 4, 5), 6));
        assertEquals(0, tt.timViTri(Arrays.asList(10, 20, 30), 10));
    }

    @Test
    public void testTinhTongNSoNguyen() {
        assertEquals(15, tt.tinhTongNSoNguyen(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(-10, tt.tinhTongNSoNguyen(Arrays.asList(-1, -2, -3, -4)));
        assertEquals(0, tt.tinhTongNSoNguyen(Arrays.asList()));
    }

    @Test
    public void testTinhTongNSoLe() {
        assertEquals(9, tt.tinhTongNSoLe(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(-4, tt.tinhTongNSoLe(Arrays.asList(-1, -2, -3, -4)));
        assertEquals(0, tt.tinhTongNSoLe(Arrays.asList(2, 4, 6)));
    }
}
