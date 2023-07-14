public class for_label {
    public static void main(String[] args){
        stop:
        for(int i=1; i <30; i++){
            for(int j =1;j <30; j++){
                if(i>=10){
                    break stop;
                }
                System.out.println(i+"*"+j+"="+i*j);

            }
        }
    }
}
