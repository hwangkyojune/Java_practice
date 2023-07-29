import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * class for user interface
 * 어떤 기능을 사용할지
 * 1.회원 등록
 * 2.회원 목록 가져오기
 * 5.종료
 */
public class UserUi {
    private BufferedReader br;

    public UserUi() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int menu(){
        System.out.println("1.회원 등록");
        System.out.println("2.회원 목록 보기");
        System.out.println("5.종료");
        int menuId = -1;
        try{
            String select = br.readLine();
            menuId = Integer.parseInt(select);

        }catch(Exception e1){
            System.exit(0);
        }
        return menuId;
    }

    public User regUser(){
        String[] userInfoList = {"이름 : ","이메일 : ","생년 : "};
        String[] userInfo = new String[3];
        User user = null;
        try{
            for(int i =0;i<userInfoList.length;i++){
                System.out.print(userInfoList[i]);
                userInfo[i] = br.readLine();
            }
        }catch(Exception e1){
            System.exit(0);
        }
        user = new User(userInfo[0],userInfo[1],Integer.parseInt(userInfo[2]));
        return user;
    }

    public void userList(List<User> users){
        System.out.println("이름     이메일     생년");
        System.out.println("=====================");
        for(int i=0;i<users.size();i++){
            User user = users.get(i);
            System.out.print(user.getName());
            System.out.print("     ");
            System.out.print(user.getEmail());
            System.out.print("     ");
            System.out.print(user.getBirthYear());
            System.out.println();
        }

    }
}
