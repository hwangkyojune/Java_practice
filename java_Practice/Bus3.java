public class Bus3 extends Car3 {
    //부모 클래스에 기본 생성자가 없기 때문에 super를 호출해야함.
    public Bus3(String name){
        super(name);
    }
    //추상 메소드는 무조건 오버라이드!!
    public void run(){
        System.out.println(this.name+"4륜구동");
    }

}
