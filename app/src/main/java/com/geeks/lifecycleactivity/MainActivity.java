package com.geeks.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Nurbolot", "onCreate MainActivity");

        EditText editText = findViewById(R.id.edit_text);

        findViewById(R.id.button).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            String data = editText.getText().toString();
            intent.putExtra("key1", data);
            startActivity(intent);
            finish();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Nurbolot", "onStart MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Nurbolot", "onResume MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Nurbolot", "onPause MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Nurbolot", "onStop MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Nurbolot", "onDestroy MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Nurbolot", "onRestart MainActivity");
    }
}