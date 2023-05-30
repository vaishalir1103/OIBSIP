package com.example.numberconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1;
        EditText editmt;
        TextView text1,text2;

        bt1=findViewById(R.id.bt1);
        editmt=findViewById(R.id.editmt);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mt=Integer.parseInt(editmt.getText().toString());
                double cm=(mt*100);
                text2.setText("The Number In CM is:"+cm);
            }
        });

    }
}