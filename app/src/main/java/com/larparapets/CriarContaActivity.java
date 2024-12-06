
package com.larparapets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class CriarContaActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button criarContaButton;
    private Button loginButton;
    private Button googleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        criarContaButton = findViewById(R.id.criarContaButton);
        loginButton = findViewById(R.id.loginButton);
        googleButton = findViewById(R.id.googleButton);

        criarContaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CriarContaActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CriarContaActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}