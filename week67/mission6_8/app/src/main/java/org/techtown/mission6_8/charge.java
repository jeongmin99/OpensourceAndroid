package org.techtown.mission6_8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class charge extends AppCompatActivity {
    Button chartomenu,chartologin;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.charge);
        chartomenu=(Button) findViewById(R.id.chargetomenu);
        chartologin=(Button) findViewById(R.id.chargetologin);

        chartomenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(3,new Intent(charge.this,mainmenu.class));
                finish();
            }
        });

        chartologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(4,new Intent(charge.this,mainmenu.class));
                finish();
            }
        });

    }
}
