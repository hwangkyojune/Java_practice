public class Exception5 {
    public int[] array1 = new int[2];
    public int[] array2 = new int[1];

    public Exception5(int[] array1,int[] array2){
        this.array1 = array1;
        this.array2 = array2;
    }

    public int divide() throws Exception5My{
        int result = 0;
        try{
            array2[0] = array1[0]/array1[1];
            result = array2[0];
        }catch(ArithmeticException a1){
            throw new Exception5My(a1);
        }catch(NullPointerException a2){
            throw new Exception5My("길이가 0인 배열에 접근");
        }catch(ArrayIndexOutOfBoundsException a3){
            throw new Exception5My(a3);
        }

        return result;
    }

}
