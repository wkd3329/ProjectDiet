package com.example.app;

import java.util.Vector;

public class meal {

    int time;
    float[] nutSum = new float[8];

    Vector<food> foodList;

    meal(){
        for(int i=0; i<nutSum.length; i++)
            nutSum[i]=0;
        time=0;
    }

    void addFood(food f){
        foodList.add(f);
    }

    void delFood(int k){
        foodList.remove(k);
    }


    void setTime(int t)
    {
        this.time=t;
    }

    float[] getNutSum(){
        for(int i=0; i<nutSum.length; i++){
            for(int j=0; j<foodList.size(); j++){
                nutSum[i]+=foodList.elementAt(j).n.nut[i];
            }
        }
        return  nutSum;
    }



}
