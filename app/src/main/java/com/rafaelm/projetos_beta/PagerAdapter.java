package com.rafaelm.projetos_beta;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    String[] tab = new String[]{"Principal,Produtos,Servicos"};
    Integer tabNumber = 3;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tab[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Principal principal1 = new Principal();
                return principal1;

            case 1:
                Produtos produtos2 = new Produtos();
                return produtos2;

            case 2:
                Servicos servicos3 = new Servicos();
                return  servicos3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabNumber;
    }
}
