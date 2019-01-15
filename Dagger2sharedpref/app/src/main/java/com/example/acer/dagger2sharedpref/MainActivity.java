package com.example.acer.dagger2sharedpref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText inUsername, inNumber;
    Button btnSave, btnGet;
    private MyComponent myComponent;
    @Inject
    MySharedPreferences mySharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        ((MyApplication)getApplicationContext()).getMyComponent().inject(this);


    }

    private void initViews() {
        btnGet = findViewById(R.id.btnGet);
        btnSave = findViewById(R.id.btnSave);
        inUsername = findViewById(R.id.inUsername);
        inNumber = findViewById(R.id.inNumber);
        btnSave.setOnClickListener(this);
        btnGet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnGet:
                inUsername.setText(mySharedPreferences.getData("username"));
                inNumber.setText(mySharedPreferences.getData("number"));
                break;
            case R.id.btnSave:

              mySharedPreferences.putData("username", inUsername.getText().toString().trim());
                mySharedPreferences.putData("number", inNumber.getText().toString().trim());

                break;

        }
    }
}