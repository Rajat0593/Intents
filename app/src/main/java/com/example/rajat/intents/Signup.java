package com.example.rajat.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    private TextView nameText,EmailText;
    private Button sendBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

       nameText = (TextView)findViewById(R.id.nameText);
        EmailText = (TextView) findViewById(R.id.EmailText);
        /**
         * The commented code is for getting the intents without Using Bundle
         */

//        String s = getIntent().getStringExtra("name");
//        String s1 = getIntent().getStringExtra("Email");
//
//        nameText.setText(s);
//        EmailText.setText(s1);


        Bundle bundle = getIntent().getExtras();
       String s =  bundle.getString("Name");
       String s1 = bundle.getString("Email");

       nameText.setText(s);
       EmailText.setText(s1);


       sendBack = findViewById(R.id.BackButton);

       sendBack.setOnClickListener(new View.OnClickListener(

       ) {
           @Override
           public void onClick(View v) {

               Intent i = new Intent(getApplicationContext(),MainActivity.class);
               startActivity(i);

           }
       });


    }
}
