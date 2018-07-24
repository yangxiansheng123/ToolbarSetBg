package com.retrofit.toolbarsetbg;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Toolbar toolbarImg;
    protected Button button;
    protected Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        /**
         * android4.3以上的沉浸式 ，4.3以下没效果，所以不要头部填充状态栏高度
         */
        int sysVersion = Build.VERSION.SDK_INT;
        if (sysVersion > Build.VERSION_CODES.JELLY_BEAN_MR2) {
            int result = 0;
            int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId > 0) {
                result = getResources().getDimensionPixelSize(resourceId);
            }
            LinearLayout toptop = (LinearLayout) this.findViewById(R.id.toptop);
            RelativeLayout.LayoutParams para = new RelativeLayout.LayoutParams(this.getWindowManager().getDefaultDisplay().getWidth(), result);
            //设置修改后的布局。
            toptop.setLayoutParams(para);
        }
        initView();
    }

    private void initView() {
        toolbarImg = (Toolbar) findViewById(R.id.toolbar_img);
        toolbarImg.setNavigationIcon(R.mipmap.left_back);
        toolbarImg.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            startActivity(new Intent(this, FullScreenActivity.class));
        } else if (view.getId() == R.id.button2) {
            startActivity(new Intent(this, ImmersionActivity.class));

        }
    }
}
