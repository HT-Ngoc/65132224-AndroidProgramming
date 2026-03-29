package com.tuanngoc.baith8_tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Tìm ListView
        ListView lvDSMonAn = findViewById(R.id.lvDSMonAn);

        // Chuẩn bị dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<>();
        dsMonAn.add(new MonAn("Cơm Gà Xối Mỡ",45000,"Cơm Gà Nhà Hàng",R.drawable.com));
        dsMonAn.add(new MonAn("Phở Bò Wagyu",120000,"Phở Từ Con Bò Bên Nhật",R.drawable.pho));
        dsMonAn.add(new MonAn("Nem Chua Rau Má",50000,"Nem Chua Từ Xứ Nhà Thanh",R.drawable.nem));
        dsMonAn.add(new MonAn("Bánh Mì Siu Cay",30000,"Bánh Mì Ram Ram Ram",R.drawable.banhmi));

        // Gán adapter
        MonAnAdapter adapter = new MonAnAdapter(dsMonAn, this);
        lvDSMonAn.setAdapter(adapter);

        // Bắt sự kiện click item
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MonAn monAn = dsMonAn.get(position);

                Toast.makeText(MainActivity.this,
                        monAn.getTenMonAn(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}