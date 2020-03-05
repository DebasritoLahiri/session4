package com.android.debasrito.session4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity{
    String bc;
    CheckBox cb1,cb2;
    Switch sw;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    bc="Sugar";
                else
                    bc="No sugar";
                Toast.makeText(Main2Activity.this,bc,Toast.LENGTH_SHORT).show();
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    bc="Milk";
                else
                    bc="No Milk";
                Toast.makeText(Main2Activity.this,bc,Toast.LENGTH_SHORT).show();
            }
        });
        sw=findViewById(R.id.sw);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    bc="Home Delivery";
                else
                    bc="Dine in";
                Toast.makeText(Main2Activity.this,bc,Toast.LENGTH_SHORT).show();
            }
        });
        sp=findViewById(R.id.spinner);
        List<Integer> list1=new ArrayList<>();
        list1.add(1);list1.add(2);list1.add(3);list1.add(4);
        ArrayAdapter<Integer> arrayAdapter=new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_dropdown_item,list1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(arrayAdapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,"Selected",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Main2Activity.this,"Not Selected",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
