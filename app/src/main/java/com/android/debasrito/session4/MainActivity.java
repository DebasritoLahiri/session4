package com.android.debasrito.session4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rb1,rb2;
    RadioGroup rg;
    Button b;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rg=findViewById(R.id.rg);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Tea", Toast.LENGTH_SHORT).show();
                }
                if (rb2.isChecked()) {
                    Toast.makeText(MainActivity.this, "Coffee", Toast.LENGTH_SHORT).show();
                }
                int rb_id = rg.getCheckedRadioButtonId();
                if (rb_id == R.id.rb1) {
                    Toast.makeText(MainActivity.this, "Tea is selected", Toast.LENGTH_SHORT).show();
                }
                if (rb_id == R.id.rb2) {
                    Toast.makeText(MainActivity.this, "Coffee is selected", Toast.LENGTH_SHORT).show();
                }
                i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
