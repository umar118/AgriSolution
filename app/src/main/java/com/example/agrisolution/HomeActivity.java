package com.example.agrisolution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void Back_Home(View view){
        TextView textView =findViewById(R.id.back_home);
        startActivity(new Intent(HomeActivity.this,MainActivity.class));
        finish();
    }
}
