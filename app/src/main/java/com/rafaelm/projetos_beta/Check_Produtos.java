package com.rafaelm.projetos_beta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Check_Produtos extends AppCompatActivity {

    private Toolbar toolbar;
    RadioGroup group1;
    RadioButton checked_Deskt,checked_Servidor,checked_Vigilan;
    RadioButton checked_ocas,checked_est,checked_trab,checked_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check__produtos);

        toolbar = findViewById(R.id.my_toolbarCheck);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("O que você procura?");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void BarrC(View view) {

        group1 = findViewById(R.id.group1Cap);

        Button btn_barrc = findViewById(R.id.btn_barrac);
        checked_Deskt = findViewById(R.id.check_Desktop);
        checked_Servidor = findViewById(R.id.check_Servi);
        checked_Vigilan = findViewById(R.id.check_Vigilancia);
//        checked_16t = findViewById(R.id.check_16t);
//        checked_est = findViewById(R.id.check_estud);
  //      checked_trab = findViewById(R.id.check_trab);
    //    checked_back = findViewById(R.id.check_back);

        final Intent barracuda = new Intent(this, Barracuda.class);
        final Intent servidor = new Intent(this, Ironwolf.class);
        final Intent vigilancia = new Intent(this, Skyhawk.class);

        btn_barrc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(checked_Deskt.isChecked()){
                    startActivity(barracuda);
                }else if(checked_Servidor.isChecked()){
                    startActivity(servidor);
                }if(checked_Vigilan.isChecked()){
                    startActivity(vigilancia);
                }
                /*if(checked_ocas.isChecked()){
                    startActivity(i);
                }if(checked_est.isChecked()){
                    startActivity(i);
                }if(checked_trab.isChecked()){
                    startActivity(i);
                }if(checked_back.isChecked()){
                    startActivity(i);
                }*/
            }
        });

    }
}
