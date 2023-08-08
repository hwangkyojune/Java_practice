import java.util.ArrayList;
import java.util.List;

public class OutNestedClassMain {
    public static void main(String[] args) {
        OutNestedClass.StaticNested osn = new OutNestedClass.StaticNested();
        osn.SetValue(1);
        System.out.println(osn.GetValue());

        List<OutNestedClass.StaticNested> array = new ArrayList<>();


    }
}
