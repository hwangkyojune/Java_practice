import com.example.car.Car ;
public class CarExam {
    public static void main(String[] args){

        Car c1 = new Car();
        System.out.println(c1.toString()); //object로 참조할 수 있는 것은 무엇이든 받을 수 있다.
        c1.printName();
        System.out.println("----------------------");
        Car c2 = new Car("비틀즈");
        System.out.println(c2.toString()); //object로 참조할 수 있는 것은 무엇이든 받을 수 있다.
        c2.printName();

    }
}
//조상타입의 변수로 후손인스턴스를 참조할 수 있다.