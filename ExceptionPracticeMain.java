public class ExceptionPracticeMain{
    public static void main(String[] args){
        ExceptionPractice e1 = new ExceptionPractice(10,0);
        int result ;
        try{
            result = e1.devide();
            System.out.println(result);
        }catch(ArithmeticException a){
            System.out.println(a);
        }
    }
}
