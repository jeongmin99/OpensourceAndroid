package org.techtown.practice5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button[] btn=new Button[10];
    Button Add,Sub,Mul,Div;
    EditText edit1,edit2;
    TextView textResult;
    Integer result;
    String num1,num2;
    int i;
    Integer[] numBtnIDs={R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("테이블 레이아웃 계산기");
        edit1=(EditText) findViewById(R.id.edit1);
        edit2=(EditText) findViewById(R.id.edit2);
        Add=(Button) findViewById(R.id.Add);
        Sub=(Button) findViewById(R.id.Sub);
        Mul=(Button) findViewById(R.id.Mul);
        Div=(Button) findViewById(R.id.Div);
        textResult=(TextView) findViewById(R.id.result);

        Add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                    num1=edit1.getText().toString();
                    num2=edit2.getText().toString();
                    result=Integer.parseInt(num1)+Integer.parseInt(num2);
                    textResult.setText(result.toString());
                    return false;

            }
        });

        Sub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
               num1=edit1.getText().toString();
               num2=edit2.getText().toString();
                result=Integer.parseInt(num1)-Integer.parseInt(num2);
                textResult.setText(result.toString());
                return false;
            }
        });

        Mul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)*Integer.parseInt(num2);
                textResult.setText(result.toString());
                return false;
            }
        });

        Div.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1=edit1.getText().toString();
               num2=edit2.getText().toString();
                result=Integer.parseInt(num1)/Integer.parseInt(num2);
                textResult.setText(result.toString());
                return false;
            }
        });

        for(i=0;i<numBtnIDs.length;i++)
        {
            btn[i]=(Button) findViewById(numBtnIDs[i]);
        }
        for(int i=0;i<numBtnIDs.length;i++)
        {
            final int index;
            index=i;

            btn[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(edit1.isFocused())
                    {
                        num1=edit1.getText().toString()+btn[index].getText().toString();
                        edit1.setText(num1);
                    }
                    else if(edit2.isFocused())
                    {
                        num2=edit2.getText().toString()+btn[index].getText().toString();
                        edit2.setText(num2);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"먼저 에디트텍스트를 선택하세요",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}