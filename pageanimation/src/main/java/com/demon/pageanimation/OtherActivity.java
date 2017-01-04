package com.demon.pageanimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.AnimRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * 将页面动画写入代码中
 */

public class OtherActivity extends AppCompatActivity {


    public static void openPage(Activity context){
        Intent intent = new Intent(context,OtherActivity.class);
        context.startActivity(intent);
        //解决进入前一个Activty时出现黑屏的情况 R.anim.activty_stay
        context.overridePendingTransition(R.anim.activity_enter_from_bottom,R.anim.activty_stay);
    }


//    public static void openPage(Activity context ,@Nullable @AnimRes int enterAnimRes){
//        Intent intent = new Intent(context,OtherActivity.class);
//        context.startActivity(intent);
//        if(enterAnimRes==0){
//            //解决进入前一个Activty时出现黑屏的情况 R.anim.activty_stay
//            context.overridePendingTransition(R.anim.activity_enter_from_bottom,R.anim.activty_stay);
//
//        }else{
//            context.overridePendingTransition(R.anim.activity_enter_from_bottom,enterAnimRes);
//        }
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
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
        overridePendingTransition(0,R.anim.activity_exit_to_bottom);
    }

}
