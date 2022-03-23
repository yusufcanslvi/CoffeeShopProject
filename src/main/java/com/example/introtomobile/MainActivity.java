package com.example.introtomobile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button newB;
    EditText name;

    EditText user_name;
    EditText pass_word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.nameInput); // set textinput to name
        String userName = name.getText().toString(); // get its value in string in userName variable


//         Set newB to the button created with id `buttonnn`
        newB = findViewById(R.id.buttonnn);

//         Override button's default onClick method
        newB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                System.out.println(userName);
                Log.i("TAG", userName);
            }
        });

    }
    public void loginClick(View view){
        user_name = findViewById(R.id.username);
        pass_word = findViewById(R.id.password);

        Log.i("name", user_name.getText().toString());
        Log.i("pw", pass_word.getText().toString());



    }

    public void clickThis(View view){
        System.out.println("something");
    }
}