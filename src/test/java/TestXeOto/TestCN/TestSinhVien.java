package TestXeOto.TestCN;

import TestXeOto.Model.SinhVien;
import TestXeOto.Service.ServiceSinhVien;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestSinhVien {
    ServiceSinhVien svService;

    @BeforeEach
    public void setup() {
        svService = new ServiceSinhVien();
    }

    @Test
    public void testAddSinhVien() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A1", "CNTT", "Java");
        svService.addSinhVien(sv);
        Assertions.assertEquals(1, svService.getAll().size());
    }

    @Test
    public void testUpdateSinhVien() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A1", "CNTT", "Java");
        svService.addSinhVien(sv);
        SinhVien svUpdated = new SinhVien(1, "Nguyen Van B", "12A1", "CNTT", "Python");
        svService.updateSinhVien(svUpdated, 1);
        Assertions.assertEquals("Python", svService.getAll().get(0).getMonHoc());
    }

    @Test
    public void testDeleteSinhVien() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A1", "CNTT", "Java");
        svService.addSinhVien(sv);
        svService.deleteSinhVien(1);
        Assertions.assertEquals(0, svService.getAll().size());
    }

    @Test
    public void testSearchSinhVien() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A1", "CNTT", "Java");
        svService.addSinhVien(sv);
        SinhVien found = svService.searchSinhVien(1);
        Assertions.assertNotNull(found);
        Assertions.assertEquals("Nguyen Van A", found.getTenSV());
    }
}
