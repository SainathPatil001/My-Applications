package com.example.myapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickbtn(View view){
        EditText dollaramount= findViewById(R.id.dollaramount);
        String dollars=dollaramount.getText().toString();
        double doubledollar=Double.parseDouble(dollars);
        double doubleINR= 75.51*doubledollar;
        doubleINR= Math.round(doubleINR*100)/100.0;

        String toasttext= "The amount in Rupees is "+doubleINR+" ₹";
        Toast.makeText(this,toasttext, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
