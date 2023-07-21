package com.example.lotto;

public class LottoMain {

    public static void main(String[] args){
        //balls 초기화
        Ball[] balls = new Ball[45];
        for(int i =0; i<LottoImp.MAX_COUNT;i++){
            balls[i] = new Ball(i);
        }

        LottoImp lottoImp = new LottoImp();

        lottoImp.setBalls(balls);
        lottoImp.mixBall();
        Ball[] winBalls = new Ball[6];
        winBalls  = lottoImp.getBalls();
        for(int i=0; i<LottoImp.GET_COUNT ; i++){
            System.out.println(winBalls[i].getNumber());
        }

    }

}
