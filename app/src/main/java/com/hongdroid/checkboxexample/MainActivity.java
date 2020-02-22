package com.hongdroid.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox chk_red, chk_blue, chk_green;
    private TextView tv_result;
    private Button btn_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk_red = findViewById(R.id.chk_red);
        chk_blue = findViewById(R.id.chk_blue);
        chk_green = findViewById(R.id.chk_green);
        tv_result = findViewById(R.id.tv_result);
        btn_result = findViewById(R.id.btn_result);

        btn_result.setOnClickListener(new View.OnClickListener() { // 결과 버튼을 클릭했을때 액션
            @Override
            public void onClick(View view) {
                String str_result = ""; // String 값 초기화
                if(chk_red.isChecked()) { // 빨강 체크 박스에 체크가 되어있다면...
                    str_result += chk_red.getText().toString();
                }
                if(chk_blue.isChecked()) { // 파랑 체크 박스에 체크가 되어있다면...
                    str_result += chk_blue.getText().toString();
                }
                if(chk_green.isChecked()) { // 초록 체크 박스에 체크가 되어있다면...
                    str_result += chk_green.getText().toString();
                }
                tv_result.setText(str_result); // 체크박스에 체크되어있던 값을 String으로 텍스트뷰에 출력.
            }
        });

    }
}
