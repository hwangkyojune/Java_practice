public class Array03 {
    public static void main(String[] args){
        int[] array1 = new int[5];
        for(int i=0;i<array1.length-1;i++){
            array1[i] = i;
        }
        int[] array2 = new int[]{0,1,2,3,4};
        int[] array3 = {0,1,2,3,4};
        System.out.println("array1 값");
        for(int content:array1){
            System.out.println(content);
        }
        System.out.println("array2 값");
        for(int content:array2){
            System.out.println(content);
        }
        System.out.println("array3 값");
        for(int content:array3){
            System.out.println(content);
        }



    }
}
