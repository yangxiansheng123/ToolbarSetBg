package com.retrofit.toolbarsetbg;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class ImmersionActivity extends BaseActivity {

    protected TextView toolbarTitle;
    protected Toolbar toolbar;
    protected TextView textView;
    protected TextView tvBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immersion);
        initView();
        setToolBarStyle(toolbar, tvBottom, this.getResources().getColor(R.color.background_yellow));

    }

    private void initView() {
        toolbarTitle = (TextView) findViewById(R.id.toolbar_title);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        textView = (TextView) findViewById(R.id.textView);
        tvBottom = (TextView) findViewById(R.id.tv_bottom);
    }
}
