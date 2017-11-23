package com.example.vortyz.invitationcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnback = (Button) findViewById(R.id.button2);

        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
                finish();

                //menggunakan intent untuk berpindah ke activity sebelumnya
            }
        });
    }
}
