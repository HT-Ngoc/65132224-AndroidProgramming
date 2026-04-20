package thigk2.huynhtuanngoc.application;

import java.io.Serializable;

public class DuLichNT implements Serializable {
    private String tenDiaDiem;
    private String diaChi;
    private String hinhAnh;
    public DuLichNT(String tenDiaDiem, String diaChi, String hinhAnh) {
        this.tenDiaDiem = tenDiaDiem;
        this.diaChi = diaChi;
        this.hinhAnh = hinhAnh;
    }
    public String getTenDiaDiem() {
        return tenDiaDiem;
    }

    public void setTenDiaDiem(String tenDiaDiem) {
        this.tenDiaDiem = tenDiaDiem;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}