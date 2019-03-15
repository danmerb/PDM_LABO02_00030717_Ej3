package com.veegadiego.ejercicio3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout rojo;
    private LinearLayout verde;
    private LinearLayout azul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rojo= (LinearLayout) findViewById(R.id.red);
        verde= (LinearLayout) findViewById(R.id.green);
        azul=(LinearLayout) findViewById(R.id.blue);


        rojo.setOnClickListener(this);
        verde.setOnClickListener(this);
        azul.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        int nuevoColor=(int)(Math.random()*420);

        switch (v.getId()){
            case R.id.red:
                rojo.setBackgroundColor(Color.rgb(nuevoColor,0,0));
                break;
            case R.id.green:
                verde.setBackgroundColor(Color.rgb(0,nuevoColor,0));
                break;
            case  R.id.blue:
                azul.setBackgroundColor(Color.rgb(0,0,nuevoColor));
    }
}
}
