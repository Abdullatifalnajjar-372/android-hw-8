package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
       Marvel m = (Marvel) b.getSerializable("marvel");

        TextView name = findViewById(R.id.speed);
        TextView speed = findViewById(R.id.speed2);
        TextView strenth = findViewById(R.id.strength);
        ImageView img = findViewById(R.id.imageView2);

        name.setText(m.getName());
        speed.setText(m.getSpeed());
        strenth.setText(m.getStrength());
        img.setImageResource(m.getImage());
    }
}
