package com.shakibcsekuet.shared_preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

  Button b1,b2;
    EditText e;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        t=(TextView)findViewById(R.id.textView);
        e=(EditText) findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "clicked on save button", Toast.LENGTH_LONG).show();
               SharedPreferences sp=getSharedPreferences("SHAKIB", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("TEXT",e.getText().toString());
                editor.apply();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "clicked on display button", Toast.LENGTH_LONG).show();
                SharedPreferences sp=getSharedPreferences("SHAKIB", Context.MODE_PRIVATE);
                String s=sp.getString("TEXT","");
                t.setText(s);
            }
        });


    }
}