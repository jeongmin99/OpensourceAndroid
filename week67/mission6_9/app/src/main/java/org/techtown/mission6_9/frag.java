package org.techtown.mission6_9;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class frag extends Fragment {

    EditText name,age;
    Button date;

    Calendar cal=Calendar.getInstance();
    DatePickerDialog.OnDateSetListener setDate=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            cal.set(Calendar.YEAR,year);
            cal.set(Calendar.MONTH,month);
            cal.set(Calendar.DAY_OF_MONTH,dayOfMonth);
            updateDate();
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup view=(ViewGroup) inflater.inflate(R.layout.frag,container,false);
        name=(EditText) view.findViewById(R.id.name);
        age=(EditText) view.findViewById(R.id.age);
        date=(Button) view.findViewById(R.id.date);
        Date time=Calendar.getInstance().getTime();
        date.setText(new SimpleDateFormat("yyyy/MM/dd",Locale.getDefault()).format(time));

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(getContext(),setDate,cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        Button ok=(Button)view.findViewById(R.id.button);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n,a,d;
                n=name.getText().toString();
                a=age.getText().toString();
                d=date.getText().toString();

                Toast.makeText(getContext(), "이름: "+n+", 나이: "+a+", 생년월일: "+d+" " ,Toast.LENGTH_LONG).show();
            }
        });
        return view;


    }

    public void updateDate(){   //날짜 형식 변환
        String format = "yyyy/MM/dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.KOREA);
        date.setText(simpleDateFormat.format(cal.getTime()));
    }
}
