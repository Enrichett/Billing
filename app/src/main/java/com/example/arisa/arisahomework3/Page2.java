package com.example.arisa.arisahomework3;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Page2 extends Activity {
    private TextView tvTime;
    private TextView tvComputer;

    //region 計算機按鈕宣告

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnD, btn_E, btn_X, btn_P, btn_L, btnF, btnDel, btnPay, btnIn,btnEq;
    private TextView tvSym, tvNum;//全域變數
    private double n1;




    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        findView();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date curDate = new Date(System.currentTimeMillis()); // 獲取當前時間
        String str = formatter.format(curDate);
        tvTime.setText(str);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_page3);

        findView1();
        setListner();


        // dialog.setTitle("Custom Dialog");

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
        dialog.dismiss();


    }

    //region findView動作(固定)P.2
    private void findView() {
        tvTime = (TextView) findViewById(R.id.tvTime);
        tvComputer = (TextView) findViewById(R.id.tvComputer);

    }
    //endregion

    //region findView1動作(計算機)
    private void findView1() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnD = (Button) findViewById(R.id.btnD);
        btnEq = (Button) findViewById(R.id.btnEq);
        btn_E = (Button) findViewById(R.id.btn_E); // 除
        btn_X = (Button) findViewById(R.id.btn_X); // 乘
        btn_P = (Button) findViewById(R.id.btn_P); // 加
        btn_L = (Button) findViewById(R.id.btn_L); // 減
        btnF = (Button) findViewById(R.id.btnF);   // 完成
        btnDel = (Button) findViewById(R.id.btnDel); // 刪除
        btnPay = (Button) findViewById(R.id.btnPay); // 支出
        btnIn = (Button) findViewById(R.id.btnIn);   // 收入
        tvSym = (TextView) findViewById(R.id.tvSym); // 符號顯示
        tvNum = (TextView) findViewById(R.id.tvNum); // 顯示數字
        btnEq = (Button) findViewById(R.id.btnEq);//等於



    }
    //endregion

    //region 點擊事件


    private View.OnClickListener clickListener = new View.OnClickListener() {
        String tmp;

        @Override
        public void onClick(View view) {
            String keyin = tvNum.getText().toString();//區域變數
            //double n2 = Double.parseDouble((num1.getText().toString()));


            switch (view.getId()) {
                case R.id.btn1:
                    if(keyin.equals("0")){
                        tvNum.setText("1");
                    }else {
                        tvNum.setText(keyin+"1");
                    }
                    break;
                case R.id.btn2:
                    if(keyin.equals("0")){
                        tvNum.setText("2");
                    }else {
                        tvNum.setText(keyin+"2");
                    }
                    break;
                case R.id.btn3:
                    if(keyin.equals("0")){
                        tvNum.setText("3");
                    }else {
                        tvNum.setText(keyin+"3");
                    }
                    break;
                case R.id.btn4:
                    if(keyin.equals("0")){
                        tvNum.setText("4");
                    }else {
                        tvNum.setText(keyin+"4");
                    }
                    break;
                case R.id.btn5:
                    if(keyin.equals("0")){
                        tvNum.setText("5");
                    }else {
                        tvNum.setText(keyin+"5");
                    }
                    break;
                case R.id.btn6:
                    if(keyin.equals("0")){
                        tvNum.setText("6");
                    }else {
                        tvNum.setText(keyin+"6");
                    }
                    break;
                case R.id.btn7:
                    if(keyin.equals("0")){
                        tvNum.setText("7");
                    }else {
                        tvNum.setText(keyin+"7");
                    }
                    break;
                case R.id.btn8:
                    if(keyin.equals("0")){
                        tvNum.setText("8");
                    }else {
                        tvNum.setText(keyin+"8");
                    }
                    break;
                case R.id.btn9:
                    if(keyin.equals("0")){
                        tvNum.setText("9");
                    }else {
                        tvNum.setText(keyin+"9");
                    }
                    break;
                case R.id.btn0:
                    if(keyin.equals("0")){
                        tvNum.setText("0");
                    }else {
                        tvNum.setText(keyin+"0");
                    }
                    break;
                case R.id.btnD: //小數點
                    if(keyin.equals("0")){
                        tvNum.setText("0.");
                    }else {
                        tvNum.setText(keyin+".");
                    }
                    break;
                case R.id.btnDel: //清除鍵C
                        tvNum.setText("0");
                    break;
                case R.id.btn_P: //+
                    tvNum.setText("0");
                    tmp = keyin;

                case R.id.btn_L: //-
                    tvNum.setText("0");
                    tmp = keyin;

                case R.id.btn_X: //乘
                    tvNum.setText("0");
                    tmp = keyin;

                case R.id.btn_E: //除
                    tvNum.setText("0");
                    tmp = keyin;

                case R.id.btnEq: //等於

                    //tvNum.setText(tmp + keyin);




            }
        }
    };


    //endregion

    //region 監聽做事囉

    private void setListner(){
        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);
        btn3.setOnClickListener(clickListener);
        btn4.setOnClickListener(clickListener);
        btn5.setOnClickListener(clickListener);
        btn6.setOnClickListener(clickListener);
        btn7.setOnClickListener(clickListener);
        btn8.setOnClickListener(clickListener);
        btn9.setOnClickListener(clickListener);
        btn0.setOnClickListener(clickListener);


    }

    //endregion
}
