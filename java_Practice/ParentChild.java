public class ParentChild {
    public static void main(String[] args){
        Parent p1 = new Parent();
        Parent c1 = new Child();

        System.out.println(p1.i);
        p1.PrintI();
        System.out.println(c1.i);
        c1.PrintI();
    }
}
