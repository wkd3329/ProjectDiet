package com.example.app;

public class food {
    String foodName; //
    int unit;
    float[] cal = new float[2];
    nutrition n = new nutrition();

    food(String foodName,float amount, int unit){ //음식 사진 촬영후 음식의 이름,양,단위를 전달받아 객체 생성)
        this.foodName=foodName;
        n.setnutrition(foodName,unit,amount);
    }

    void setAmount(float amount){
        n.fAmount=amount;
    }

    float getFoodCal(){
        return n.nut[0];
    }

    float[] getNut(){
        return n.nut;
    }

    String getUnit(){
        return n.food[n.foodNumber][1];
    }

};

