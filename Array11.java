import java.util.Arrays;
//java.lang 패키지는 사용 가능!

public class Array11 {
    public static void main(String[] args){
        char[] copyFrom ={'h','e','l','l','o'};
        char[] copyTo = Arrays.copyOfRange(copyFrom,0,2);

        for(char c:copyTo){
            System.out.print(c);
        }
    }
}
