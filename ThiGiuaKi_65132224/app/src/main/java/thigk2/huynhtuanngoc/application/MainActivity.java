package thigk2.huynhtuanngoc.application;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import thigk2.huynhtuanngoc.application.ChucNang1Fragment;
import thigk2.huynhtuanngoc.application.ChucNang2Fragment;
import thigk2.huynhtuanngoc.application.ChucNang3Fragment;
import thigk2.huynhtuanngoc.application.ChucNang4Fragment;
import thigk2.huynhtuanngoc.application.R;

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
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.nav_cn1){
                    selectedFragment = new ChucNang1Fragment();
                } else if (itemId == R.id.nav_cn2){
                    selectedFragment = new ChucNang2Fragment();
                } else if (itemId == R.id.nav_cn3){
                    selectedFragment = new ChucNang3Fragment();
                } else if (itemId == R.id.nav_cn4) {
                    selectedFragment = new ChucNang4Fragment();
                }
                if (selectedFragment != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentspace, selectedFragment).commit();
                }
                return true;
            }
        });
    }
}