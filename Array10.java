import java.util.Arrays;
public class Array10 {


    public static void main(String[] args){
        int[][] array1 = new int[][]{{1,2},{10,5,7},{3,8,24}};
//        for(int i=0; i<array1.length;i++) {
//            for(int j=0; j<array1[i].length;j++){
//                array1[i][j] = i*1000 + j;
//            }
//        }
        for(int i=0; i<array1.length;i++) {
            for(int j=0; j<array1[i].length;j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("foreach");
        for(int[] i:array1){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        int[][] array2 = Arrays.copyOfRange(array1,0,1);

        for(int i=0; i<array2.length;i++) {
            for(int j=0; j<array2[i].length;j++){
                System.out.println();System.out.print(array2[i][j]+"\t");
        }
        }
        System.out.println("foreach");
        for(int[] i:array2){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

    }
}
