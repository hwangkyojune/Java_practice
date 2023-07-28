import java.util.Arrays;
public class ArraySortInt {
    public static void main(String[] args) {
        int[] array1 = {1,7,2,45,47,5,9,63};
        System.out.println("sort 메소드 호출 이전");
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("sort 메소드 호출 이후");
        System.out.println(Arrays.toString(array1));
    }
}
