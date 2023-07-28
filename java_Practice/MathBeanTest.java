public class MathBeanTest {
    public static void main(String[] args){
        MathBean math = new MathBean(); // 인스턴스는 heap 메모리에 올라간다.

        math.printClassName();
        math.printNumber(5000);
        int one = math.getOne();
        System.out.println(one);
        int plus = math.plus(2,3);
        System.out.println(plus);

    }
}
