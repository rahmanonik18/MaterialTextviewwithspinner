package com.opl.rahman.spinnertextview;

//SecondActivity


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initUI();
    }

    private void initUI()
    {

        final TextView tv_mytextview= findViewById(R.id.mytextView);
        Bundle b = getIntent().getExtras();
        String getValue = b.getString("passedvalue");
        tv_mytextview.setText(getValue.toString().trim());




    }


}
