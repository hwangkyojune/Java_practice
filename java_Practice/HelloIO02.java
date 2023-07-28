import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloIO02 {
    public static void main(String[] args)  {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] numstr;
        int sum = 0 ;
        try{
            numstr = br.readLine().split(" ");
            for(int i =0 ; i <numstr.length ; i++){
                int integer;
                sum += Integer.parseInt(numstr[i]);

            }
        }catch (IOException e1){
            System.exit(0);
        }
        System.out.println(sum);

    }

}
