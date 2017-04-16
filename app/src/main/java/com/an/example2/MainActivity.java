package com.an.example2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp2 = (Spinner)findViewById(R.id.sp);

       ArrayAdapter adapterDays = ArrayAdapter.createFromResource(this,R.array.days,android.R.layout.simple_spinner_item);

        sp2.setAdapter(adapterDays);
        sp2.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView tvShow2 = (TextView)view;
        Toast.makeText(this,"You selected "+ tvShow2.getText().toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
