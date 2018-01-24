package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //final TextView txt;
   // final Button btn;
    //final EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView  txt=(TextView)findViewById(R.id.textView);
        final Button btn=(Button)findViewById(R.id.mybutton);
        final EditText editText=(EditText)findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String name=editText.getText().toString();
               txt.setText(name);
            }
        });

    }
}
