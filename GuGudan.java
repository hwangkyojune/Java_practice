public class GuGudan {
    public static void main(String[] args){
        /*
        자바에서는 문자열에 정수형, 불린, 실수 타입을 더하면 문자열이 된다.
        ex) "Hello" + 1 -> "Hello1", "Hello" + true -> "Hellotrue"
         */
        for(int i=1; i<10 ; i++){
            System.out.println(i+"곱셈");
            for(int j=1; j<10; j++){
                System.out.println(i+"*"+i+"="+i*j);

            }
        }
    }
}
