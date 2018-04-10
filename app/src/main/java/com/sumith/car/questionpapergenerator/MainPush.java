package com.sumith.car.questionpapergenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainPush extends AppCompatActivity {
    DataBaseHelper1 myDb1;
    String question;
    EditText qsa;
    Button btnqssave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_push);
        myDb1= new DataBaseHelper1(this);
        qsa=findViewById(R.id.aqs);
        btnqssave=findViewById(R.id.btnsaveqs);
        btnqssave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClickME();
            }
        });
    }
    private void ClickME(){
        question=qsa.getText().toString();
        Boolean result=myDb1.insertData(question);
        if (result==true )
        {
            Toast.makeText(this, "Information of the user is saved", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Process Failed", Toast.LENGTH_LONG).show();
        }
    }
}
