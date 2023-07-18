public class VendingMachineMain {
    // 클래스 메소드가 있어서 인스턴스로 생성하지 않아도 실행가능
    public static void main(String[] args){
        // main 메소드는 VendingMachine이라는 클래스가 있어야 실행가능 ->
        // 메소드에서 사용하는 것은 의존한다(중요)
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProduceButton(100);
        System.out.println(product);
//        VendingMachine.printVersion();
        String product2 = vm2.pushProduceButton(200);
        System.out.println(product2);
        // class파일 경로들은 CLASSPATH라는 곳에 저장되어 있다.

    }
}
