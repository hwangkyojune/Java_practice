package com.example.firstController;
import com.example.controller.Controller;
public class FirstController extends Controller {
    //추상 메소드는 반드시 오버라이딩 해야합니다.
    @Override
    public void run() {
        System.out.println("실행1");
    }

}
