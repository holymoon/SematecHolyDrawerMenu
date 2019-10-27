package com.example.sematecholydrawermenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> list = new ArrayList<>();
        list.add("PROFILE");
        list.add("DIAL");
        initViews();




                DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);

//To Open:
                drawerLayout.openDrawer(GravityCompat.START);

        RecyclerView recycler = findViewById(R.id.recycler);
        HolyRecyclerAdapter adapter = new HolyRecyclerAdapter(list);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));


    }

    public void initViews() {
           Toolbar tbtoolbarmain = findViewById(R.id.tb_toolbarmain);
            setSupportActionBar(tbtoolbarmain);
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setIcon(R.mipmap.menu);
            getSupportActionBar().setTitle(" ");
            LinearLayout.LayoutParams layoutParams
                    = (LinearLayout.LayoutParams) tbtoolbarmain.getLayoutParams();

            tbtoolbarmain.setLayoutParams(layoutParams);

        }
}


