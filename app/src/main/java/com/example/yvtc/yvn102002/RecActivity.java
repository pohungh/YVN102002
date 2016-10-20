package com.example.yvtc.yvn102002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec);
        Intent it = getIntent();
        String str = it.getStringExtra(Intent.EXTRA_TEXT);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(str);


    }
}
