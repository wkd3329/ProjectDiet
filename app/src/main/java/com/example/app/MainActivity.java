package com.example.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private frag_add fAdd;
    private frag_day fDay;
    private frag_week fWeek;
    private frag_month fMonth;
    private frag_setting fSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bot_navi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                                                                     @Override
                                                                     public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                                                                         switch (menuItem.getItemId())
                                                                         {
                                                                             case R.id.action_add:
                                                                                 setFrag(0);
                                                                                 break;
                                                                             case R.id.action_day:
                                                                                 setFrag(1);
                                                                                 break;
                                                                             case R.id.action_week:
                                                                                 setFrag(2);
                                                                                 break;
                                                                             case R.id.action_month:
                                                                                 setFrag(3);
                                                                                 break;
                                                                             case R.id.action_setting:
                                                                                 setFrag(4);
                                                                                 break;
                                                                         }
                                                                         return true;
                                                                     }
                                                                 }
        );

        fAdd = new frag_add();
        fDay =  new frag_day();
        fWeek =  new frag_week();
        fMonth =  new frag_month();
        fSetting =  new frag_setting();
        setFrag(0); //초기화면

    }

    //fragment 교체
    private void setFrag(int n)    {

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n){
            case 0:
                ft.replace(R.id.main_frame, fAdd);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, fDay);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, fWeek);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame, fMonth);
                ft.commit();
                break;
            case 4:
                ft.replace(R.id.main_frame, fSetting);
                ft.commit();
                break;
        }

    }

}