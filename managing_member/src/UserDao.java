import java.io.*;
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
    public List<? extends User> loadUser(){

        File file = new File(this.fileName);

        if(!file.exists()) return new ArrayList<User>();

        ArrayList<User> usersList = null;
        try{

            ObjectInputStream os = new ObjectInputStream(new FileInputStream(this.fileName));
            usersList = (ArrayList<User>)os.readObject();

        }catch(Exception e){
            System.exit(0);
        }
        return usersList;
    }
    public void saveUser(ArrayList<? extends User> users){
        ObjectOutputStream oo;
        try{
            oo = new ObjectOutputStream( new FileOutputStream(this.fileName));
            oo.writeObject(users);
        }catch(Exception e1){
            System.exit(0);
        }
    }
}
