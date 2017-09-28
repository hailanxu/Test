package com.coolweather.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText)findViewById(R.id.name);
                EditText pwd = (EditText) findViewById(R.id.pwd);

                String nickname = name.getText().toString();
                String password = pwd.getText().toString();

                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                intent.putExtra("nickname",nickname);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });

    }
}
