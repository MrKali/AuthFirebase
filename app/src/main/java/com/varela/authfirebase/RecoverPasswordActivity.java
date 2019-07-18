package com.varela.authfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RecoverPasswordActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private Button buttonRecoverPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover_password);

        findVisualElements();
        onEventsListener();
    }

    private void findVisualElements(){
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonRecoverPassword = findViewById(R.id.buttonRecoverPassword);
    }

    private void onEventsListener(){

    }
}
