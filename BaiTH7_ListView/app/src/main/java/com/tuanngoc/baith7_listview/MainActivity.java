package com.tuanngoc.baith7_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsDacSanVN;
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
        //Tạo list
        dsDacSanVN = new ArrayList<String>();
        //Thêm dữ liệu cho list
        dsDacSanVN.add("Kẹo Dừa Bến Tre");
        dsDacSanVN.add("Lẩu Gà Lá É Phú Yên");
        dsDacSanVN.add("Bánh Đúc Lá Dứa Miền Tây");
        dsDacSanVN.add("Bánh Đa Cua Hải Phòng");
        dsDacSanVN.add("Xôi Nếp Nương Điện Biên");
        dsDacSanVN.add("Cơm Cháy Ninh Bình");
        dsDacSanVN.add("Bánh Bèo Huế");

        //B2. Tạo adapter
        ArrayAdapter<String> adapDacSanVN;
        adapDacSanVN = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsDacSanVN);

        //B3. Gắn vào điều khiển hiển thị ListView
        //B3.1 Tìm
        ListView lvDacSan = findViewById(R.id.lvdsdacsan);
        //B3.2 Gắn
        lvDacSan.setAdapter(adapDacSanVN);
        //B3.3 Lắng nghe và xử lí sự kiện user tương tác
        lvDacSan.setOnItemClickListener(BoLangNghevaXL);
    }
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> adapterView,View view, int i, long l){
           String strTenDacSan = dsDacSanVN.get(i);
            Toast.makeText(MainActivity.this,strTenDacSan, Toast.LENGTH_SHORT).show();
        }
    };
}