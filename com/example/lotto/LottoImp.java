package com.example.lotto;

public class LottoImp implements Lotto{
    Ball[] balls;
    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls ;
    }

    @Override
    public void mixBall(){
        for(int i = 0;i<10000;i++){
            int whatMix1 = (int)(Math.random()*45);
            int whatMix2 = (int)(Math.random()*45);
            if(whatMix1 != whatMix2){
                Ball tmp = this.balls[whatMix2];
                this.balls[whatMix2] = this.balls[whatMix1];
                this.balls[whatMix1] = tmp;
            }

        }

    }

    @Override
    public Ball[] getBalls() {
        Ball[] winBalls = new Ball[6];
        for(int i=0;i<this.GET_COUNT;i++){
            winBalls[i] = this.balls[i];
        }
        return winBalls;
    }
}
