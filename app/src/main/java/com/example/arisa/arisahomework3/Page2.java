package com.example.arisa.arisahomework3;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Page2 extends Activity {
    private TextView tvTime;
    private TextView tvComputer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        findView();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date curDate = new Date(System.currentTimeMillis()) ; // 獲取當前時間
        String str = formatter.format(curDate);
        tvTime.setText(str);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.activity_page3);

        dialog.setTitle("Custom Dialog");

        Window dialogWindow = dialog.getWindow();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        dialogWindow.setGravity(Gravity.LEFT | Gravity.TOP);

        lp.x = 800; // 新位置X坐标
        lp.y = 800; // 新位置Y坐标
        lp.width = 800; // 宽度
        lp.height = 1000; // 高度
        lp.alpha = 1.0f; // 透明度

        dialogWindow.setAttributes(lp);
        dialog.show();


    }
    //region findView動作(固定)
    private void findView(){
        tvTime = (TextView)findViewById(R.id.tvTime);
        tvComputer = (TextView)findViewById(R.id.tvComputer);
    }
    //endregion
}

