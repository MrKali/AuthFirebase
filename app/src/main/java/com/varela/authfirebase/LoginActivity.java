package com.varela.authfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button buttonLogin;
    private EditText editTextEmail, editTextPassword;
    private TextView textViewForgotPassword, textViewCreateNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findVisualElements();
        onEventListener();
    }

    private void findVisualElements(){
        buttonLogin = findViewById(R.id.buttonLogin);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        textViewForgotPassword = findViewById(R.id.textViewForgotPassword);
        textViewCreateNewAccount = findViewById(R.id.textViewCreateNewAccount);
    }

    private void onEventListener(){
        buttonLogin.setOnClickListener(view -> {

        });

        textViewCreateNewAccount.setOnClickListener(view ->
                openActivity(RegisterActivity.class));

        textViewForgotPassword.setOnClickListener(view ->
                openActivity(RecoverPasswordActivity.class));
    }

    private void openActivity(Class activityToOpen){
        Intent intent = new Intent(getApplicationContext(), activityToOpen);
        startActivity(intent);
    }
}
