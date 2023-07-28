public class GenericPracticeMain {
    public static void main(String[] args){
        Item item = new Item("아이폰14",1500000);
        GenericPractice<Item> g1 = new GenericPractice<>(item);
        Item item2 =g1.getObject();
        System.out.println(item2.name);
    }
}