import java.util.Arrays;
public class ArrayArraysCompare {
    //Arrays의 compare 메소드는 앞의 내용부터 비교하면서 첫번째 배열이 크면 1 작으면 -1 반환. 모두 같으면 0반환
    public static void main(String[] args){
        int[] array1 = {3,4,5,6,7};
        int[] array2 = {3,4,5,6};

        System.out.println(Arrays.compare(array1,array2));
    }
}
