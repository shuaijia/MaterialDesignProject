package com.jia.mddemo;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    // 邮箱
    private TextInputLayout til_email;
    // 自动提示输入框
    private AutoCompleteTextView et_email;
    // 密码
    private TextInputLayout til_pwd;
    // 密码输入框
    private EditText et_password;
    // 登录按钮
    private Button bt_login;
    // 加载中
    private ProgressBar pb_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 邮箱
        til_email= (TextInputLayout) findViewById(R.id.til_email);
        // 自动提示输入框
        et_email= (AutoCompleteTextView) findViewById(R.id.et_email);
        // 密码
        til_pwd= (TextInputLayout) findViewById(R.id.til_pwd);
        // 密码输入框
        et_password= (EditText) findViewById(R.id.et_password);
        // 登录按钮
        bt_login= (Button) findViewById(R.id.bt_login);
        // 加载中
        pb_login= (ProgressBar) findViewById(R.id.pb_login);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_login:

                pb_login.setVisibility(View.VISIBLE);
                break;
        }
    }
}

