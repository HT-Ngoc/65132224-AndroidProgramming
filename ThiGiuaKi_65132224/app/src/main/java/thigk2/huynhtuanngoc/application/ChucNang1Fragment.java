package thigk2.huynhtuanngoc.application;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChucNang1Fragment extends Fragment {

    // 1. Khai báo các biến tương ứng với ID trong XML
    private EditText edtChieuDai, edtChieuRong, edtChuVi, edtDienTich;
    private Button btnTinh;

    public ChucNang1Fragment() {
    }

    public static ChucNang1Fragment newInstance() {
        return new ChucNang1Fragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewcn1 = inflater.inflate(R.layout.fragment_cn1, container, false);
        edtChieuDai = viewcn1.findViewById(R.id.edtDai);
        edtChieuRong = viewcn1.findViewById(R.id.edtRong);
        edtChuVi = viewcn1.findViewById(R.id.edtCV);
        edtDienTich = viewcn1.findViewById(R.id.edtDT);
        btnTinh = viewcn1.findViewById(R.id.btnTinh);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyTinhToan();
            }
        });

        return viewcn1;
    }

    private void xuLyTinhToan() {
        String strDai = edtChieuDai.getText().toString().trim();
        String strRong = edtChieuRong.getText().toString().trim();
        if (strDai.isEmpty() || strRong.isEmpty()) {
            Toast.makeText(getContext(), "Vui lòng nhập đủ chiều dài và chiều rộng!", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            double dai = Double.parseDouble(strDai);
            double rong = Double.parseDouble(strRong);
            double chuVi = (dai + rong) * 2;
            double dienTich = dai * rong;
            edtChuVi.setText(String.valueOf(chuVi));
            edtDienTich.setText(String.valueOf(dienTich));
            Toast.makeText(getContext(), "Đã tính xong!", Toast.LENGTH_SHORT).show();
        } catch (NumberFormatException e) {
            Toast.makeText(getContext(), "Lỗi định dạng số!", Toast.LENGTH_SHORT).show();
        }
    }
}