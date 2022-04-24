package org.techtown.mission6_8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class member extends AppCompatActivity {

    Button memtomenu,memtologin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member);
        memtomenu=(Button) findViewById(R.id.memtomenu);
        memtologin=(Button) findViewById(R.id.memtologin);

        memtomenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(1,new Intent(member.this,mainmenu.class));
                finish();
            }
        });

        memtologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(2,new Intent(member.this,mainmenu.class));
                finish();
            }
        });
    }
}
