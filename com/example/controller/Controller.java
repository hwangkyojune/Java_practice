package com.example.controller;
//틀을 정하기 위한 메소드 입니다.
public abstract class Controller {
    protected final void init(){
        System.out.println("따로 호출 불가능하고, 오버라이딩이 불가능합니다.");
        System.out.println("init");
    }
    protected final void end(){
        System.out.println("따로 호출 불가능하고, 오버라이딩이 불가능합니다.");
        System.out.println("end");
    }

    //자손 클래스에서 이 메소드를 오버라이딩해주어야 합니다.
    public abstract void run();
    //전반적인 과정을 꼭 이 순서대로 진행해야 합니다. 수정 불가하기 때문에 final 사용.
    public final void execute(){
        this.init();
        this.run();
        this.end();
    }
}
