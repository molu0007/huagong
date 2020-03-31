package com.molu.administrator.demo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewMenu1,textViewMenu2;
    private TextView textViewMenu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("菜单");
        initView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    private void initView() {
        textViewMenu1=findViewById(R.id.tv_menu1);
        textViewMenu2=findViewById(R.id.tv_menu2);
        textViewMenu3=findViewById(R.id.tv_menu3);
        textViewMenu1.setOnClickListener(this);
        textViewMenu2.setOnClickListener(this);
        textViewMenu3.setOnClickListener(this);
    }

    @Override
    public void setTheme(int resid) {
        super.setTheme(resid);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_menu1:
                startActivity(new Intent(this,Menu1Activity.class));
                break;
            case R.id.tv_menu2:
                startActivity(new Intent(this,Menu2Activity.class));
                break;
            case R.id.tv_menu3:
                startActivity(new Intent(this,Menu3Activity.class));
                break;
        }
    }
}
