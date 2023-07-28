package com.example.lotto;
//인터페이스는 추상 메소드,항상 정적 필드로 선언됨. final, abstract가 자동으로 붙음.
//정적 메소드와 디폴트 메서드 사용해도 되긴 함.
//45개의 공 만들기, 공 섞기, 공 뽑기
public interface Lotto {
    int MAX_COUNT = 45;
    int GET_COUNT = 6;

    //45개의 공을 받아들임
    public void setBalls(Ball[] balls);
    //
    public void mixBall();
    public Object getBalls();

}
