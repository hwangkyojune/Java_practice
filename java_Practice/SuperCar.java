import com.example.car.Car ;
public class SuperCar extends Car{
    @Override
    public void run(){
        System.out.println("후륜 구동입니다.");
    }

    public void price(){
        System.out.println("아주 비싸요.");
    }

}
