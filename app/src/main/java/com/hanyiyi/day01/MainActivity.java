package com.hanyiyi.day01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 这是原本的程序的MainActivity，是程序的入口

        mTextView = (TextView) findViewById(R.id.tv_show);
        mTextView.setText("我的文字被改变了");

    }
}
