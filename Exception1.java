public class Exception1 {
    public static void main(String[] args) {
        ExceptionObject1 eo = new ExceptionObject1();
//        try{
//            int result = eo.divide(10, 0);
//            System.out.println(result);
//        }catch(MyException m1){
//            System.out.println("0으로 나눌 수 없음");
//        }
        int result = eo.divide(10, 0);
        System.out.println(result);
    }
}
