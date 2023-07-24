public class DeviceMain {
    public static void main(String[] args) throws Exception{
        String className = "Computer";
        String[] con = new String[1] ;
        con[1] = "Samsung" ;
        Class clazz = Class.forName(className);
        Object c1 = clazz.newInstance();

    }
}
