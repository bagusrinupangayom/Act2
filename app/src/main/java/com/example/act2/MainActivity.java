package com.example.act2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText email, passwords;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);

        email = findViewById(R.id.edEmail);

        passwords = findViewById(R.id.edPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                nama = email.getText().toString();

                password = passwords.getText().toString();

                if(email.getText().toString().equals("user@mail.com")&&passwords.getText().toString().equals("123")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LOGIN SUKSES! || email : " + nama + " password : " + password + "", Toast.LENGTH_LONG);
                    t.show();
                }

                else if (!email.getText().toString().equals("user@mail.com")&&passwords.getText().toString().equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            " Email salah! ", Toast.LENGTH_SHORT);
                    t.show();
                }

                else if (!passwords.getText().toString().equals("123")&&email.getText().toString().equals("user@mail.com")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            " Password salah! ", Toast.LENGTH_SHORT);
                    t.show();
                }

                else{
                    Toast.makeText((getApplicationContext()), "Username dan Password Anda salah!",
                            Toast.LENGTH_SHORT).show();
                }

                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: " + nama + " dan Password anda" + password + "", Toast.LENGTH_LONG);

                t.show();


            }
        });
    }}