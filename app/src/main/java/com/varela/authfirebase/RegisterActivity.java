package com.varela.authfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {

    private ImageView imageViewProfileImage;
    private EditText editTextName, editTextEmail, editTextPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        findVisualElements();
        onEventsListener();
    }

    private void findVisualElements(){
        imageViewProfileImage = findViewById(R.id.imageViewProfileImage);
        editTextName = findViewById(R.id.edtiTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

    }

    private void onEventsListener(){

    }
}
