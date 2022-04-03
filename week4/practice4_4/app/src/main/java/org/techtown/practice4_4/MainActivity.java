package org.techtown.practice4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    TextView text1,text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton rdo10,rdo11,rdo12;
    Button btnDone,btnInit;
    ImageView imgAnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("안드로이드 사진 보기");
        getSupportActionBar().setIcon(R.drawable.android12);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        text1=(TextView) findViewById(R.id.Text1);
        text2=(TextView) findViewById(R.id.Text2);
        chkAgree=(Switch) findViewById(R.id.ChkAgree);
        rGroup1=(RadioGroup) findViewById(R.id.Rdgroup1);
        rdo10=(RadioButton) findViewById(R.id.Rdo10);
        rdo11=(RadioButton) findViewById(R.id.Rdo11);
        rdo12=(RadioButton) findViewById(R.id.Rdo12);
        btnDone=(Button) findViewById(R.id.BtnDone);
        btnInit=(Button) findViewById(R.id.BtnInit);
        imgAnd=(ImageView) findViewById(R.id.ImgAnd);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()==true)
                {
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    btnDone.setVisibility(android.view.View.VISIBLE);
                    btnInit.setVisibility(View.VISIBLE);
                    imgAnd.setVisibility(android.view.View.VISIBLE);
                }
                else
                {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    btnDone.setVisibility(android.view.View.INVISIBLE);
                    btnInit.setVisibility(View.INVISIBLE);
                    imgAnd.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rdo10.isChecked()==true)
                {
                    imgAnd.setImageResource(R.drawable.android10);
                }
                else if(rdo11.isChecked()==true)
                {
                    imgAnd.setImageResource(R.drawable.android11);
                }
                else if(rdo12.isChecked()==true)
                {
                    imgAnd.setImageResource(R.drawable.android12);
                }
                else;
            }
        });

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        btnInit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chkAgree.setChecked(false);
                rdo10.setChecked(false);
                rdo11.setChecked(false);
                rdo12.setChecked(false);
                imgAnd.setImageResource(0);
            }
        });
    }
}