package com.opl.rahman.spinnertextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI()
    {
        final AutoCompleteTextView customerAutoTV = findViewById(R.id.customerTextView);
        final TextView tv_mytextview= findViewById(R.id.mytextView);
        ArrayList<String> customerList = getCustomerList();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, customerList);
        customerAutoTV.setAdapter(adapter);
        findViewById(R.id.submitButton).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (customerAutoTV.getText().toString().equals(null)){
                    Toast toast=Toast.makeText(getApplicationContext(),"Please select spinner Value",Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }else{
                    tv_mytextview.setText(customerAutoTV.getText().toString());
                    tv_mytextview.setVisibility(View.GONE);
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("passedvalue", customerAutoTV.getText().toString());
                    startActivity(i);


                }



            }
        });
    }

    private ArrayList<String> getCustomerList()
    {
        ArrayList<String> customers = new ArrayList<>();
        customers.add("James");
        customers.add("Mary");
        customers.add("Paul");
        customers.add("Michael");
        customers.add("William");
        customers.add("Daniel");
        customers.add("Thomas");
        customers.add("Sarah");
        customers.add("Sophia");
        return customers;
    }
}