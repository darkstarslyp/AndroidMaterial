package com.demon.pageanimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 *  将页面动画写入style中
 *
 * Created by demon on 17/1/4.
 */
public class StyleActivity extends AppCompatActivity {

    public static void openPage(Activity context){
        Intent intent = new Intent(context,StyleActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style);
        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //解决在style 定义的 activityCloseEnterAnimation 无效
        overridePendingTransition(0,R.anim.activity_exit_to_bottom);
    }

}
