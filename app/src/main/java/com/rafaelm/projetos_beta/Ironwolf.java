package com.rafaelm.projetos_beta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Ironwolf extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironwolf);

        toolbar = findViewById(R.id.my_toolbarIron);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("SÉRIE GUARDIÕES");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
