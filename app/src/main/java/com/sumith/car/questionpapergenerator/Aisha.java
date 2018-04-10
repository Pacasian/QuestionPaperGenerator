package com.sumith.car.questionpapergenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by sunith on 10-04-2018.
 */

public class Aisha  extends AppCompatActivity {
    Button btngen,btnpush;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        btngen=findViewById(R.id.gen);
        btnpush=findViewById(R.id.pushQ);
        btngen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Aisha.this,Maingenerate.class);
                startActivity(intent3);
            }
        });
        btnpush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(Aisha.this,MainPush.class);
                startActivity(intent4);
            }
        });
    }
}
