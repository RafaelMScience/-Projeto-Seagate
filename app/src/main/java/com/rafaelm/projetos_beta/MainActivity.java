package com.rafaelm.projetos_beta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //  tabs
        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager pager = findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        //tabLayout.setupWithViewPager(pager); comando bugado

        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(pager));
        // end tabs

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Barracuda) {
            Intent intent = new Intent(this, Desc_Barracuda.class);
            startActivity(intent);

        } else if (id == R.id.nav_Ironwolf) {
            Intent intent = new Intent(this, Desc_Ironwolf.class);
            startActivity(intent);

        } else if (id == R.id.nav_Skyhawk) {

            Intent intent = new Intent(this, Desc_Skyhawk.class);
            startActivity(intent);

        } else if (id == R.id.nav_Contato) {
            Intent intent = new Intent(this, Contato.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void proximaTela(View view) {

        switch (view.getId()) {
            case R.id.barracuda:
                Intent intent = new Intent(this, Barracuda.class);
                startActivity(intent);
                break;

            case R.id.barracudaPro:
                Intent intentpro = new Intent(this, BarracudaPro.class);
            startActivity(intentpro);
            break;

            case R.id.ironWolf:
                Intent intentIron = new Intent(this, Ironwolf.class);
                startActivity(intentIron);
                break;

            case R.id.skyHawk:
                Intent intentsky = new Intent(this, Skyhawk.class);
                startActivity(intentsky);
                break;

                default:break;

        }
    }

    public void checkP(View view){
        Intent i = new Intent(this,Check_Produtos.class);
        startActivity(i);
    }

    public void prodBarracuda(View view){

        //inicia um fragment dentro do outro fragment bug nao volta ao fragment original
        /*FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.fragment1,new Produtos());
        fr.commit();*/
        Intent intentbarracuda = new Intent(this, Desc_Barracuda.class);
        startActivity(intentbarracuda);

    }

    public void prodIronwolf(View view){
        Intent intentIron = new Intent(this, Desc_Ironwolf.class);
        startActivity(intentIron);
    }

    public void prodSkyhawk(View view){
        Intent intentsky = new Intent(this, Desc_Skyhawk.class);
        startActivity(intentsky);
    }

}
