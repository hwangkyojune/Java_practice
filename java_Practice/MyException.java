public class MyException extends RuntimeException{
    //오류 메세지 전달, 발생한 Exception을 감싸고 싶을 때

    public MyException(String message) {
        super(message);
    }
    //Throwable은 Exception의 부모. 즉 Exception 자체도 받아들일 수 있다.
    public MyException(Throwable cause) {
        super(cause);
    }
}


