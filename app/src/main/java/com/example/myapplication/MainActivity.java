package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myText1 = (EditText) findViewById(R.id.editTextNumber);
                EditText myText2 = (EditText) findViewById(R.id.editTextNumber2);
                EditText myText3 = (EditText) findViewById(R.id.editTextNumber3);
                EditText myText4 = (EditText) findViewById(R.id.editTextNumber4);
                EditText myText5 = (EditText) findViewById(R.id.editTextNumber5);
                EditText myText6 = (EditText) findViewById(R.id.editTextNumber6);
                EditText myTextRes = (EditText) findViewById(R.id.editTextNumber7);
                float var1 = Float.parseFloat(myText1.getText().toString());
                float var2 = Float.parseFloat(myText2.getText().toString());
                float var3 = Float.parseFloat(myText3.getText().toString());
                float var4 = Float.parseFloat(myText4.getText().toString());
                float var5 = Float.parseFloat(myText5.getText().toString());
                float var6 = Float.parseFloat(myText6.getText().toString());
                float res = (var1+var2+var3+var4+var5+var6)/6;
                myTextRes.setText(res + "");
            }
        });
    }



}