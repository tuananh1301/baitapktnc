package TestXeOto.Service;

import TestXeOto.Model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class ServiceSinhVien {
    private List<SinhVien> sinhVienList = new ArrayList<>();

    public void addSinhVien(SinhVien sv) {
        sinhVienList.add(sv);
    }

    public void updateSinhVien(SinhVien sv, int maSV) {
        for (SinhVien s : sinhVienList) {
            if (s.getMaSV() == maSV) {
                s.setTenSV(sv.getTenSV());
                s.setLop(sv.getLop());
                s.setKhoaHoc(sv.getKhoaHoc());
                s.setMonHoc(sv.getMonHoc());
            }
        }
    }

    public void deleteSinhVien(int maSV) {
        sinhVienList.removeIf(s -> s.getMaSV() == maSV);
    }

    public SinhVien searchSinhVien(int maSV) {
        return sinhVienList.stream().filter(s -> s.getMaSV() == maSV).findFirst().orElse(null);
    }

    public List<SinhVien> getAll() {
        return sinhVienList;
    }
}
