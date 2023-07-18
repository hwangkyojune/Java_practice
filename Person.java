public class Person {
    String name ;//인스턴스 필드
    String address;
    boolean isVip;
    static int count = 0;//클래스 필드

    public void printName(){
        System.out.println("내 이름은 "+name);
    }
//메소드는 매개 변수로 받은 값과 클래스 안에 선언된 변수를 사용할 수 있다.
    public static void printCount(){
        System.out.println("count : "+count);
    }
}
