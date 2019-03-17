package com.rafaelm.projetos_beta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class BarracudaPro extends AppCompatActivity {

    private Toolbar toolbarPro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barracuda_pro);

        toolbarPro = findViewById(R.id.my_toolbarPro);
        setSupportActionBar(toolbarPro);
        getSupportActionBar().setTitle("SÉRIE GUARDIÕES");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
