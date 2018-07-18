package com.example.rajat.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText name,email;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.signup);
        name = (EditText)findViewById(R.id.editName);
        email = (EditText)findViewById(R.id.editEmail);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String EMail =  email.getText().toString();
                final String Name = name.getText().toString();


                Intent intent = new Intent(MainActivity.this, Signup.class);
//                intent.putExtra("Name",Name);
//                intent.putExtra("Email",EMail);
                Bundle bundle = new Bundle();
                bundle.putString("Name",Name);
                bundle.putString("Email",EMail);
                intent.putExtras(bundle);
                  startActivity(intent);
            }
        });
    }
}
