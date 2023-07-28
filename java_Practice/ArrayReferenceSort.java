import java.util.Arrays;
import java.util.Comparator;

//price기준으로 object를 정렬하고 싶다.
public class ArrayReferenceSort {
    public static void main(String[] args) {
            Item[] items = new Item[]{new Item("java",8000),new Item("python",5000),
                    new Item("C",6000),new Item("javaScript",7000)};
            Comparator c1 = new Comparator() {

                @Override
                public int compare(Object o1, Object o2) {
                    Item item1 = (Item)o1;
                    Item item2 = (Item)o2;
                    return item1.name.compareTo(item2.name);

                }
            };
            Arrays.sort(items,c1);
            for(Item item: items){
                System.out.println(item.getName()+item.getPrice());
            }
//            System.out.println(Arrays.toString(items));
    }

}

class Item implements Comparable{
    String name;
    int price;

    @Override
    public int compareTo(Object o) {
        Item item1 = (Item)o;
        return this.name.compareTo(item1.name) ;
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return ""+this.price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}