package thigk2.huynhtuanngoc.application; // Bạn nhớ sửa lại đúng package của mình nhé

import java.io.Serializable;

public class ThanhPho implements Serializable {
    private String tenThanhPho;
    private String hinhAnh;
    public ThanhPho(String tenThanhPho, String hinhAnh) {
        this.tenThanhPho = tenThanhPho;
        this.hinhAnh = hinhAnh;
    }

    // Getter và Setter
    public String getTenThanhPho() {
        return tenThanhPho;
    }

    public void setT(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }
    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}