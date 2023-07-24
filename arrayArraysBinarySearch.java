import java.util.Arrays;
public class arrayArraysBinarySearch {
    public static void main(String[] args) {
        int[] array1 = {4,7,8,3,2,4,5,1,0,5,25,1,7};
        //sort는 return이 아니라 인수로 준 배열 자체가 정렬된다.
        Arrays.sort(array1);
        //binarySearch 메소드는 정렬된 배열만 인수로 부여할 수 있다.
        int value = Arrays.binarySearch(array1,4);
        System.out.println(value);
        System.out.println(Arrays.toString(array1));
    }
}
