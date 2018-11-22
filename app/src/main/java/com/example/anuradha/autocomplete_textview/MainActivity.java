package com.example.anuradha.autocomplete_textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView a1;
    String values[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1= (AutoCompleteTextView) findViewById(R.id.ac1);
         values=getResources().getStringArray(R.array.Suggestion);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);
        a1.setAdapter(ad);
        a1.setThreshold(1);
    }
}

