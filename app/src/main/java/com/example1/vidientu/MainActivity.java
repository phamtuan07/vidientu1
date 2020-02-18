package com.example1.vidientu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    EditText etxt1;
    EditText etxt2;
    EditText etxt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.buttonClick);
        txt1  =  (TextView) findViewById(R.id.textView1) ;
        txt2  =  (TextView) findViewById(R.id.textView2) ;
        txt3  =  (TextView) findViewById(R.id.textView3) ;
        txt4  =  (TextView) findViewById(R.id.textView4) ;
        etxt1 =  (EditText) findViewById(R.id.editText1) ;
        etxt2 =  (EditText) findViewById(R.id.editText2) ;
        etxt3 =  (EditText) findViewById(R.id.editText3) ;
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText("Còn lại:");

            }
        });
    }
}
