package com.example.calculator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2,textView3,textView4,textView5,
            textView6,textView7, textView8,textView9,textView0,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView0 = findViewById(R.id.zero);
        textView1 = findViewById(R.id.one);
        textView2 = findViewById(R.id.two);
        textView3 = findViewById(R.id.three);
        textView4 = findViewById(R.id.four);
        textView5 = findViewById(R.id.five);
        textView6 = findViewById(R.id.six);
        textView7 = findViewById(R.id.seven);
        textView8 = findViewById(R.id.eight);
        textView9 = findViewById(R.id.nine);

        result = findViewById(R.id.result);
    }
}