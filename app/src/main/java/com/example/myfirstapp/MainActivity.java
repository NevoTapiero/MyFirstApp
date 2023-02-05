package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private TextView SignInHeader;
private EditText Email;
private EditText PassWord;
private Button SignIn;
private Button SignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SignInHeader = findViewById(R.id.SignInHeader);
        Email = findViewById(R.id.Email);
        PassWord = findViewById(R.id.PassWord);
        SignUp = findViewById(R.id.SignUp);
        SignIn = findViewById(R.id.SignIn);
        SignIn.setOnClickListener(this);
        SignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == SignIn){
            Email.setText(Email.getText().toString());
            PassWord.setText(Email.getText().toString());
        }

        if (view == SignUp){
            Toast.makeText(this, "Signup is under construction", Toast.LENGTH_SHORT).show();
        }

    }
}