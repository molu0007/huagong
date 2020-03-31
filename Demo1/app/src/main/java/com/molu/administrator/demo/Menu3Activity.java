package com.molu.administrator.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Menu3Activity extends AppCompatActivity {

    EditText editText1,editText2,editText3;
    TextView tvResult;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);
        initView();
    }

    private void initView() {
        editText1=findViewById(R.id.et_l);
        editText2=findViewById(R.id.et_tsr);
        editText3=findViewById(R.id.et_nir);
        tvResult=findViewById(R.id.tv_result);
        button=findViewById(R.id.bt_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float result= Haple.funtion3(Float.valueOf(editText1.getText().toString()),Float.valueOf(editText2.getText().toString()),Float.valueOf(editText3.getText().toString()));
                tvResult.setTextColor(Color.parseColor("#000000"));
                tvResult.setText("结果："+result);
            }
        });
    }
}
