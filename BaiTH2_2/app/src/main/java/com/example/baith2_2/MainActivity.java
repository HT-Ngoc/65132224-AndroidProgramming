package com.example.baith2_2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Day la bo lang nghe va xu ly su kien click
    public void XuLyCong(View view){
        EditText edtSoA = findViewById(R.id.edtA);
        EditText edtSoB = findViewById(R.id.edtB);
        EditText edtKetQua = findViewById(R.id.edtKQ);
        //Lay du lieu dieu khien cac so A B
        String strA = edtSoA.getText().toString();
        String strB = edtSoB.getText().toString();
        //Chuyen du lieu sang so
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);
        //Tinh tong
        int Tong = soA + soB;
        String strTong = String.valueOf(Tong);
        //Hien ra man hinh
        edtKetQua.setText(strTong);
    }
}