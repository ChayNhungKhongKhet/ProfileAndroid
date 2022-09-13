package com.phamtantb24.profileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText userName, password;
    Button loginBtn;
    TextView newUser, forgetPass;
    private final ManageUser manageUser = new ManageUser();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mapping();
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = userName.getText().toString();
                String pass = password.getText().toString();
                if (user.equalsIgnoreCase("Tan") && pass.equals("123")){
                    Intent intent = new Intent(Login.this, MainActivity.class);
//                    User userLogin = manageUser.findAndCheckUser(user,pass);
//                    if (userLogin == null)
//                        Toast.makeText(Login.this,"User name or password was wrong !",Toast.LENGTH_LONG).show();
//                    else {
//                        intent.putExtra("user", new User());
                        startActivity(intent);
//                    }
                }
            }
        });
        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Signup.class);
                startActivity(intent);
            }
        });
    }
    private void mapping() {
        userName = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.login);
        newUser = findViewById(R.id.newUser);
        forgetPass= findViewById(R.id.forgetPass);
    }
}