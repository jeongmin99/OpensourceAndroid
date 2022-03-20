package org.techtown.practice2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button1;
    Button button2;
    EditText editText;
    RadioButton rdbtn1;
    RadioButton rdbtn2;
    RadioGroup rdgroup;
    ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("좀 그럴듯한 앱");
        getSupportActionBar().setIcon(R.drawable.android12);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        editText=findViewById(R.id.edittext);
        rdbtn1=findViewById(R.id.radioButton1);
        rdbtn2=findViewById(R.id.radioButton2);
        imgview=findViewById(R.id.imageView);
        rdgroup=findViewById(R.id.radiogroup);

        rdgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rdbtn1.isChecked())
                {
                    imgview.setImageResource(R.drawable.android11);
                }
                else if(rdbtn2.isChecked())
                {
                    imgview.setImageResource(R.drawable.android12);
                }
                else
                {

                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txt=editText.getText().toString();
                Toast.makeText(getApplicationContext(),txt,Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt=editText.getText().toString();
                Intent op=new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+txt+"/"));
                startActivity(op);
            }
        });
        }



}