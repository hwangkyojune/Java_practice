import java.util.ArrayList;

public class OuterOfInnerMain {
    public static void main(String[] args) {
        OuterOfInner ooi = new OuterOfInner();
        OuterOfInner.Inner inner = ooi.new Inner();

        inner.SetValue(2);
        inner.addRv();

        System.out.println(inner.GetValue());



    }
}
