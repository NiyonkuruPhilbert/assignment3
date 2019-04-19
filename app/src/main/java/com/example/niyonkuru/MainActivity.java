package com.example.niyonkuru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= (EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                if (user.equals("")&&pass.equals("")){
                    Toast.makeText(getApplicationContext(),"please enter user name",Toast.LENGTH_LONG).show();
                }
                else if (user.equals("Admin")&&pass.equals("1234")){
                    Toast.makeText(getApplicationContext(),"login sucessful",Toast.LENGTH_LONG).show();

                    Intent intent=new Intent(MainActivity.this,navigation.class);
                    startActivity(intent);
                }
               else
                   Toast.makeText(getApplicationContext(),"invalid username or password",Toast.LENGTH_LONG).show();
            }

        });
    }
    }

