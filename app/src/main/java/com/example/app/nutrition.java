package com.example.app;

//영양소 정보를 저장하는 클래스

public class nutrition {


    String[][] food = new String[200][]; //음식이름, 단위 저장
    String[] nutName = {"칼로리", "탄수화물", "단백질", "지방", "나트륨", "a", "b", "c"}; // 영양소 이름 저장
    float[] nut = new float[8]; //영양소 총합 저장
    float[][] nutInfo =  new float[9][]; // uKcal,gkcal,탄수화물,단백질,지방,나트륨,a,b,c //영양소 정보 저장
    int foodNumber=0; // 음식의 번호
    float fAmount=0;

    nutrition(){};
    void setnutrition(String foodName,int unit,float amount){
        this.fAmount=amount;
        for(int i=0; i<food.length; i++)
        {
            if(food[i][0]==foodName)
            {
                foodNumber=i;
               nut[0]=nutInfo[foodNumber][unit]*fAmount;
               for(int j=1; j<9; j++) {
                   nut[j] = nutInfo[i][j]*fAmount;
               }
            }
        }
    };

}
