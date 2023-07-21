package com.example.car;

public class Car {
    String name ;
    // 매개변수가 0개인 생성자 = 기본 생성자
    // 생성자가 없을 때는 자동으로 생성
    public Car(){
        System.out.println("자동차가 한대 생성됩니다.");
    }
    //자동차 이름을 갖고 태어나게 하고 싶다.

    //그냥 생성자 안에 있는 내용은 로컬 변수 먼저 필드를 선언해 주어야 한다.
    public Car(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println(this.name);
    }

    public void run(){
        System.out.println("전륜 구동입니다.");
    }

    @Override
    public String toString() {
        return "자동차";
    }
}
