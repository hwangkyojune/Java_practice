import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
*파일에서 List<User>정보를 읽어들이거나 저장하는 기능
 */
public class UserDao {
    private String fileName;
    public UserDao(String fileName){
        this.fileName = fileName;
    }
    public List<User> loadUser(){

        File file = new File(this.fileName);

        if(!file.exists()) return new ArrayList<User>();

        List<User> usersList = null;
        try{

            ObjectInputStream os = new ObjectInputStream(new FileInputStream(this.fileName));
            usersList = (List<User>)os.readObject();

        }catch(Exception e){
            System.out.println(e);
            System.exit(0);
        }
        return usersList;
    }
    public void saveUser(List<User> users){
        ObjectOutputStream oo;
        try{
            oo = new ObjectOutputStream( new FileOutputStream(this.fileName));
            oo.writeObject(users);
            oo.close();
        }catch(Exception e1){
            System.out.println(e1);
            System.exit(0);
        }
    }
}
