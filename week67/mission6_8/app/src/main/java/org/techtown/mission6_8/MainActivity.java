package org.techtown.mission6_8;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText idfield,pwfield;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idfield=(EditText) findViewById(R.id.idfield);
        pwfield=(EditText) findViewById(R.id.pwfield);
        login=(Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(idfield.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "아이디를 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else if(pwfield.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "비밀번호를 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    startActivityForResult(new Intent(MainActivity.this,mainmenu.class),0);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==2)
        {
            Toast.makeText(MainActivity.this, "고객 관리", Toast.LENGTH_SHORT).show();
        }
        else if(resultCode==4)
        {
            Toast.makeText(MainActivity.this, "매출 관리", Toast.LENGTH_SHORT).show();
        }
        else if(resultCode==6)
        {
            Toast.makeText(MainActivity.this, "상품 관리", Toast.LENGTH_SHORT).show();
        }
    }
}