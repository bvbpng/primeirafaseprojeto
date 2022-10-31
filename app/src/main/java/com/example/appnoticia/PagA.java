package com.example.appnoticia;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagA extends FragmentPagerAdapter {

    int tabcount;

    public PagA(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new HomeFragment();

            case 1:
                return new EsporteFragment();

            case 2:
                return new SaudeFragment();

            case 3:
                return new CienciaFragment();

            case 4:
                return new EntretenimentoFragment();

            case 5:
                return new TechFragment();



            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
