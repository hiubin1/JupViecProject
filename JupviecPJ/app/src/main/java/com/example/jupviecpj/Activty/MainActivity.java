package com.example.jupviecpj.Activty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.jupviecpj.R;

public class MainActivity extends AppCompatActivity {

    EditText medtPhoneLogin, medtPWLogin;
    CheckBox mchkGhiNho;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        medtPhoneLogin = findViewById(R.id.edtPhoneCusLogin);
        medtPWLogin = findViewById(R.id.edtPWLogin);
        mchkGhiNho = findViewById(R.id.chkGhiNho);


    }

    public void btnLogin_onClick(View view) {
        Intent i = new Intent(getApplicationContext(),CustomerActivity.class);
        startActivity(i);
    }

    public void btnPageRegister_onclick(View view) {
        Intent i = new Intent(getApplicationContext(),DangKyActivity.class);
        startActivity(i);
    }
}