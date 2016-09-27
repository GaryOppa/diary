package com.example.lenovo.diary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton monthButton;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       monthButton = (ImageButton)findViewById(R.id.monthButton);
        monthButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                goNextPage();
            }
        });
    }

    private void goNextPage(){
        setContentView(R.layout.monthlayout);
        backButton = (ImageButton)findViewById(R.id.backButton);
        backButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                goPrePage();
            }
        });
    }

    private void goPrePage(){
        setContentView(R.layout.activity_main);
        monthButton = (ImageButton)findViewById(R.id.monthButton);
       monthButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                goNextPage();
            }
        });
    }
}
