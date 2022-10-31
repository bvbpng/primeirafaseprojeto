package com.example.appnoticia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout   tabLayout;
    TabItem mhome,mciencia,msaude,mtech,mentretenimento,mesportes;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;

    String api="b8ce67f8656b44a38d6c8143a880cdf2";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mtoolbar=findViewById(R.id.tooldbar);
        setSupportActionBar(mtoolbar);

        mhome=findViewById(R.id.principal);
        mciencia=findViewById(R.id.ciencia);
        mesportes=findViewById(R.id.esportes);
        mtech=findViewById(R.id.tecnologia);
        mentretenimento=findViewById(R.id.entretenimento);
        msaude=findViewById(R.id.saude);
        ViewPager viewPager=findViewById(R.id.fragmentcontainer);
        tabLayout=findViewById(R.id.include);



        //pagerAdapter=new PagerAdapter(getSupportFragmentManager(), 6);
                viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5)
                {
                    pagerAdapter.notifyDataSetChanged();



                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnAdapterChangeListener((ViewPager.OnAdapterChangeListener) new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }
}