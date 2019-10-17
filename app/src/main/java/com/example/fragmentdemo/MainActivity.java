package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name ={"Steve Jobs","Einstine","Bilgates","Elon Mask","Warent Baffet","Jakar barg"};

        RecyclerView recyclerView = findViewById(R.id.recyclerViewId);
        ArrayAdapter adapter = new ArrayAdapter(context,name);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }


//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//        Fragment fragment;
//
//        if(position == 0){
//            fragment = new JobsFragment();
//            getSupportFragmentManager().beginTransaction().replace(R.id.detailsFrag,fragment).commit();
//        }
//        else if(position == 1){
//            fragment = new einstineFragment();
//            getSupportFragmentManager().beginTransaction().replace(R.id.detailsFrag,fragment).commit();
//        }
//    }
}
