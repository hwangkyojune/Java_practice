public class UserExam {
    public static void main(String[] args){
        User user1 = new User("홍길동","a@a.com","1");
//        System.out.println(user1.getName());
//        System.out.println(user1.getPassword());
//        System.out.println(user1.getEmail());
        System.out.println(user1);

        User user2 = new User("비보","b@a.com");
//        System.out.println(user2.getName());
//        System.out.println(user2.getPassword());
//        System.out.println(user2.getEmail());

        System.out.println(user2);
    }
}
