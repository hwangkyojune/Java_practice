public class PersonTest3 {


    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "홍길동";
        p2.name = "조조";

        p1.printName();
        Person.printCount();
        Person.count ++;
        Person.printCount();
    }

}
