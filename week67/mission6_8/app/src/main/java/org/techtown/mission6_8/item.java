package org.techtown.mission6_8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class item extends AppCompatActivity {

    Button itemtomenu,itemtologin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);
        itemtomenu=(Button) findViewById(R.id.itemtomenu);
        itemtologin=(Button) findViewById(R.id.itemtologin);

        itemtomenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(5,new Intent(item.this,mainmenu.class));
                finish();
            }
        });

        itemtologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(6,new Intent(item.this,mainmenu.class));
                finish();
            }
        });
    }
}
