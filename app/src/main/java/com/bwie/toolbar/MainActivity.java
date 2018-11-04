package com.bwie.toolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bwie.toolbar.mytoolbarchenjinshi.MyToolBarChenJinShiActivity;
import com.bwie.toolbar.toolbarchenjinshi.ToolBarChenJinShiActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnToolBar;
    private Button mBtnMyToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        mBtnToolBar = findViewById(R.id.btn_toolbar);
        mBtnMyToolBar = findViewById(R.id.btn_mytoolbar);

        //点击事件
        //1 ToolBar实现沉浸式状态栏
        mBtnToolBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ToolBarChenJinShiActivity.class);
                startActivity(intent);
            }
        });

        //2 自定义ToolBar实现沉浸式状态栏
        mBtnMyToolBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyToolBarChenJinShiActivity.class);
                startActivity(intent);
            }
        });

    }
}
