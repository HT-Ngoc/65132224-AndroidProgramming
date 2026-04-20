package thigk2.huynhtuanngoc.application;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class ChucNang2Fragment extends Fragment {

    private RecyclerView rcvThanhPho;
    private ThanhPhoAdapter thanhPhoAdapter;
    private ArrayList<ThanhPho> listThanhPho;

    public ChucNang2Fragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listThanhPho = getDuLieuThanhPho();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewcn2 = inflater.inflate(R.layout.fragment_cn2, container, false);
        rcvThanhPho = viewcn2.findViewById(R.id.rcvThanhPho);
        rcvThanhPho.setLayoutManager(new LinearLayoutManager(getContext()));
        thanhPhoAdapter = new ThanhPhoAdapter(getContext(), listThanhPho);
        rcvThanhPho.setAdapter(thanhPhoAdapter);
        return viewcn2;
    }
    private ArrayList<ThanhPho> getDuLieuThanhPho() {
        ArrayList<ThanhPho> ds = new ArrayList<>();
        ds.add(new ThanhPho("Vũng Tàu", "vt"));
        ds.add(new ThanhPho("TP. Hồ Chí Minh", "hcm"));
        ds.add(new ThanhPho("Đà Nẵng", "vinh"));
        ds.add(new ThanhPho("Nha Trang", "nt"));
        ds.add(new ThanhPho("Hải Phòng", "hp"));
        ds.add(new ThanhPho("Phú Yên", "nphong"));
        ds.add(new ThanhPho("New York", "ny"));
        ds.add(new ThanhPho("Đà Lạt", "muidien"));
        ds.add(new ThanhPho("Cam Ranh", "cr"));
        ds.add(new ThanhPho("Huỳnh Tuấn Ngọc - 65132224", "ganhdadia"));
        return ds;
    }
}