package com.geeks.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.text_view);

        String data = getIntent().getStringExtra("key1");

        textView.setText(data);
        Log.d("Nurbolot", "onCreate SecondActivity");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Nurbolot", "onStart SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Nurbolot", "onResume SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Nurbolot", "onPause SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Nurbolot", "onStop SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Nurbolot", "onDestroy SecondActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Nurbolot", "onRestart SecondActivity");
    }
}