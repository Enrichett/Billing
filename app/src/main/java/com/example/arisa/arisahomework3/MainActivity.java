package com.example.arisa.arisahomework3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {
    private TextView tvDate;
    private Button btnInput;
    private TextView tvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setListner();
        //時間
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd (EEEE)");
        Date curDate = new Date(System.currentTimeMillis()) ; // 獲取當前時間
        String str = formatter.format(curDate);
        tvDate.setText(str);

    }

    //region findView動作(固定)
    private void findView(){
        tvDate = (TextView)findViewById(R.id.tvDate);
        btnInput = (Button)findViewById(R.id.btnInput);
        tvTitle = (TextView)findViewById(R.id.tvTitle);
    }
    //endregion

    //region 按鈕監聽器(?)
    private void setListner(){
        btnInput.setOnClickListener(clickListener);
    }
    //endregion

    //region 點擊事件
    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.btnInput:
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this  , Page2.class);
                    startActivity(intent);
                    break;
            }
        }


    };
    //endregion
}


