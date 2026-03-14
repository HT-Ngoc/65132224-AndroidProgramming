package com.example.baith4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai bao doi tuong
    EditText edtSoA;
    EditText edtSoB;
    EditText edtKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void TimDieuKhien(){
        edtSoA = (EditText) findViewById(R.id.edtA);
        edtSoB = (EditText) findViewById(R.id.edtB);
        edtKQ = (EditText) findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
     public void XuLyCong (View view){
        //Code xu ly cong
        //Lay du lieu tu 2 dieu khien
        String soA = edtSoA.getText().toString();
        String soB = edtSoB.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float A = Float.parseFloat(soA);
        float B = Float.parseFloat(soB);
        //Tinh toan
        float Tong = A + B;
        //Hien Ket qua
        EditText edtKQ = (EditText)findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Tong);
        edtKQ.setText(chuoiKQ);
    }

    public void XuLyTru (View view) {
        //Code xu ly tru
        //Lay du lieu tu 2 dieu khien
        String soA = edtSoA.getText().toString();
        String soB = edtSoB.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float A = Float.parseFloat(soA);
        float B = Float.parseFloat(soB);
        //Tinh toan
        float Hieu = A - B;
        //Hien Ket qua
        EditText edtKQ = (EditText) findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Hieu);
        edtKQ.setText(chuoiKQ);
    }

    public void XuLyNhan (View view) {
        //Code xu ly nhan
        //Lay du lieu tu 2 dieu khien
        String soA = edtSoA.getText().toString();
        String soB = edtSoB.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float A = Float.parseFloat(soA);
        float B = Float.parseFloat(soB);
        //Tinh toan
        float Tich = A * B;
        //Hien Ket qua
        EditText edtKQ = (EditText) findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Tich);
        edtKQ.setText(chuoiKQ);
    }

    public void XuLyChia (View view) {
        //Code xu ly chia
        //Lay du lieu tu 2 dieu khien
        String soA = edtSoA.getText().toString();
        String soB = edtSoB.getText().toString();
        //Chuyen du lieu tu chuoi sang so
        float A = Float.parseFloat(soA);
        float B = Float.parseFloat(soB);
        //Tinh toan
        float Thuong = A / B;
        //Hien Ket qua
        EditText edtKQ = (EditText) findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Thuong);
        edtKQ.setText(chuoiKQ);
    }
}