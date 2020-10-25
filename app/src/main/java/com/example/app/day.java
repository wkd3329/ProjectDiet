package com.example.app;


import java.util.Vector;

public class day {

    int today;

    float[] nutSum = new float[8];
    Vector<meal> mealList;
    Vector<exercise> exerList;

    day(){
        this.today=0;
    };

    void addMeal(meal a){
        mealList.add(a);
    }

    void addExer(exercise e) { exerList.add(e); }

    void delMeal(int k) { mealList.remove(k); }

    void delExer(int k) { exerList.remove(k); }

    float[] getNutSum(){
        for(int i=0; i<nutSum.length; i++){
            for(int j=0; j<mealList.size(); j++){
                nutSum[i]+=mealList.elementAt(j).nutSum[i];
            }
        }
        return nutSum;
    }

    void setToday(int a){
        today=a;
    }
}
