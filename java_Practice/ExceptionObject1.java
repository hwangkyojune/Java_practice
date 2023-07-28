class ExceptionObject1 {
    public int divide(int x, int y) throws MyException {
        int value = 0;
        try{
            value = x / y;
        }catch(ArithmeticException a1){
            throw new MyException("0으로 나눌 수 없습니다.");
        }
        return value;
    }
}
