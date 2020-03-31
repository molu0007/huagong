package com.molu.administrator.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Menu2Activity extends AppCompatActivity {

    EditText editText1,editText2,editText3;
    TextView tvResult;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
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
                boolean result= Haple.funtion1(Float.valueOf(editText1.getText().toString()),Float.valueOf(editText2.getText().toString()),Float.valueOf(editText3.getText().toString()));
                if (result){
                    tvResult.setTextColor(Color.parseColor("#000000"));
                    tvResult.setText("通过");
                }else {
                    tvResult.setTextColor(getResources().getColor(R.color.colorAccent));
                    tvResult.setText("不通过");
                }
            }
        });
    }
}
