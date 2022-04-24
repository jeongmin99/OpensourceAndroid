package org.techtown.mission6_7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbutton=(Button) findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,mainmenu.class);
                startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==1)
        {
            Toast.makeText(MainActivity.this, "고객 관리", Toast.LENGTH_SHORT).show();
        }
        else if(resultCode==2)
        {
            Toast.makeText(MainActivity.this,"매출 관리",Toast.LENGTH_SHORT).show();
        }
        else if(resultCode==3)
        {
            Toast.makeText(MainActivity.this, "상품 관리", Toast.LENGTH_SHORT).show();
        }
        else
        {

        }
    }
}