import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserUi userUi = new UserUi();
        UserDao userDao = new UserDao("users.dat");
        List<User> users = userDao.loadUser();

        while(true){
            int menuId = userUi.menu();
            if(menuId == 5){
                userDao.saveUser(users);
                System.out.println("프로그램을 종료합니다.");
                System.exit(1);
            }else if(menuId == 1){
                User user = userUi.regUser();
                users.add(user);
            }else if(menuId == 2){
                userUi.userList(users);
            }
        }

    }
}
