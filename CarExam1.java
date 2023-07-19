import com.example.car.Car;
public class CarExam1 {
    public static void main(String[] args){
        SuperCar car1 = new SuperCar();
        Bus bus1 = new Bus();
        //부모 타입으로 자식 참조
        Car car2 = new SuperCar();

        car1.run();
        bus1.run();
        bus1.audio();
        //부모 타입 변수여도 오버라이딩된 메소드가 실행된다.
        car2.run();
        //그러나 자식에게만 있는 메소드는 실행할 수 없다.
//        car2.price();

    }
}
