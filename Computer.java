import com.example.car.Car;

public class Computer extends Device{
    String brand ;
    public Computer(String brand){
        this.brand = brand;
    }
    @Override
    public void turnOn() {
        System.out.println(this.brand+" 컴퓨터를 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println(this.brand +" 컴퓨터를 종료합니다.");
    }
}
