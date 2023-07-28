package com.example.lotto;

public class Ball {
    //공의 숫자는 한번 정해지고 변하면 안되고, 반환만 가능하게 해야함. private를 통해 외부에서 접근 불가
    private int number ;
    public Ball(int number){
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

}
