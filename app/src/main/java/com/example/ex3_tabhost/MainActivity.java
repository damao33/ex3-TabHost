package com.example.ex3_tabhost;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    private TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化TabHost
        tabHost = findViewById(R.id.tabHost);
        tabHost.setup();
        //在TabHost创建标签，设置标题、图标、标签页布局
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("要闻",null).setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("热点",null).setContent(R.id.tab2));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("奥运专辑",null).setContent(R.id.tab3));
        //这里设置的tag与布局文件里的id无关，icon为图标（无即为null）,Content是标签页布局
    }

}