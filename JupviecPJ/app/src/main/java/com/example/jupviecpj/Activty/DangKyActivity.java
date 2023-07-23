package com.example.jupviecpj.Activty;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.jupviecpj.R;

public class DangKyActivity extends AppCompatActivity {

    EditText medtFNameCusRegister, medtPhoneCusRegister, medtPasswordRegister, medtRePasswordRegister;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        medtFNameCusRegister = findViewById(R.id.edtFNameCusRegister);
        medtPhoneCusRegister = findViewById(R.id.edtPhoneCusRegister);
        medtPasswordRegister = findViewById(R.id.edtPasswordRegister);
        medtRePasswordRegister = findViewById(R.id.edtRePasswordRegister);


    }

    public void btnComplete_onclick(View view) {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }

    public void btnPageLogin_onclick(View view) {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}