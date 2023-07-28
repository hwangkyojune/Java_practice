public class ExceptionPractice {
    int first ;
    int second;
    public ExceptionPractice(int first,int second){
        this.first = first;
        this.second = second;
    }

    public int devide() throws ArithmeticException{
        return this.first/this.second;
    }

}
