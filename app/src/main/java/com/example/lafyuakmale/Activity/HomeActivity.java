package com.example.lafyuakmale.Activity;

import android.app.Activity;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.lafyuakmale.Adapter.PopularAdapter;
import com.example.lafyuakmale.R;
import com.example.lafyuakmale.databinding.ActivityHomeBinding;
import com.example.lafyuakmale.databinding.ActivityMainBinding;
import com.example.lafyuakmale.domain.PopularDomain;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityHomeBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        initRecyclerView();

    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items= new ArrayList<>();
        items.add(new PopularDomain("T-shirt black", "item_1", 15, 20, 200, "Baju terbaik yang ada di depok, harus beli pokoknyamah"));
        items.add(new PopularDomain("Smart Watch", "item_2", 2000, 30, 200, "Smartwatch terbaik yang ada di depok, harus beli pokoknyamah"));
        items.add(new PopularDomain("Phone", "item_3", 9000, 50, 700, "Handphone terbaik yang ada di depok, harus beli pokoknyamah"));

        binding.PopularView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.PopularView.setAdapter(new PopularAdapter(items));
    }
}