package com.example.agrisolution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Profile_Card(View view){
        CardView pro =findViewById(R.id.profile);
        startActivity(new Intent(MainActivity.this,ProfileActivity.class));

    }
}
