package org.techtown.mission6_8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class mainmenu extends AppCompatActivity {

    Button member,charge,item;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
        member=(Button) findViewById(R.id.member);
        charge=(Button) findViewById(R.id.charge);
        item=(Button) findViewById(R.id.item);

        member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(mainmenu.this,member.class),1);
            }
        });

        charge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(mainmenu.this, charge.class),2);
            }
        });

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(mainmenu.this,item.class),3);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode%2==0)
        {
            setResult(resultCode,new Intent(mainmenu.this,MainActivity.class));
            finish();
        }
        else if(resultCode==1)
        {
            Toast.makeText(mainmenu.this, "고객 관리", Toast.LENGTH_SHORT).show();
        }
        else if(resultCode==3)
        {
            Toast.makeText(mainmenu.this, "매출 관리", Toast.LENGTH_SHORT).show();
        }
        else if(resultCode==5)
        {
            Toast.makeText(mainmenu.this, "상품 관리", Toast.LENGTH_SHORT).show();
        }
        else;

    }
}
