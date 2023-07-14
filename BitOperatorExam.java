public class BitOperatorExam {
    public static void main(String[] args){
        int a = 4;
        int b = a >>1;
        int c = a <<1;
        /*
        Bit operator >> 이전법으로 바꾼 숫자들을 왼쪽으로 뒤에 있는 숫자만큼 이동시킨다.
        >>는 2를 나누고,
        <<는 2를 곱하는 것이랑 비슷하다.
        삼항 연산자 만족할 경우 앞의 값 반환 아닌 경우 뒤의 값 반환
         */
        int value = (a > 5)? b:c;
        System.out.println(b);
        System.out.println(c);
        System.out.println(value);
    }
}
