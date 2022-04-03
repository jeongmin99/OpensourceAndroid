package org.techtown.mission4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button upbutton,downbutton;
    ImageView upimage,downimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upbutton=(Button) findViewById(R.id.upbutton);
        downbutton=(Button) findViewById(R.id.downbutton);
        upimage=(ImageView) findViewById(R.id.upimage);
        downimage=(ImageView) findViewById(R.id.downimage);

        upimage.setImageResource(R.drawable.image1);
        upbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                upimage.setImageResource(R.drawable.image1);
                downimage.setImageResource(0);
            }
        });

        downbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upimage.setImageResource(0);
                downimage.setImageResource(R.drawable.image1);
            }
        });
    }
}