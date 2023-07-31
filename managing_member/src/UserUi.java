import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
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
        System.out.println("3.회원 삭제");
        System.out.println("4.회원 수정");
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
                userInfo[i] = this.br.readLine();
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

    public List<User> delUser(List<User> users){
        String delu = null;
        try{
            System.out.print("삭제할 회원 이메일을 입력하세요:");
            delu = this.br.readLine();
        }catch(Exception e2){
            System.out.println(e2);
            System.exit(0);
        }
//        for(int i = 0;i<users.size();i++){
//            if(users.get(i).getEmail().equals(delu)){
//                users.remove(i);
//            }
//        }
        Iterator<User> iterator = users.iterator();
        int i = 0;
        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getEmail().equals(delu)){
                users.remove(user);
                return users;
            }
        }
        System.out.println("삭제할 회원이 없습니다.");
        System.out.println("");
        return users;
    }
    public List<User>  modUser(List<User> users){
        String findUser = null;
        try{
            System.out.print("수정할 회원의 이메일을 입력하세요:");
            findUser = br.readLine();
        }catch(Exception e3){
            System.out.println(e3);
        }

        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getEmail().equals(findUser)){
                String[] userInfoList = {"이름 : ","이메일 : ","생년 : "};
                String[] userInfo = new String[3];
                try{
                    for(int i =0;i<userInfoList.length;i++){
                        System.out.print(userInfoList[i]);
                        userInfo[i] = this.br.readLine();
                    }
                }catch(Exception e1){
                    System.exit(0);
                }
                user.setName(userInfo[0]);
                user.setEmail(userInfo[1]);
                user.setBirthYear(Integer.parseInt(userInfo[2]));
                System.out.println("수정되었습니다.");
                return users;
            }

        }
        System.out.println("수정할 회원이 없습니다.");
        System.out.println("");
        return users;
    }


}
