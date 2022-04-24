package org.techtown.practice6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost=findViewById(R.id.TabHost);
        tabHost.setup();


        TabHost.TabSpec dog=tabHost.newTabSpec("dog").setIndicator("강아지");
        dog.setContent(R.id.dog);
        tabHost.addTab(dog);


        TabHost.TabSpec cat=tabHost.newTabSpec("cat").setIndicator("고양이");
        cat.setContent(R.id.cat);
        tabHost.addTab(cat);


        TabHost.TabSpec rabbit=tabHost.newTabSpec("rabbit").setIndicator("토끼");
        rabbit.setContent(R.id.rabbit);
        tabHost.addTab(rabbit);

        TabHost.TabSpec horse=tabHost.newTabSpec("horse").setIndicator("말");
        horse.setContent(R.id.horse);
        tabHost.addTab(horse);

        tabHost.setCurrentTab(0);
    }
}