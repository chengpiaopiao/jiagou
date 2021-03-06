package com.netease.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.netease.butterknife.annotation.BindView;
import com.netease.butterknife.annotation.OnClick;
import com.netease.butterknife.library.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;

    String text = "ButterKnife";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv)
    public void click(View view) {
        Toast.makeText(this, "click method ->", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.tv)
    public void click1(View view) {
        Toast.makeText(this, "click method ->", Toast.LENGTH_SHORT).show();
    }
}
