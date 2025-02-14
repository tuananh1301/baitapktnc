package TestXeOto.TestCN;

import TestXeOto.Model.BaiHat;
import TestXeOto.Service.BaiHatService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BaiHatTest {
    BaiHatService bhService;

    @BeforeEach
    public void setup() {
        bhService = new BaiHatService();
    }

    @Test
    public void testAddBaiHat_Valid() {
        BaiHat bh = new BaiHat("1", "Song A", "Singer A", 180);
        bhService.addBaiHat(bh);
        Assertions.assertEquals(1, bhService.getAll().size());
    }

    @Test
    public void testAddBaiHat_InvalidDoDai() {
        BaiHat bh = new BaiHat("2", "Song B", "Singer B", -10);
        bhService.addBaiHat(bh);
        Assertions.assertEquals(0, bhService.getAll().size());
    }

    @Test
    public void testDeleteBaiHat() {
        BaiHat bh = new BaiHat("3", "Song C", "Singer C", 200);
        bhService.addBaiHat(bh);
        bhService.deleteBaiHat("3");
        Assertions.assertEquals(0, bhService.getAll().size());
    }

    @Test
    public void testDeleteBaiHat_NonExistent() {
        bhService.deleteBaiHat("99");
        Assertions.assertEquals(0, bhService.getAll().size());
    }

    @Test
    public void testAddMultipleBaiHat() {
        bhService.addBaiHat(new BaiHat("4", "Song D", "Singer D", 250));
        bhService.addBaiHat(new BaiHat("5", "Song E", "Singer E", 300));
        Assertions.assertEquals(2, bhService.getAll().size());
    }
}
