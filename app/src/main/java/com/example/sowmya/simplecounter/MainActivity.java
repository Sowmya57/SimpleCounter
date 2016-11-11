package com.example.sowmya.simplecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {

    TextView TextViewResult;
    int Counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextViewResult= (TextView) findViewById(R.id.textView);


    }

    public void onClickIncrement(View view) {

            Counter=Counter+1;
            TextViewResult.setText("" + Counter);
        }

    public void onClickDecrement(View view) {

        Counter = Counter-1;
        TextViewResult.setText(""+Counter);
    }
}
