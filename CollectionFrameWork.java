import java.util.*;


public class CollectionFrameWork {
    public static void main(String[] args){
        Map<String,Phone> items = new HashMap<>();

        Phone[] a = new Phone[4];

        a[0] = items.put("s1",new Phone("g21",15000000));
        a[1] = items.put("a1",new Phone("i14",14000000));
        a[2] = items.put("a2",new Phone("i14pro",18000000));
        a[3] = items.put("s2",new Phone("g21",15000000));

        System.out.println(items.size());

        System.out.println("return");
        Set<String> itemSet = items.keySet();
        Iterator<String> iter = itemSet.iterator();
        for(Phone b : a){
            System.out.print(b+"\t");
        }

        System.out.println("\nname");
        while(iter.hasNext()){
            String key = iter.next();
            Phone content = items.get(key);
            System.out.print(content+"\t");
        }

    }


}

class Phone{
    private String name;
    private int price;
    public Phone(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price && Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public int getPrice() {
        return price;
    }
}
