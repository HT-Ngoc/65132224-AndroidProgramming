package thigk2.huynhtuanngoc.application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ThanhPhoAdapter extends RecyclerView.Adapter<ThanhPhoAdapter.ItemThanhPhoHolder> {
    Context context;
    ArrayList<ThanhPho> listData;

    public ThanhPhoAdapter(Context context, ArrayList<ThanhPho> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemThanhPhoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View vItem = inflater.inflate(R.layout.item_thanhpho, parent, false);
        return new ItemThanhPhoHolder(vItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemThanhPhoHolder holder, int position) {
        ThanhPho thanhPhoHienThi = listData.get(position);
        String tenTP = thanhPhoHienThi.getTenThanhPho();
        String tenFileAnh = thanhPhoHienThi.getHinhAnh();
        holder.tvTenTP.setText(tenTP);
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap", packageName);
        holder.ivThanhPho.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class ItemThanhPhoHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvTenTP;
        ImageView ivThanhPho;

        public ItemThanhPhoHolder(@NonNull View itemView) {
            super(itemView);
            // Giữ nguyên ID cũ trong layout item_monan để không phải sửa XML
            tvTenTP = itemView.findViewById(R.id.textViewTenThanhPho);
            ivThanhPho = itemView.findViewById(R.id.imageViewThanhPho);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int viTriDuocClick = getAbsoluteAdapterPosition();
            ThanhPho phanTuDuocClick = listData.get(viTriDuocClick);

            String ten = phanTuDuocClick.getTenThanhPho();
            Toast.makeText(v.getContext(), "Bạn vừa chọn: " + ten, Toast.LENGTH_LONG).show();
        }
    }
}