package com.jia.mddemo;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "LoginActivity";

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

    private String phone;

    private String password;

    private ArrayAdapter<String> arrayAdapter;

    private String[] arr = {"aa", "aab", "aac"};

    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 邮箱
        til_email = (TextInputLayout) findViewById(R.id.til_email);

        // 自动提示输入框
        et_email = (AutoCompleteTextView) findViewById(R.id.et_email);
        // 密码
        til_pwd = (TextInputLayout) findViewById(R.id.til_pwd);
        // 密码输入框
        et_password = (EditText) findViewById(R.id.et_password);
        // 登录按钮
        bt_login = (Button) findViewById(R.id.bt_login);
        bt_login.setOnClickListener(this);
        // 加载中
        pb_login = (ProgressBar) findViewById(R.id.pb_login);

        et_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (i2 != 0) {
                    list.clear();
                    list.add(charSequence + "@qq.com");
                    list.add(charSequence + "@163.com");
                    arrayAdapter = new ArrayAdapter<String>(LoginActivity.this, android.R.layout.simple_list_item_1, list);
                    et_email.setAdapter(arrayAdapter);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:

                login();

                break;
        }
    }

    /**
     * 登录方法
     */
    private void login() {
        phone = et_email.getText().toString();
        password = et_password.getText().toString();

        if (TextUtils.isEmpty(phone)) {
            et_email.setError("手机号为空");
            return;
        }
        if (!checkMobileNumber(et_email.getText().toString())) {
            et_email.setError("手机格式错误");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            et_password.setError("密码为空");
            return;
        }


    }


    /**
     * 验证手机号码
     *
     * @param mobileNumber 要检验的手机号
     * @return true:合法手机号；false:非法手机号
     */
    public boolean checkMobileNumber(String mobileNumber) {
        boolean phoneTag = false;
        if (TextUtils.isEmpty(mobileNumber)) {
            phoneTag = true;
        } else {
            try {
                //第一位是1,第二位可以是34578,后面9位可以是0-9的值
                Pattern regex = Pattern.compile("^[1][34578][0-9]{9}$");
                Matcher matcher = regex.matcher(mobileNumber);
                phoneTag = matcher.matches();
            } catch (Exception e) {
                phoneTag = false;
            }
        }
        return phoneTag;
    }

    /**
     * 判断密码是否符合规范
     *
     * @param mobiles
     * @return
     */
    private boolean checkPasswordOK(String mobiles) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]{6,16}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }
}

