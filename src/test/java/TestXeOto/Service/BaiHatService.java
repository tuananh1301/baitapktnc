package TestXeOto.Service;

import TestXeOto.Model.BaiHat;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    private List<BaiHat> baiHatList = new ArrayList<>();

    public void addBaiHat(BaiHat bh) {
        if (bh.getDoDai() > 0) {
            baiHatList.add(bh);
        }
    }

    public void deleteBaiHat(String id) {
        baiHatList.removeIf(bh -> bh.getId().equals(id));
    }

    public List<BaiHat> getAll() {
        return baiHatList;
    }
}
