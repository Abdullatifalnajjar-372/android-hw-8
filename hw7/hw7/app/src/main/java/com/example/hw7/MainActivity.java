package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Marvel> mcu = new ArrayList<>();
        Marvel m1 = new Marvel("Deadpool",R.drawable.kfc3,779,88,334);
        Marvel m2 = new Marvel("Ironman",R.drawable.ironman,779,334,557 );
        Marvel m3 = new Marvel("Thor",R.drawable.thor,779,334,557 );
        Marvel m4 = new Marvel("Hulk",R.drawable.hulk,779,779,334 );
        Marvel m5 = new Marvel("Captain America",R.drawable.captain,779,334,557);
        Marvel m6 = new Marvel("Spider MAN",R.drawable.spiderman,779,334,557 );

        mcu.add(m1);
        mcu.add(m2);
        mcu.add(m3);
        mcu.add(m4);
        mcu.add(m5);
        mcu.add(m6);

        RecyclerView rv = findViewById(R.id.recycler);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager mm = new LinearLayoutManager(this);
        rv.setLayoutManager(mm);




        mcuadapter madabt = new mcuadapter(mcu,this);
        rv.setAdapter(madabt);


    }
}
